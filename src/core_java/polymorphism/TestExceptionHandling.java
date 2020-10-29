package core_java.polymorphism;

public class TestExceptionHandling {
    public static void main(String[] args) {
        ParentException parent = new ParentException();
        ChildException child = new ChildException();
        ParentException parent1 = new ParentException();

        // Example 1 result
        parent.displayException();
        child.displayException();
        parent1.displayException();
        System.out.println("Output of 2nd example");

        // Example 2 result: Override the method and handle by using object
        System.out.println("Exception Handle by parent object");
        try {
            parent.displayException2();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Exception Handle by child object");
        try {
            child.displayException2();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Exception handle by child class object which is reference of parent");
        try {
            parent1.displayException2();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Result of example 3");
        //parent.displayException3();               // It gives error bcz exception thrown by displayException method and not handle in that method itself
        child.exceptionHandel();
        //child.displayException3();               // It gives error bcz exception thrown by displayException method and not handle in that method itself
        //parent1.displayException3();            // As parent1 is reference of parent class so it can access method of parent class only

    }
}


