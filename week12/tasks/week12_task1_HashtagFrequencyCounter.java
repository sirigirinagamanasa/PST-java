import java.util.*;

public class week12_task1_HashtagFrequencyCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        HashMap<String, Integer> map = new HashMap<>();

        String[] words = text.split("\\s+");

        for (String word : words) {

            if (word.startsWith("#")) {

                map.put(word,
                        map.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Hashtag Frequencies:");

        for (String hashtag : map.keySet()) {

            System.out.println(hashtag + " : "
                    + map.get(hashtag));
        }

        sc.close();
    }
}
