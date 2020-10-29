package core_java.java8Features;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {

        //Case 1: Simple add , in between Strings
        StringJoiner joinName = new StringJoiner(",");
        joinName.add("Perennial");
        joinName.add("System");
        joinName.add("pune");
        System.out.println(joinName);

        //Case 2 : Add prefix and post fix
        StringJoiner joinName1 = new StringJoiner(",", "[", "]");
        joinName1.add("City");
        joinName1.add("Ichalkaranji");
        joinName1.add("416115");
        System.out.println(joinName1);

        // case 3: Merge to practiceProblem.fibonacciesSeries.string
        StringJoiner mergeString = joinName.merge(joinName1);
        System.out.println("Merged practiceProblem.fibonacciesSeries.string are:" + mergeString);

        // Case 4: Calculate length of practiceProblem.fibonacciesSeries.string
        int length1 = joinName.length();
        System.out.println("Length of first String set:" + length1);
        int length2 = joinName1.length();
        System.out.println("Length of Second String set:" + length2);

        // Case 5 : Find a character at particular number
        String str = joinName.toString();
        char x = str.charAt(45);
        System.out.println("Character at 5th place is:" + x);
    }
}
