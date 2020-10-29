package core_java.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

    //Method 1: Insert data into Hashmap.
    public void insertionOperation() {
        String s = hashMap.put(10, "Perennial");
        System.out.println(s);
        hashMap.put(02, "Systems");
        hashMap.put(03, "Pune");
        hashMap.put(00, "Kolhapur");
        // Case1 : Store null value
        hashMap.put(20, null);

        // Case2 : Same key different value
        String s1 = hashMap.put(10, "Kolhapur");                    // It will replace perennial with Ichalkaranji
        System.out.println(s1);
        // Case3 : Same key and Same value
        hashMap.put(02, "Systems");                                  // It also replace. So duplicate elements are not allowed.
    }

    // Method 2: Insert null key and null value
    public void insertNulKey() {
        hashMap.put(null, "Ichalkaranji");
        // hashMap.put(null, "2nd null key");                               // This null key replace the 1st null key
        hashMap.put(null, "pune");
    }


    //Method 3: Fetch the data using key
    public void fetchDataUsingKey() {
        System.out.println(hashMap.get(10));
        System.out.println(hashMap.get(02));
        System.out.println("fetch null key:" + hashMap.get(null));
        System.out.println("fetch null value:" + hashMap.get(20));
        System.out.println("Fetch the key which is not present in HashMap:" + hashMap.get(30));           // If we try to fetch the key which is not available in hashmap then it return the null element
    }

    //Example 1: To display elements of map
    public void displayHashMap() {
        System.out.println(hashMap);
    }

    // Example 2: Display element using  entrySet method , keySet method , ValueSet Method
    public void DisplayUsingEntrySet() {
        System.out.println(hashMap.entrySet());
        System.out.println("Keys from hashMap");
        System.out.println(hashMap.keySet());
        System.out.println("Values from HashMap");
        System.out.println(hashMap.values());
    }

    //Example 3: Display elements using enhanced for loop
    public void secondMethod() {
        for (Map.Entry<Integer, String> s2 : hashMap.entrySet()) {
            System.out.println("Key=" + s2.getKey() + " " + "value=" + s2.getValue());
        }

    }


    public static void main(String[] args) {
        HashMapDemo hashMapDemo = new HashMapDemo();
        System.out.println("Elements added in a HasMap");
        hashMapDemo.insertionOperation();
        hashMapDemo.displayHashMap();
        hashMapDemo.insertNulKey();
        System.out.println("HashMap after adding null key");
        hashMapDemo.displayHashMap();
        System.out.println("Using entrySet method");
        hashMapDemo.secondMethod();
//        System.out.println("Fetched elements");
//        hashMapDemo.fetchDataUsingKey();
    }
}
