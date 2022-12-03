import java.io.*;
import java.util.*;
public class CountTypeChar
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String s = scan.next();
	
		int[] res = new Solution().count(s);
		
		for(int i=0; i<4; i++)
		{
		    System.out.println(res[i]);
		}
    }
}
class Solution
{
    int[] count(String s)
    {
        int lower=0, upper=0, digit=0, symbol=0;
        for(int i=0;i<s.length(); i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
              {
                  upper++;
              }
              else if(s.charAt(i)>='a' && s.charAt(i)<='z')
              {
                  lower++;
              }
              else if(s.charAt(i)>='0' && s.charAt(i)<='9')
              {
                  digit++;
              }
              else
              {
                  symbol++;
              }
        }
        int res[] = new int[4];
        res[0] = upper;
        //System.out.println("UpperCase Letters="+res[0]);
        res[1] = lower;
        //System.out.println("LowerCase Letters="+res[1]);
        res[2] = digit;
        //System.out.println("Digits="+res[2]);
        res[3] = symbol;
        //System.out.println("Special Symbols="+res[3]);
       return res;
    }
}


