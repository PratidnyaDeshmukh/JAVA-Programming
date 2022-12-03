import java.io.*;
import java.util.*;
public class FiboSeries
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter range for calculating Fibonacci series:");
        int num = scan.nextInt();
        System.out.println(fibseries(num));
    }
    static int fibseries(int num)
    {
        int t1 = 0;
        int t2 = 1, t3;
        for(int i=0 ; i<=num; i++)
        {
            System.out.print(t1+" ");
            t3=t1+t2;
            t1=t2;
            t2=t3;
        }
        return 0;
    }
}