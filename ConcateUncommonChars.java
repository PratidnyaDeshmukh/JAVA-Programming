// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t--!=0){
            String s1=in.next(),
                   s2=in.next();
            
            Solution obj = new Solution();
            
            System.out.println(obj.concatenatedString(s1,s2));
        }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
       
        String conStr = "";
        for(Character ch:s1.toCharArray())
        {
            if(!s2.contains(ch.toString()))
            {
                conStr = conStr + ch.toString();
            }
        }
        for(Character ch :s2.toCharArray())
        {
            if(!s1.contains(ch.toString()))
            {
                conStr = conStr + ch.toString();
            }
        }
        if(conStr.length()<=0)
        {
            return "-1";
        }
        else
        {
            return conStr;
        }
    }
}
