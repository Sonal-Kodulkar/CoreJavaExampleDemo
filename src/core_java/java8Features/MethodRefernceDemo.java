package core_java.java8Features;

public class MethodRefernceDemo {
    public static void display1() {
        System.out.println("Using static method");
    }

    public void display3() {
        System.out.println("using non static method");
    }

    public MethodRefernceDemo() {
        System.out.println("using constructor");
    }

    public static void main(String[] args) {
        MethodReferenceExample demo = MethodRefernceDemo::display1;
        demo.display();

        MethodInterFaceOfInstanceMethod demo1 = new MethodRefernceDemo()::display3;
        demo1.display2();

        MethodInterFaceOfInstanceMethod demo3 = MethodRefernceDemo::new;
        demo1.display2();
    }
}
