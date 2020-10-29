package core_java.exception;

import java.io.FileNotFoundException;

public class Exception extends Throwable {
    int x = 10;
    int y = 0, z;

    public void division() throws FileNotFoundException {
        try {
            z = x / y;
            System.out.println("Value of z is:" + z);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        display();
        System.out.println("hello");
    }

    public void display() throws FileNotFoundException {
        System.out.println("welcome");
        throw new FileNotFoundException();
    }

    public void display2() {
        System.out.println("welcome");
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        Exception uncheck = new Exception();
        try {
            uncheck.division();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
