package core_java.stringExample;

public class StringConcatenationExample {
    public static void main(String[] args) {
        String s1 = "perennial";
        String s2 = "System";
        String s = s1.concat(s2);
        System.out.println(s);
        System.out.println("String in upper case:" + s1.toUpperCase());
        System.out.println("String in lower case:" + s1.toLowerCase());
        System.out.println("To check practiceProblem.fibonacciesSeries.string starts with sy:" + s2.startsWith("Sy"));
        System.out.println("To check practiceProblem.fibonacciesSeries.string end with em:" + s2.endsWith("em"));
        System.out.println("From practiceProblem.fibonacciesSeries.string s1 character at 4th place: " + s1.charAt(4));
        System.out.println("String s1 length is: " + s1.length());
        String s3 = s1.intern();
        System.out.println(s3);
    }
}
