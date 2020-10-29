package core_java.multiThreading;

import java.util.concurrent.*;

public class ThreadPoolUsingSubmitMethod {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Case 1 :Using submit runnable() method
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new Runnable() {

            @Override
            public void run() {
                System.out.println("Execute Service1");

            }
        });


        // Case 2 :Using Submit callable
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        Future future = executorService1.submit(new Callable() {

            @Override
            public Object call() {
                System.out.println("Execute Service2");
                return "Execute successfully";

            }
        });
        System.out.println(future.get());
        executorService1.shutdown();
    }
}
