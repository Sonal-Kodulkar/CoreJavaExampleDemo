package core_java.collectionframework;

public class Employee {
    String name;
    String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Employee emp = (Employee) obj;
        return name.equals(emp.name) && surname.equals(emp.surname);
    }


    public static void main(String[] args) {
        // Case 1 : Two objects having different content
        Employee employee1 = new Employee("Sonal", "Kodulkar");
        Employee employee2 = new Employee("Manish", "Rane");
        System.out.println("HashCode of object 1:" + employee1.hashCode());
        System.out.println("HashCode of object 2:" + employee2.hashCode());
        System.out.println("Object1 and Object2 are eual or not status:" + employee1.equals(employee2));

        // Case 2: Two object with same content
        Employee employee3 = new Employee("Sonal", "Kodulkar");
        Employee employee4 = new Employee("Sonal", "Kodulkar");
        System.out.println("HashCode of object 1:" + employee3.hashCode());
        System.out.println("HashCode of object 2:" + employee4.hashCode());
        System.out.println("Object1 and Object2 are eual or not status:" + employee3.equals(employee4));


    }
}
