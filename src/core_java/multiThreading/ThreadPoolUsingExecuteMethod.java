package core_java.multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolUsingExecuteMethod {
    public static void main(String[] args) {
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        executorService1.execute(new Runnable() {
            public void run() {
                System.out.println("running");
            }
        });


        ExecutorService executorService2 = Executors.newFixedThreadPool(5);
        executorService2.execute(new Runnable() {
            public void run() {
                System.out.println("asynchronous task");
            }
        });

        executorService2.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("executing task1 ");
            }
        });


        executorService2.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("executing task 2 ");
            }
        });


        executorService2.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("executing task 3 ");
            }
        });

        executorService2.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("executing task 4 ");
            }
        });
        executorService2.shutdown();


    }
}
