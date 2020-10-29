package core_java.java8Features;

import java.util.stream.Stream;
import java.util.stream.*;

public class StreamIterateExample {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 1)
                .filter(a -> a % 2 == 0)
                .limit(20)
                .forEach(System.out::println);


    }
}
