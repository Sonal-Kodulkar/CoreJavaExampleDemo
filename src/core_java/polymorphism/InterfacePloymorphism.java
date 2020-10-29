package core_java.polymorphism;

interface InterfacePloymorphism {
    static void printable()                             // Static method must be define in interface and can't override in implementation class
    {
        System.out.println("Method from Interface");
    }

}
