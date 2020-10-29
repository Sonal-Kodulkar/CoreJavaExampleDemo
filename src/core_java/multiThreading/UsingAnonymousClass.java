package core_java.multiThreading;

public class UsingAnonymousClass {
    public static void main(String[] args) {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("running..");
            }
        };
        t1.start();

        Thread t2 = new Thread() {
            public void run() {
                System.out.println("welcome");
            }
        };
        t2.start();
    }
}
