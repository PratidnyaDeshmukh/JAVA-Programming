import java.io.*;
import java.util.*;

public class StrfLetterCap
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = scan.next();
		Updatedstr u = new Updatedstr();
		System.out.println("Updated String:"+u.updateStr(str));
	}
}
class Updatedstr
{
    public static String updateStr(String str)
    {
       String strsplit[] = str.split("");
        String newStr="";
        for(String word:strsplit)
        {
            String fstr = word.substring(0,1);
            String rstr = word.substring(1);
            newStr+=fstr.toUpperCase()+rstr+"";
        }
        return newStr;
    
    }
}
