import java.util.*;

public class week12_task4_GroupAnagrams {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();

        HashMap<String, ArrayList<String>> map =
                new HashMap<>();

        for (int i = 0; i < n; i++) {

            String word = sc.nextLine();

            char[] chars = word.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());

            map.get(key).add(word);
        }

        System.out.println("Grouped Anagrams:");

        for (ArrayList<String> group : map.values()) {

            System.out.println(group);
        }

        sc.close();
    }
}