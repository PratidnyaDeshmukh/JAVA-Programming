import java.util.Arrays;

public class TwoArraysEquals {
    public static void main(String args[]) {

        int arr1[] = { 10, 30, 20, 40 };
        int arr2[] = { 40, 10, 20, 30 };

        int len1 = arr1.length;
        int len2 = arr2.length;

        if (len1 != len2) {
            System.out.println("Not Equal");
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println("Not Equal");
            }
        }
        System.out.println("Equals");
    }
}
