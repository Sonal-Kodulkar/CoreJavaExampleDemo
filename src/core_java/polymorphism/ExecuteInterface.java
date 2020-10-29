package core_java.polymorphism;

public class ExecuteInterface {
    public static void main(String[] args) {
        ImplementInterface interface1 = new ImplementInterface();
        interface1.methodFromImplementClass();
        InterfacePloymorphism.printable();                  // we have to call static method from interface class using reference of interface class
    }
}
