import java.util.*;

public class FindTheIndexOfTheFirstOccurrence {

    static int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        int[] lps = new int[needle.length()];

        int length = 0;
        int i = 1;

        while (i < needle.length()) {

            if (needle.charAt(i) == needle.charAt(length)) {
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

        i = 0;
        int j = 0;

        while (i < haystack.length()) {

            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;

                if (j == needle.length()) {
                    return i - j;
                }
            }
            else if (j > 0) {
                j = lps[j - 1];
            }
            else {
                i++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String haystack = sc.next();
        String needle = sc.next();

        System.out.println(strStr(haystack, needle));

        sc.close();
    }
}