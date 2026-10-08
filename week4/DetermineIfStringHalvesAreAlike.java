public class DetermineIfStringHalvesAreAlike {

    static boolean halvesAreAlike(String s) {

        int mid = s.length() / 2;
        int first = 0;
        int second = 0;

        for (int i = 0; i < mid; i++) {
            if (isVowel(s.charAt(i))) {
                first++;
            }
        }

        for (int i = mid; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                second++;
            }
        }

        return first == second;
    }

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);

        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }

    public static void main(String[] args) {

        String s = "book";

        System.out.println(halvesAreAlike(s));
    }
}