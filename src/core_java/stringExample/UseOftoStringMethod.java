package core_java.stringExample;

public class UseOftoStringMethod {
    String name;
    String mobile_number;

    public UseOftoStringMethod(String name, String mobile_number) {
        this.name = name;
        this.mobile_number = mobile_number;
    }

    @Override
    public String toString() {
        return name + " " + mobile_number;
    }

    public static void main(String[] args) {
        UseOftoStringMethod s1 = new UseOftoStringMethod("ram", "12345678");
        UseOftoStringMethod s2 = new UseOftoStringMethod("raman", "123456789");
        System.out.println(s1);
        System.out.println(s2);
    }

}
