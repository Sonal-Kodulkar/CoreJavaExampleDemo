package core_java.polymorphism;

import java.io.FileNotFoundException;

public class ParentException {
    // Example1: parent class does not declare any exception
    public void displayException() {
        System.out.println("parent displayException");

    }

    //Example 2: If both parent and child method override
    public void displayException2() throws FileNotFoundException {
        System.out.println("Exception handle by parent");
        throw new FileNotFoundException();
    }

    //Example 3 : Throw Exception which is handle by a method in child class
    public void displayException3() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

}
