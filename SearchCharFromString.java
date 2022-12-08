import java.io.*;
import java.util.*;
import java.lang.*;

public class SearchCharFromString {
    public static void srchchar(String str, char s) {
        String str1 = str.toLowerCase();
        if (str1.length() == 0) {
            System.out.println("Empty");
        }
        for (int i = 0; i < str1.length(); i++) {
            char ele = str1.charAt(i);
            if (ele == s) {
                System.out.println("found");
            }
        }
        return;
    }

    public static void main(String args[]) {
        SearchCharFromString so = new SearchCharFromString();
        String str = "Hello";
        char s = 'h';
        so.srchchar(str, s);

    }
}
