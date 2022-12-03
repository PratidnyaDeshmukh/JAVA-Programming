import java.io.*;
import java.util.*;
class ReverseStr
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = scan.next();
		for(int i=len-1; i>=0; i--)
		{
			Rev = Rev+ch[i];
		}
		System.out.println("Reversed String:"+Rev);
	}
}