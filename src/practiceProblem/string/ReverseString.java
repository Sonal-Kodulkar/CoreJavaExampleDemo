package practiceProblem.string;

public class ReverseString {
    String p = "Sonal", q ="";

    public void reverse() {
       int length = p.length();
        for (int i =length-1; i >=0; i--) {
            q = q + p.charAt(i);
        }
        System.out.println("String before reverse: "+ p);
        System.out.println("String after Reverse: "+ q);
        }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        reverseString.reverse();
    }
    }


