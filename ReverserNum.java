import java.io.*;
import java.util.*;
import java.lang.*;
class ReverseNum
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number=");
		int num = scan.nextInt();	
	   sum(num);	
	}
	static void sum(int num)
	{
	    int res=0;
	    while(true)
	    {
		int num1=num%10;
		//res+=num1;
		System.out.println(num1);
		num=num / 10;
		if(num==0)
		    break;
		
	    }
	   // System.out.println(res);
	}
}

