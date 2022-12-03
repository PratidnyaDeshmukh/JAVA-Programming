import java.io.*;
import java.math.*;
import java.util.*;
class Prime{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Num:");
		BigInteger num = scan.nextBigInteger();
		if(num.isProbablePrime(1))
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Composite");
		}
	}
}