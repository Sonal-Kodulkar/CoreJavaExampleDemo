package core_java.collectionframework;

import java.util.*;

public class CollectionVector {


    public static void main(String args[]) {
//            Vector<String> v=new Vector<String>();
//            v.add("Ayush");
//            v.add("Amit");
//            v.add("Ashish");
//            v.add("Garima");
//            Iterator<String> itr=v.iterator();
//            while(itr.hasNext()){
//                System.out.println(itr.next());
        //        }
        Vector vector = new Vector();
        vector.add(10);
        vector.add("sonal");
        Iterator i1 = vector.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
    }
}
