package core_java.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
    ArrayList<Integer> arr = new ArrayList();

    public void addElement() {
        arr.add(100);
        arr.add(200);
        arr.add(300);
        arr.add(400);
        arr.add(null);
        arr.add(null);
    }

    public void fetchElement() {
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));
        //System.out.println("fetch element which is not present:"+arr.get(10));          // It will throw exception
        //System.out.println(arr.get(null));                                             // get method can not applied to null
    }

    // Method to catch null
    public void display() {
        Iterator itr = getitr();
        if (itr != null) {
            while (itr.hasNext())
                System.out.print(itr.next() + ", ");
            System.out.println();
        }
    }

    private Iterator getitr() {
        return null;
    }

    // example 1 : Method to traverse the array.
    public void displayArray() {
        for (Integer i : arr) {
            System.out.println(i);
        }
    }

    // Example 2 : to display elements in array
    public void displayArray2() {
        System.out.println(arr);
    }

    // Example 3: using for loop
    public void displayUsingfor() {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        arr.stream().forEach(a -> System.out.println(a));
    }

    //Example 4: Using ListIterator
    public void displayUsingListIterator() {
        ListIterator ltr = arr.listIterator();
        while (ltr.hasNext()) {
            System.out.println(ltr.next());
        }
    }


    public static void main(String[] args) {
        ArrayListDemo arrayListDemo = new ArrayListDemo();
        arrayListDemo.addElement();
        System.out.println("Elements in ArrayList");
        arrayListDemo.displayArray();
        System.out.println("Fetched elements");
        arrayListDemo.fetchElement();
        arrayListDemo.displayArray2();
        System.out.println("Display elements in arrayList using for loop");
        arrayListDemo.displayUsingfor();
        System.out.println("Display elements in arrayList using ListIterator");
        arrayListDemo.displayUsingListIterator();

    }
}
