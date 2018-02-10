package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {

    public static void main(String[] args) {

        ExecutorService service = null;

        try {

            service = Executors.newSingleThreadExecutor();

            service.execute(() -> {
                System.out.println("I m thread 1");
            });


            service.execute(() -> {
                System.out.println("I m thread 2");
            });
        } finally {

            if (service != null) {
                service.shutdown();
            }

        }

    }

}
