public class MaxRowSum {
    public static void main(String args[]) {
        int arr[][] = { { 2, 2, 3 }, { 50, 2, 3 }, { 10, 2, 3 } };
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];

            }
            if (sum > ans) {
                ans = sum;
            }

        }
        System.out.println(ans);
    }

}