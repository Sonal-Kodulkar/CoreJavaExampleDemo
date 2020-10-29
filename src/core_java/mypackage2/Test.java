package core_java.mypackage2;

public class Test {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();
        parent1.printX();
        parent2.printX();
        Child child1 = new Child();
        child1.printX();
        parent2.printParent();
        parent2.parentMethod();

    }
}
