import java.io.*;
import java.util.*;
public class Anagram
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String:");
		String str1 = scan.next();
		System.out.println("Enter second String:");
		String str2 = scan.next();
		if(str1.length() != str2.length())
		{
			System.out.print("Strings are not Anagram");
		}
		else
		{
			char s1[] = str1.toCharArray();
			char s2[] = str2.toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);
			if(s1 == s2)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
	}
}