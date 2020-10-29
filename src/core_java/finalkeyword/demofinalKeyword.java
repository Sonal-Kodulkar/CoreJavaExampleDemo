package core_java.finalkeyword;

public class demofinalKeyword {
    final int num = 10;

    final void changeValue() {
        System.out.println("Hello");
    }

}

class B extends demofinalKeyword {
    public void display() {
        int a;
        a = num + num;
        System.out.println(a);
    }

    public static void main(String[] args) {
        B t1 = new B();
        t1.display();
        t1.changeValue();
    }
}
