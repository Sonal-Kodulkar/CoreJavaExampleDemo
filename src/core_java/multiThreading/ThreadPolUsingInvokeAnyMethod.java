package core_java.multiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPolUsingInvokeAnyMethod {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Callable<Integer>> list = new ArrayList<Callable<Integer>>();

        list.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 10;
            }
        });

        list.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 100;
            }
        });

        list.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1000;
            }
        });

//        int result = executorService.invokeAny(list);
//        System.out.println(result);

        List<Future<Integer>> futures = executorService.invokeAll(list);
        futures.get(0).get();
        for (Future<Integer> future : futures) {
            System.out.println("future.get = " + future.get());
        }
    }
}
