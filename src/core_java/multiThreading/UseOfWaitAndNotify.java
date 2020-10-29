package core_java.multiThreading;

public class UseOfWaitAndNotify extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        UseOfWaitAndNotify t1 = new UseOfWaitAndNotify();
        UseOfWaitAndNotify t2 = new UseOfWaitAndNotify();
        t1.start();
        t2.start();
        System.out.println("Thread name:" + t1.getName());
        try {
            t2.notify();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Thread name:" + t2.getName());

    }
}
