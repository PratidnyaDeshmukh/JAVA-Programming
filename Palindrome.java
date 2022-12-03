import java.io.*;
import java.util.*;
import java.lang.*;

public class Palindrome {
    public static boolean ispalindrome(String str) {
        String result = " ";
        boolean ans = false;
        int strlen = str.length() - 1;

        for (int i = strlen; i >= 0; i--) {
            result = result + str.charAt(i);
        }

        if (str.equals(result)) {
            ans = true;
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "aba";
        str = str.toLowerCase();
        boolean ans = ispalindrome(str);
        System.out.println(ans);
    }
}