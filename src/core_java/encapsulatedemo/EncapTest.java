package core_java.encapsulatedemo;

public class EncapTest {
    private String name = "DKTE";

    public String setString() {
        return name;
    }

    public String getString() {
        this.name = "KIT";
        System.out.println(name);
        return name;
    }

}

class Test {
    public static void main(String[] args) {
        EncapTest t = new EncapTest();
        t.getString();
    }
}