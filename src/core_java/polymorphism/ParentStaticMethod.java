package core_java.polymorphism;

public class ParentStaticMethod {
    // Case1
    public void display() {
        System.out.println("output from parent class");
    }

    // Case2
    public static void displayStatic() {
        System.out.println("output from parent class");
    }

    // case 3
    public void onlyParent() {
        System.out.println("Only parent method");
    }
}
