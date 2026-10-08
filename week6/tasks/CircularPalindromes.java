import java.util.*;

public class CircularPalindromes {

    static int[] manacher(char[] s) {

        int n = s.length;

        int[] d1 = new int[n];

        int left = 0;
        int right = -1;

        for (int i = 0; i < n; i++) {

            int k = (i > right) ? 1
                    : Math.min(d1[left + right - i],
                               right - i + 1);

            while (i - k >= 0 &&
                   i + k < n &&
                   s[i - k] == s[i + k]) {
                k++;
            }

            d1[i] = k--;

            if (i + k > right) {
                left = i - k;
                right = i + k;
            }
        }

        return d1;
    }

    static int longestPalindrome(String s) {

        int n = s.length();

        String doubled = s + s;

        char[] arr = doubled.toCharArray();

        int[] d1 = manacher(arr);

        int answer = 1;

        for (int start = 0; start < n; start++) {

            for (int center = start;
                 center < start + n;
                 center++) {

                int radius = d1[center];

                int left = center - radius + 1;
                int right = center + radius - 1;

                int actualLeft = Math.max(left, start);
                int actualRight = Math.min(right, start + n - 1);

                if (actualLeft <= actualRight) {

                    int length = actualRight - actualLeft + 1;

                    if (length > answer) {
                        answer = length;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        for (int i = 0; i < n; i++) {

            String rotated = s.substring(i) + s.substring(0, i);

            System.out.println(longestPalindrome(rotated));
        }

        sc.close();
    }
}
