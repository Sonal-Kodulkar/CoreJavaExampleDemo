package core_java.multiThreading;

public class ImplementRunnable implements Runnable {
    public void run() {

        System.out.println("running...");
    }

    public static void main(String args[]) {
        ImplementRunnable t1 = new ImplementRunnable();
        ImplementRunnable t2 = new ImplementRunnable();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t1);
        System.out.println("Name of t1:" + thread1.getName());
        thread1.start();
        System.out.println("Name of t2:" + thread2.getName());
        thread2.start();
    }
}

