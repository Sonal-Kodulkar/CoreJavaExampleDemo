package core_java.mypackage2;

import core_java.mypackage1.BikePublic;

public class CarB extends BikePublic {
    public void printVariables() {
        // System.out.println(a); //  as it is default it can not access
        System.out.println(b);
        System.out.println(c);
        // System.out.println(d); // as it is private it can not access

    }

    public void modifyVariable() {
        b = 80;
        c = 90;
    }

    public CarB() {
        System.out.println("CarB constructor called");
    }

    public static void main(String[] args) {
        CarB carB = new CarB();
        carB.printVariables();
        carB.modifyVariable();

        // System.out.println(carB
        // .a);
//        System.out.println(carB.b);
//        System.out.println(carB.c);
//        System.out.println(carB.getD());
        carB.printVariables();
    }

}
