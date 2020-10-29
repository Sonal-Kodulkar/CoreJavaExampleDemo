package core_java;

public class CheckConstructorOrStaticMethod {
    public CheckConstructorOrStaticMethod()
    {
        System.out.println("Constructor called");
    }
    public static void display()
    {
        System.out.println("Static method called");
    }

    public static void main(String[] args) {
        CheckConstructorOrStaticMethod obj = new CheckConstructorOrStaticMethod();
        display();
    }
}
