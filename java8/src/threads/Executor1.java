package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Executor1 {

    public static int counter = 0;

    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();

            //submit will spawn a new thread and do the job
            Future<?> result = service.submit(() -> {

                System.out.println("about to start while loop");
//                while(true)
//                {
//
//                    System.out.println("Hi");
//                }
            });

            System.out.println("Now calling get");
            //result.get(10, TimeUnit.SECONDS);
            System.out.println("Reached");

        } catch (Exception e) {
            System.out.println("Timeout Reached");
            service.shutdownNow();
        } finally {
            service.shutdown();
        }
    }
}
