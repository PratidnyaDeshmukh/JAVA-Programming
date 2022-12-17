class Print2ndLargestNum {

    int print2ndLargest(int arr[], int n) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr[arr.length - 2];

    }

    public static void main(String args[]) {
        Print2ndLargestNum s = new Print2ndLargestNum();
        int arr[] = { 12, 35, 1, 10, 34, 1, 99, 100 };
        int n = arr.length;
        int res = s.print2ndLargest(arr, n);
        System.out.println(res);

        // Arrays.sort(arr);
        // System.out.println(arr[arr.length-2]);
    }
}