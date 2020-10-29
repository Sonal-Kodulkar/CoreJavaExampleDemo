package core_java.polymorphism;

class ChildStaticMethod extends ParentStaticMethod {
    // Case1

    public void display() {
        System.out.println("output from child class");
    }

    // Case2
    public static void displayStatic() {
        System.out.println("output from child class");
    }

    // Case 3
    public void onlyChildMethod() {
        System.out.println("Only child method");
    }
}
