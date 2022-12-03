import java.io.*;
import java.util.*;
import java.lang.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = scan.next();
        Solution sol = new Solution();
        System.out.println(sol.trans(str));
    }

}
 class Solution
{
    static String trans(String str)
    {
        for(int i=0; i<=str.length(); i++)
        {
            if(str.charAt(i)>=65 && str.charAt(i)<=90)
            {
                str+=(char)(90+str.charAt(i)-65);
            }
            else
            {
                 str+=(char)(122+str.charAt(i)-97);
            }
        }
        return str;
    }
    
}
