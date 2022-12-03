import java.io.*;
import java.util.*;
import java.lang.*;
class SumDigit
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number=");
		int num = scan.nextInt();	
		System.out.println("Sum of Entered Digit is= "+sum(num));	
	}
	static int sum(int num)
	{
		if(num == 0)
		{
			return 0;
		}
		else
		{
			return((num % 10) +(num / 10));
		}
	}
}

