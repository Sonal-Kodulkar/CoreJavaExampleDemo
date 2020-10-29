package core_java.java8Features;

import java.util.Optional;

public class OptionalClassExample {
    public static void main(String[] args) {

        String[] str = new String[10];
        str[5] = "Perennial Systems";

        // method 1 : ofNullable is a method to check practiceProblem.fibonacciesSeries.string is empty or not
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        System.out.println(checkNull);

        // Method 2: different methods to print practiceProblem.fibonacciesSeries.string
        System.out.println(checkNull.get());
        checkNull.ifPresent(System.out::println);

        //Method 3: check practiceProblem.fibonacciesSeries.string is present or not
        // case1 : If practiceProblem.fibonacciesSeries.string is present
        System.out.println("Output when practiceProblem.fibonacciesSeries.string is present");
        System.out.println("Value is present :" + checkNull.isPresent());

        // Case 2: If value is not present
        System.out.println("Output when practiceProblem.fibonacciesSeries.string is not present");
        Optional<String> checkNull1 = Optional.ofNullable(str[4]);
        System.out.println("Value is present :" + checkNull1.isPresent());

        //Method 4: Filter
        System.out.println("Output when practiceProblem.fibonacciesSeries.string is not equal");
        System.out.println("Filtered value:" + checkNull.filter(x -> x.equals("abc")));
        System.out.println("Output when practiceProblem.fibonacciesSeries.string is equal");
        System.out.println("Filtered value:" + checkNull.filter(x -> x.equals("Perennial Systems")));
    }
}
