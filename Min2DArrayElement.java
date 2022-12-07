public class Min2DArrayElement {
    public static void main(String args[]) {
        int arr[][] = { { 14, 26, 5 }, { 65, 43, 76 }, { 8, 76, 44 } };
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
