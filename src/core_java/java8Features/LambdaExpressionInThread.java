package core_java.java8Features;

public class LambdaExpressionInThread {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println(Thread.currentThread());
        };
        Thread t1 = new Thread(r);
        t1.start();
    }
}
