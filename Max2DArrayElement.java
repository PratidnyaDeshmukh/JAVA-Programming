public class Max2DArrayElement {
    public static void main(String args[]) {
        int arr[][] = { { 12, 23, 34 }, { 54, 43, 32 }, { 98, 87, 76 } };
        // int i=0, j=0;
        int max = arr[0][0];
        // int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);

    }

}
