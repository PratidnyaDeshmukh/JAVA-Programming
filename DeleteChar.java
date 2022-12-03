import java.io.*;
import java.util.*;
class DeleteChar
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st String:");
        String S = scan.next();

        Solution sol = new Solution();
        System.out.println(sol.delAlternate(S));
    }
}
class Solution {
    static String delAlternate(String S) 
    {
         String NewStr ="";
        for(int i=0; i<S.length()-1; i+=2)
        {
            NewStr = NewStr+S.charAt(i);
        }
        return NewStr;
    }
}