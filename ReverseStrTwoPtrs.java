public class ReverseStrTwoPtrs {
    public static void main(String[] args) {
        String str = "Pratidnya";
        // String str = " ";
        String str1 = str.toLowerCase();
        char ch[] = str1.toCharArray();
        int i = 0, j = str1.length() - 1;
        char temp;
        if (str1 == " ") {
            System.out.print("Empty String");
        }
        while (i < j) {
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        System.out.println(ch);
    }
}
