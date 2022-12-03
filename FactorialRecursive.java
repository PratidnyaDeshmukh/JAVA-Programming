import java.io.*;
import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number=");
		int num = scan.nextInt();
		System.out.println("Factorial of"+" "+ num + " "+"is ="+" " +numFact(num));
	}
	static int numFact(int num)
	{
		int i, fact=1;
		for(i=1; i<=num; i++)
		{
			 fact = fact*i;
		}
        return fact;
	}
}