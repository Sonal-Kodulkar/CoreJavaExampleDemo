package core_java.exception;

import java.io.FileNotFoundException;

public class MultiCatchException {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[6] = 30;
            arr[5] = 30 / 0;
            String z = null;
            System.out.println(z.length());

            arr[6] = 30;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound exception occure");
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic exception occure");
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");
        } catch (java.lang.Exception e) {
            System.out.println("other type of exception");
        }
    }
}
