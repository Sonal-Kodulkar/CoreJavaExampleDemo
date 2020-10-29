package core_java.collectionframework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet();

    public void addElement() {
        linkedHashSet.add("Dkte");
        linkedHashSet.add("KIT");
        linkedHashSet.add("Perennial");
        linkedHashSet.add(null);
        linkedHashSet.add("Dkte");
    }

    public void removeElement() {
        linkedHashSet.remove("KIT");
        linkedHashSet.remove(null);
    }

    public void display() {
        Iterator itr = linkedHashSet.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + ", ");
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedHashSetDemo linkedHashSetDemo = new LinkedHashSetDemo();
        linkedHashSetDemo.addElement();
        System.out.println("Elements in LinkedHashSet");
        linkedHashSetDemo.display();
        linkedHashSetDemo.removeElement();
        System.out.println("LinkedHashSet after removing elements");
        linkedHashSetDemo.display();
    }

}
