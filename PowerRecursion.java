import java.io.*;
import java.util.*;
import static java.lang.Math.pow;
public class PowerRecursion
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number = ");
		double a= s.nextDouble();
		System.out.println("Enter Power = ");
		double b= s.nextDouble();
		System.out.println("Power=" +numpower(a, b));
	}
	public static int numpower(double a, double b )
		{
		    return(int) Math.pow(a, b);
		}
}