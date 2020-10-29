package core_java.multiThreading;

public class ExecuteBank {
    public static void main(String[] args) {
        AddAmount a1 = new AddAmount();
        CallRunForBanking b1 = new CallRunForBanking(a1);
        Thread t1 = new Thread(b1);

        //  Thread t2 = new Thread(b1);
        t1.start();
        //  t2.start();
    }
}
