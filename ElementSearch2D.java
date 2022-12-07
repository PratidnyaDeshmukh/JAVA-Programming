import java.io.*;
import java.util.*;
import java.lang.*;

public class ElementSearch2D {
    public static int multisearch(int[][] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == ele) {
                    return arr[i][j];
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[][] arr = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 } };
        int ele = 68;
        System.out.println(multisearch(arr, ele));
    }
}
