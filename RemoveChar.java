
import java.io.*;
import java.util.*;

public class RemoveChar
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = scan.next();
		Removable re = new Removable();
		String digits = re.rem(str);
		System.out.println("Digits:"+digits);
		
		
	}
}
class Removable
{
    public static String rem(String str)
    {
        str = str.replaceAll("[\\D+]", "");
        return str;
    }
}
