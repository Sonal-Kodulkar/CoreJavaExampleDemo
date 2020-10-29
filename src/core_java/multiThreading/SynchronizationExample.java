package core_java.multiThreading;


// A Class used to send a message
public class SynchronizationExample {
    int count = 0;

    public synchronized void increment() {
        count++;
        //System.out.println(count);
    }

}

class execute extends Thread {
    public static void main(String[] args) throws InterruptedException {
        SynchronizationExample sync = new SynchronizationExample();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                for (int i = 0; i < 5; i++) {
                    sync.increment();
                    System.out.println(Thread.currentThread());
                    // System.out.println(sync.count);
                }
            }
        });

        //System.out.println(currentThread());
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public synchronized void run() {
                for (int i = 0; i < 5; i++) {
                    sync.increment();
                    // System.out.println(sync.count);
                }
            }
        });
        thread1.start();
        thread2.start();
//         thread1.join();
//         thread2.join();
        System.out.println(sync.count);
    }
}


