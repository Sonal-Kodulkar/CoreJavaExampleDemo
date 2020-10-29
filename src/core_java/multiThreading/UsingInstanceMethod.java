package core_java.multiThreading;

public class UsingInstanceMethod {
    public int count = 500;

    public void add(int value) {
        System.out.println("Add called");
        this.count += value;
        System.out.println(count);
    }

    public void subtract(int value) {
        System.out.println("subtract called");
        count -= value;
        System.out.println("Thread sleep");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Thread Awake");
        System.out.println(count);
    }
}

class ExecuteAdd implements Runnable {
    UsingInstanceMethod obj;

    ExecuteAdd(UsingInstanceMethod obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.add(200);
        obj.subtract(100);
    }
}
//class ExecuteSub extends UsingInstanceMethod implements Runnable
//{
//
//    @Override
//    public void run() {
//        System.out.println("In ExecuteSub class :" +Thread.currentThread());
//        subtract(100);
//    }
//}

class ExecuteInstanceMethode {
    public static void main(String[] args) {
        UsingInstanceMethod obj1 = new UsingInstanceMethod();
        ExecuteAdd executeAdd = new ExecuteAdd(obj1);
        Thread t1 = new Thread(executeAdd);
//        ExecuteSub executeSub = new ExecuteSub();
        Thread t2 = new Thread(executeAdd);
        t1.start();
        t2.start();
    }

}