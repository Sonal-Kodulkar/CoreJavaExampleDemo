package core_java.collectionframework;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
    Hashtable<String, Integer> hashTable = new Hashtable<String, Integer>();

    public void addElement() {
        hashTable.put("college", 50);
        hashTable.put("Student", 100);
        hashTable.put("City", 200);

        // Case1 : Same key different value
        hashTable.put("city", 300);                                  // It is allowed to store duplicate key with different value

        // Case 2 : Same key and same value
        hashTable.put("student", 100);                               // It is allowed to store duplicate key and value as well

        // Case 3 : Store null value                                  // HashTable will not allowed any null key and value
        //hashTable.put(null,0);
        // hashTable.put("nullValue",null);
    }

    public void fetchKey() {
        System.out.println(hashTable.get("college"));

        // Case 4 : to fetch duplicate key
        System.out.println(hashTable.get("city"));                           // It will return the  2nd value
        // Case 5 : Accessing the key which is not present in HashTable
        System.out.println(hashTable.get("Ichalkaranji"));                  // It will return null value
    }

    // we can use enumeration method to iterate hashTable
    public void display() {
        Enumeration e = hashTable.elements();
        System.out.println("display values:");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }

    public void display1() {
        System.out.println(hashTable);
    }

    public static void main(String[] args) {
        HashTableDemo hashTableDemo = new HashTableDemo();
        hashTableDemo.addElement();
        System.out.println("HashTable after adding elements:");
        hashTableDemo.display1();
        System.out.println("Fetched Elements are: ");
        hashTableDemo.fetchKey();

    }


}
