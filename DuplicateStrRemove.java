import java.io.*;
import java.util.*;
import java.lang.*;

public class DuplicateStrRemove {
    public void duplicate(String str) {
        String res = " ";
        String str1 = str.trim().toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (res.indexOf(ch) < 0) {
                res += str1.charAt(i);
            }
        }

        System.out.println(res);
    }

    public static void main(String args[]) {
        DuplicateStrRemove ds = new DuplicateStrRemove();
        String str = "JavaTpoint is the best learning website";
        ds.duplicate(str);
    }
}