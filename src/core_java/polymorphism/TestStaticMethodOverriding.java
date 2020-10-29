package core_java.polymorphism;

public class TestStaticMethodOverriding {

    public static void main(String[] args) {
        ParentStaticMethod parentStatic = new ParentStaticMethod();
        ChildStaticMethod childStatic = new ChildStaticMethod();
        ParentStaticMethod parenStatic1 = new ChildStaticMethod();
        //Method Overriding
        System.out.println("Case 1 output (Method is non-static");
        parentStatic.display();
        childStatic.display();
        parenStatic1.display();
        //Method Hiding
        System.out.println("Case 2 output (Method is Static)");
        parentStatic.displayStatic();
        childStatic.displayStatic();
        parenStatic1.displayStatic();
        System.out.println("Case 3 output (Different methods in parent and child class)");
        parentStatic.onlyParent();
        childStatic.onlyChildMethod();
        parenStatic1.onlyParent();
        //parenStatic1.onlyChild();


    }

}
