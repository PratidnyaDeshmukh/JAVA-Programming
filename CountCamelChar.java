import java.io.*;
import java.util.*;
class CountCamelChar
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String:");
        String S = scan.next();

        Solution sol = new Solution();
        System.out.println(sol.delAlternate(S));
    }
}
class Solution {
    static int delAlternate(String S) 
    {
        int count = 0;
         for(int i=0; i<S.length(); i++)
         {
             if(S.charAt(i) >= 65 && S.charAt(i) <=91)
             {
                 count++;
             }
         }
         return count;
    }
}