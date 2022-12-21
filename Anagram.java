import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "keep";
        String s2 = "Peek";

        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 != len2) {
            System.out.println("Not Anagram");
        }

        String sl1 = s1.toLowerCase();
        String sl2 = s2.toLowerCase();

        char ch1[] = sl1.toCharArray();
        char ch2[] = sl2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Anagram");
        }
    }
}