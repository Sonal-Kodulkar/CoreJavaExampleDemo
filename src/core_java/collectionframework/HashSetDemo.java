package core_java.collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    // HashSet for a Integer data
    HashSet<Integer> hashSetInt = new HashSet();

    public void addIntElement() {
        boolean add = hashSetInt.add(10);
        System.out.println(add);
        hashSetInt.add(20);
        hashSetInt.add(30);
        // Case1 : adding null element.
        hashSetInt.add(null);
        // Case 2 : adding duplicate element                        // Adding duplicate elements in HashSet is not allowed
        boolean add1 = hashSetInt.add(10);
        System.out.println(add1);
    }

    public void removeValue() {
        System.out.println(hashSetInt.remove(10));
        System.out.println(hashSetInt.remove(40));              // As 40 is not present in a HashSet it will return false
    }

    // Example 1 : Using Iterator
    public void displayInt() {
        Iterator itr = hashSetInt.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + ", ");
        System.out.println();
    }

    // Example 2: Using Enhanced for loop
    public void display1() {
        for (Integer i : hashSetInt) {
            System.out.println(i);
        }
    }

    // Example 3: Using
    public void display2() {
        hashSetInt.forEach(System.out::println);
    }


    // HashSet for a float values
    HashSet<Float> hashSetFloat = new HashSet();

    public void addFloatElement() {
        hashSetFloat.add(16.8f);
        hashSetFloat.add(16.7f);
        hashSetFloat.add(12.309f);
    }

    public void displayfloat() {
        Iterator itr = hashSetFloat.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + ", ");
        System.out.println();
    }


    public static void main(String[] args) {
        HashSetDemo hashSetDemo = new HashSetDemo();
        hashSetDemo.addIntElement();
        System.out.println("Integer values in HashSet");
        hashSetDemo.displayInt();
        hashSetDemo.addFloatElement();
        System.out.println("Float values in HashSet");
        hashSetDemo.displayfloat();
        System.out.println("Status of removed element");
        hashSetDemo.removeValue();
        System.out.println("Elements after removing Integer elements");
        hashSetDemo.displayInt();
        System.out.println("Using Enhanced for loop");
        hashSetDemo.display1();
        System.out.println("Using forEach method");
        hashSetDemo.display2();
    }
}
