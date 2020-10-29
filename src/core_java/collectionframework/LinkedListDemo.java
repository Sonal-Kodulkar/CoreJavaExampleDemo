package core_java.collectionframework;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();

    public void addElement() {
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(10);
        linkedList.add(null);
    }

    public void fetchElement() {
        System.out.println(linkedList.remove(1));
        System.out.println(linkedList.remove(2));
    }

    public void display() {
        ListIterator ltr = linkedList.listIterator();
        while (ltr.hasNext()) {
            System.out.println(ltr.next());
        }
    }

    public static void main(String[] args) {
        LinkedListDemo linkedListDemo = new LinkedListDemo();
        linkedListDemo.addElement();
        System.out.println("Elements in practiceProblem.fibonacciesSeries.LinkedList");
        linkedListDemo.display();
        System.out.println("Removed elements are");
        linkedListDemo.fetchElement();
        System.out.println("Elements after removing elements from practiceProblem.fibonacciesSeries.LinkedList ");
        linkedListDemo.display();
    }

}
