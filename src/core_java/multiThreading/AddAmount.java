package core_java.multiThreading;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AddAmount {
    int balance = 1000, amount;
    Scanner s = new Scanner(System.in);


    public void add() {
        System.out.println("Enter a pin");
        int pin = s.nextInt();
        System.out.println(pin);
        try {
            if (pin == 123) {
                System.out.println("Enter a amount you want to add:");
                amount = s.nextInt();
                System.out.println("Amount added successfully");
                balance = balance + amount;
                System.out.println("Total balance= " + balance);
            } else {
                System.out.println("Wrong pin!" + "Enter a pin again");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void withdraw() {
        System.out.println("Enter a pin");
        int pin = s.nextInt();
        try {
            if (pin == 123) {
                System.out.println("Enter a amount you want to withdraw :");
                amount = s.nextInt();
                balance = balance - amount;
                System.out.println("Amount withdraw successfully");
                System.out.println("Remaining balance= " + balance);
            } else {
                System.out.println("Wrong pin!" + "Enter a pin again");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
