import java.util.*;

public class FindAllAnagramsInAString {

    static List<Integer> findAnagrams(String s, String p) {

        List<Integer> answer = new ArrayList<>();

        if (p.length() > s.length()) {
            return answer;
        }

        int[] need = new int[26];
        int[] window = new int[26];

        for (char c : p.toCharArray()) {
            need[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {

            window[s.charAt(i) - 'a']++;

            if (i >= p.length()) {
                window[s.charAt(i - p.length()) - 'a']--;
            }

            if (Arrays.equals(need, window)) {
                answer.add(i - p.length() + 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String p = sc.next();

        System.out.println(findAnagrams(s, p));

        sc.close();
    }
}