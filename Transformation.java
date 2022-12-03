// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class Transformation
{
    public static void main(String args[]) throws IOException 
    { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
         {
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.convert(S));            
        }
    } 
} 

//User function Template for Java
class Solution 
{ 
    String convert(String S) 
    { 
       String s="";
      
       for(int i=0; i<S.length(); i++)
        {
            char ch = S.charAt(i);
            if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
            {
                if(ch>=65 && ch <=90)
                {
                    s+=(char)(90-ch+ 65);
                }
                else if(ch>=97 && ch<=122)
                {
                    s+=(char)(122-ch+ 97);
                }
            }
        }
        return s;
    }
} 