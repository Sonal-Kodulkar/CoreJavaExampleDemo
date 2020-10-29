package core_java.multiThreading;

public class ExtendThreadAndJoinMethod extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
//            try {
//                sleep(100);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
        }
    }

    public static void main(String[] args) {
        ExtendThreadAndJoinMethod obj1 = new ExtendThreadAndJoinMethod();
        ExtendThreadAndJoinMethod obj2 = new ExtendThreadAndJoinMethod();
        obj1.start();
        try {
            obj1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        obj2.start();
    }
}
