import java.io.*;
import java.util.*;
class Main 
{
    public static void main(String args[]) throws IOException 
    {
            Scanner scan = new Scanner(System.in);
            String S = scan.next();
            Solution ob = new Solution();
            String result = ob.firstAlphabet(S);
            System.out.println(result);
    }
}
class Solution 
{
    String firstAlphabet(String S) 
    {
        String outStr = "";
       for(int i=0; i<S.length(); i++)
       {
           if(i==0)
           {
               outStr+=(S.charAt(i));
           }
           else if(S.charAt(i) == ' ')
           {
               outStr+=(S.charAt(i+1));
           }
       }
       return outStr; 
    }
};