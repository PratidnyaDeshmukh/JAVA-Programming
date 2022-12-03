import java.io.*;
import java.util.*;
public class FrontBackTransform
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scan.next();
		Reverse rv = new Reverse();
		System.out.println("Output:"+rv.rev(str));
	}
}
class Reverse
{
    public static String rev(String str)
    {
        String backStr="";
        for(int i=0; i<str.length(); i++)
        {
            int ch = (int)str.charAt(i);
            int ch1 = ch + 25;
            if(ch>=65 && ch<=90)
            {
                int mod = ch1 % 90;
                if(mod != 0)
                {
                    ch1 = 90 - mod;
                }
                 backStr+=(char)ch1;
            }
            else if(ch>=97 && ch<=122)
            {
               
                int mod = ch1 % 122;
                if(mod != 0)
                {
                    ch1 = 122 - mod;
                   
                }
                 backStr+=(char)ch1;
            }
        }
        return backStr;
    }
}
