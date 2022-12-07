import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Arrays;

public class MaxArrayElement {
    public static void main(String args[]) {
        int[] arr = { 12, 20, 30, 55, 10, 68, 40 };
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);

    }
}
