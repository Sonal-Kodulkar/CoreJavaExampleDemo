package practiceProblem.fibonacciesSeries;

import java.util.Scanner;

public class IterativeVersion {
    public int a=0,b=1,c,n;
    Scanner sc = new Scanner(System.in);

    public void getNumber()
    {
        System.out.println("Enter a number of terms:");
        n=sc.nextInt();
    }

    public void getFibonacciSeries()
    {
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<=n-1;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}

