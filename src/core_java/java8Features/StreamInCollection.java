package core_java.java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import java.util.stream.Collectors;

public class StreamInCollection {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1000);
        arr.add(1998);
        arr.add(500);
        arr.add(300);
        System.out.println("Elements in array:" + arr);
        System.out.println(arr.stream().filter(x -> x > 500).collect(Collectors.toList()));


    }
}
