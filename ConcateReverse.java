import java.io.*;
import java.util.*;
class ConcateReverse
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st String:");
        String S1 = scan.next();
        System.out.println("Enter 2nd String:");
        String S2 = scan.next();
        Solution sol = new Solution();
        System.out.println(sol.conRevstr(S1, S2));
    }
}
class Solution {
    static String conRevstr(String S1, String S2) {
        String Str1 = S1.concat(S2);
        String str="";
        for(int i = Str1.length()-1; i>=0; i--){
            str += Str1.charAt(i);
        }
        return str;
    }
}