package practiceProblem.fibonacciesSeries;


public class RecursiveVersion {
    public int c=0,a=0,b=1;

    public void add(int d)
    {
        if(d-1>0) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            d--;
            add(d);
        }

    }
}
