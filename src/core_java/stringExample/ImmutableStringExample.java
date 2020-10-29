package core_java.stringExample;

import java.lang.String;
import java.sql.SQLOutput;

public class ImmutableStringExample {
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = "Ratan";

        String s4 = new String("Ram");
        String s5 = new String("Ram");
        String s6 = new String("raman");

        System.out.println("output of equal method");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("using new keyword:" + s4.equals(s5));
        System.out.println(s4.equals(s6));

        System.out.println("output of == operator");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println("using new keyword:" + s4 == s5);

        System.out.println("output of compareTo method");
        System.out.println(s1.compareTo(s2));                   //0
        System.out.println(s1.compareTo(s3));                   //1(because s1>s3)
        System.out.println(s3.compareTo(s1));                   //-1(because s3 < s1 )
    }

}




