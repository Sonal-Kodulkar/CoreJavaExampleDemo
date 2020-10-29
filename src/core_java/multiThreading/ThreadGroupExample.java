package core_java.multiThreading;

import java.lang.ThreadGroup;

public class ThreadGroupExample implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        ThreadGroupExample threadGroupExample = new ThreadGroupExample();
        ThreadGroup threadGroup = new ThreadGroup("Parent");

        Thread t1 = new Thread(threadGroup, threadGroupExample, "one");
        Thread t2 = new Thread(threadGroup, threadGroupExample, "two");
        Thread t3 = new Thread(threadGroup, threadGroupExample, "three");
        t3.start();
        t2.start();
        t1.start();
        System.out.println(threadGroup.getName());
    }
}