import java.io.*;
import java.util.*;
import java.lang.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String:");
        String S = scan.next();
        Solution sol = new Solution();
        System.out.println(sol.splitString(S));
    }

}
 class Solution
{
     static List<String> splitString(String S) 
    { 
       
        String alpha="";
        String digits="";
        String spl="";
        for(int i=0; i<S.length(); i++)
        {
            if((S.charAt(i)>='A' && S.charAt(i)<='Z') || 
                (S.charAt(i)>='a' && S.charAt(i)<='z'))
            {
                alpha+=S.charAt(i);
            }
            else if(S.charAt(i)>='0' && S.charAt(i)<='9')
            {
                digits+=S.charAt(i);
            }
            else
            {
                spl+=S.charAt(i);
            }
        }
         List<String> ans = new ArrayList<String>(3);
        ans.add(alpha);
        ans.add(digits);
        ans.add(spl);
        return ans;
       
    }
}
