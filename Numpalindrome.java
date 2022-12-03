public class Numpalindrome {
    public static void main(String args[]) {
        int num = 123;
        int res;
        while (num > 0) {
            res = num % 10;
            System.out.print(res + " ");
            num = num / 10;
            if (num == 0) {
                break;
            }
        }
    }
}
