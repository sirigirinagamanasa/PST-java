import java.util.*;

public class MarsExploration {

    static int marsExploration(String s) {

        String expected = "SOS";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != expected.charAt(i % 3)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(marsExploration(s));

        sc.close();
    }
}