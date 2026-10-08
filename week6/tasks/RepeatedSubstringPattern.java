import java.util.*;

public class RepeatedSubstringPattern {

    static boolean repeatedSubstringPattern(String s) {

        int n = s.length();
        int[] lps = new int[n];

        int length = 0;
        int i = 1;

        while (i < n) {

            if (s.charAt(i) == s.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            }
            else if (length > 0) {
                length = lps[length - 1];
            }
            else {
                i++;
            }
        }

        int last = lps[n - 1];

        return last > 0 && n % (n - last) == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(repeatedSubstringPattern(s));

        sc.close();
    }
}