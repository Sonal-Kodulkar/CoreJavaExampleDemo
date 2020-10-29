package core_java.stringExample;

public class stringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Perennial");
        // Method 1: append() - concatenates the given argument with this practiceProblem.fibonacciesSeries.string
        sb.append("System");
        System.out.println("Initial Capacity of practiceProblem.fibonacciesSeries.string: " + sb.capacity());
        System.out.println("Output of append method: " + sb);

        // Method 2 :insert()- inserts the given practiceProblem.fibonacciesSeries.string with this practiceProblem.fibonacciesSeries.string at the given position
        sb.insert(0, "Pune");
        System.out.println(sb);

        // Method 3: replace() - replaces the given practiceProblem.fibonacciesSeries.string from the specified beginIndex and endIndex.
        sb.replace(1, 3, "java");
        System.out.println("Output of StringBuffer after replcae method: " + sb);

        // Method 4: delete() - deletes the practiceProblem.fibonacciesSeries.string from the specified beginIndex to endIndex
        sb.delete(0, 6);
        System.out.println(sb);

        sb.append("Ichalkaranji");
        sb.append("Pune");
        System.out.println(sb);
        System.out.println("Capacity of practiceProblem.fibonacciesSeries.string: " + sb.capacity());
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());
    }

}
