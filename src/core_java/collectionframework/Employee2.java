package core_java.collectionframework;

import java.util.Objects;

public class Employee2 {
    private String name;
    private int age;
    private Integer salray;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return age == employee2.age;
//                &&
//                Objects.equals(name, employee2.name) &&
//                Objects.equals(salray, employee2.salray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getSalray() {
        return salray;
    }

    public void setSalray(Integer salray) {
        this.salray = salray;
    }

    public static void main(String[] args) {
        Employee2 e1 = new Employee2();
        Employee2 e2 = new Employee2();
        e1.setName("abc");
        e1.setAge(22);
        e1.setSalray(1000);
        e2.setName("abcd");
        e2.setAge(22);
        e2.setSalray(2000);
        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}
