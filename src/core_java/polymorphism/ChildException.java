package core_java.polymorphism;

import java.io.FileNotFoundException;

class ChildException extends ParentException {
    @Override
    //Example 1 : If parent class method does not throw an exception then child class method does not declare
    // checked exception and it is able to declare unchecked exception.
    public void displayException() throws ArithmeticException {
        System.out.println("this method throw unchecked exception");
    }

    // Example 2: Here we override method present in parent class
    public void displayException2() throws FileNotFoundException {
        System.out.println("Exception handle by child");
        throw new FileNotFoundException();
    }

    // Example 3: Here we are handling exception thrown by displayException3
    public void exceptionHandel() {
        try {
            displayException3();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Exception thrown by parent class method and handle in child class and access by child class object");
        }
    }
}
