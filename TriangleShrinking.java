// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            
            String ans = ob.triDownwards(S);
            
            for(int i=0 ; i<ans.length() ; i++)
            {
                System.out.print(ans.charAt(i));
                if((i+1)%S.length()==0)
                    System.out.println();
            }
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    static String triDownwards(String S)
    {
       int len = S.length();
       String str ="";
      System.out.println(S);
       
       for(int i=1; i<len; i++)       
       {
            for(int j=0; j<i; j++)
            {
                str+=".";
            }
          str+=S.substring(i,len); 
       }
     
       return str;
    }
};