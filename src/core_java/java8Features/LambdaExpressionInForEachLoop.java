package core_java.java8Features;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionInForEachLoop {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        arr.forEach((n) -> System.out.println(n));
    }

    ;
}
