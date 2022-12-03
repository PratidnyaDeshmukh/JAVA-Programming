import java.io.*;
import java.util.*;
public class CheckString
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Solution s = new Solution();
		System.out.println("Enter String:");
		String str = scan.next();
		if(new Solution().check(str))
		{
		    System.out.println("YES");
		}
		else
		{
		    System.out.println("NO");    
		}
		
    }
}
class Solution
{
   Boolean check(String str)
    {
        for(int i=1; i<str.length(); i++)
        {
            if(str.charAt(0) == str.charAt(i))
            {
                return true;
            }
            
        }
        return false;
    }
}