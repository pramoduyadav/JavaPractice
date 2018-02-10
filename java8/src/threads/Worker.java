package threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Worker implements Runnable {
    private List<String> outputScraper;
    private CountDownLatch countDownLatch;

    public Worker(List<String> outputScraper, CountDownLatch countDownLatch) {
        this.outputScraper = outputScraper;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        //doSomeWork();
        outputScraper.add("Counted down");
        countDownLatch.countDown();
    }


    public static void whenParallelProcessing_thenMainThreadWillBlockUntilCompletion()
            throws InterruptedException {

        List<String> outputScraper = Collections.synchronizedList(new ArrayList<>());
        CountDownLatch countDownLatch = new CountDownLatch(5);
        List<Thread> workers = Stream
                .generate(() -> new Thread(new Worker(outputScraper, countDownLatch)))
                .limit(5)
                .collect(toList());

        workers.forEach(Thread::start);
        countDownLatch.await();
        outputScraper.add("Latch released");
        outputScraper.forEach(e -> System.out.println(e.toString()));

//        assertThat(outputScraper)
//                .containsExactly(
//                        "Counted down",
//                        "Counted down",
//                        "Counted down",
//                        "Counted down",
//                        "Counted down",
//                        "Latch released"
//                );

    }

    public static void main(String[] args) {
        try {
            whenParallelProcessing_thenMainThreadWillBlockUntilCompletion();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
