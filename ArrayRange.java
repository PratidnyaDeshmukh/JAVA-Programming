import java.io.*;
import java.util.*;
import java.lang.*;

public class ArrayRange {
    public static int arrayseraching(int[] arr, int start, int end, int target) {
        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
                return target;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 12, 23, 32, 21, 13, 10 };
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre Starting Index:");
        int start = scan.nextInt();
        System.out.println("Entre ending Index:");
        int end = scan.nextInt();
        System.out.println("Enter Target ele=");
        int target = scan.nextInt();

        System.out.println(arrayseraching(arr, start, end, target));
    }

}
