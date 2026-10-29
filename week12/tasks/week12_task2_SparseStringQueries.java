import java.util.*;

public class week12_task2_SparseStringQueries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            String s = sc.nextLine();

            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        sc.nextLine();

        System.out.println("Query Results:");

        for (int i = 0; i < q; i++) {

            String query = sc.nextLine();

            System.out.println(map.getOrDefault(query, 0));
        }

        sc.close();
    }
}