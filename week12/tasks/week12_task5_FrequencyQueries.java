import java.util.*;

public class week12_task5_FrequencyQueries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> freq = new HashMap<>();

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {

            int operation = sc.nextInt();
            int value = sc.nextInt();

            if (operation == 1) {

                freq.put(value,
                        freq.getOrDefault(value, 0) + 1);

            } else if (operation == 2) {

                if (freq.containsKey(value)) {

                    int count = freq.get(value);

                    if (count <= 1) {
                        freq.remove(value);
                    } else {
                        freq.put(value, count - 1);
                    }
                }

            } else if (operation == 3) {

                boolean found = freq.containsValue(value);

                System.out.println(found ? 1 : 0);
            }
        }

        sc.close();
    }
}
