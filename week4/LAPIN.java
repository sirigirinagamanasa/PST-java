import java.util.*;

public class LAPIN {

    static boolean isLapindrome(String s) {

        int n = s.length();

        String left = s.substring(0, n / 2);

        String right;

        if (n % 2 == 0) {
            right = s.substring(n / 2);
        } else {
            right = s.substring(n / 2 + 1);
        }

        char[] a = left.toCharArray();
        char[] b = right.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {

        String s = "gaga";

        System.out.println(isLapindrome(s));
    }
}
