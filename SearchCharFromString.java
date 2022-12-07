import java.io.*;
import java.util.*;
import java.lang.*;

public class SearchCharFromString {
    public static int serachTarget(String str, char target) {
        String s = str.toLowerCase();
        char s1[] = s.toCharArray();

        int len = s1.length;
        for (int i = 0; i < len; i++) {
            if (s1[i] == target) {
                return target;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        String str = "Pratidnya";
        char target = "r";
        System.out.println(serachTarget(str, target));
    }
}

// public static int targetString(String str, String target) {
// if (str.length() == 0) {
// return -1;
// }
// String l = str.toLowerCase();
// int len = l.length();
// for (int i = 0; i < len; i++) {
// if (l.charAt(i) == target) {
// System.out.println("Found");
// }
// }
// return -1;
// }
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// System.out.println("-----------------------");
// System.out.println("Enter String:");
// String str = scan.nextLine();

// System.out.println("-----------------------");
// System.out.println("Enter Target Element");
// char target = scan.next();

// // System.out.println(targetString(str, target));

// int strlen = str.length();
// if (strlen == 0) {
// System.out.println(("Not Found"));
// }
// for (int i = 0; i < strlen; i++) {
// if (str.charAt(i) == target) {
// System.out.println((" Found"));
// }
// }
// System.out.println(("Not Found"));
// }
