import java.util.*;

public class LongestPalindromicSubstring {

    static String longestPalindrome(String s) {

        if (s.length() <= 1) {
            return s;
        }

        StringBuilder t = new StringBuilder("^");

        for (char c : s.toCharArray()) {
            t.append("#");
            t.append(c);
        }

        t.append("#$");

        int n = t.length();
        int[] p = new int[n];

        int center = 0;
        int right = 0;

        int maxLength = 0;
        int maxCenter = 0;

        for (int i = 1; i < n - 1; i++) {

            int mirror = 2 * center - i;

            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            while (t.charAt(i + (1 + p[i])) ==
                   t.charAt(i - (1 + p[i]))) {
                p[i]++;
            }

            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            if (p[i] > maxLength) {
                maxLength = p[i];
                maxCenter = i;
            }
        }

        int start = (maxCenter - maxLength) / 2;

        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(longestPalindrome(s));

        sc.close();
    }
}
