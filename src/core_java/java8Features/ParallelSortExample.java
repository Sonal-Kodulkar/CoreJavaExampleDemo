package core_java.java8Features;

import java.util.Arrays;

public class ParallelSortExample {


    public static void main(String[] args) {
        int[] arr = {90, 24, 56, 73, 41, 35, 10, 45};
        //Case 1 : Sort all the elements of array
        Arrays.parallelSort(arr);
        System.out.println("Elements after sorting:");
        Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // Case2 : Sort the element in between start and end index
        int[] arr1 = {90, 24, 56, 73, 41, 35, 10, 45};
        Arrays.parallelSort(arr1, 2, 5);
        System.out.println("Elements after sorting with start and end index");
        Arrays.stream(arr1).forEach(n -> System.out.print(n + " "));

    }
}
