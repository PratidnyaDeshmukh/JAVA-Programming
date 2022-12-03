import java.io.*;
import java.util.*;
public class NumProductRecursion
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Num1");
		int a = scan.nextInt();
		System.out.println("Enter Num2");
		int b = scan.nextInt();
		System.out.println("Product of "+ a +"and"+ b +"is"+getProduct(a,b));
	}

	static int getProduct(int a, int b)
	{
		int res;
		int num1 = a;
		int num2 = b;
		res = num1 * num2;
		return res;
	}
	
}