package core_java.multiThreading;

import java.util.Scanner;

public class CallRunForBanking implements Runnable {
    AddAmount addAmount;
    Scanner s = new Scanner(System.in);

    public CallRunForBanking(AddAmount obj) {
        this.addAmount = obj;
    }

    @Override
    public synchronized void run() {
        System.out.println("You want to add money then enter 1");
        System.out.println("You want to withdraw money then enter 2");
        int result = s.nextInt();
        if (result == 1) {
            addAmount.add();
        }
        if (result == 2) {
            addAmount.withdraw();
        }


    }
}
