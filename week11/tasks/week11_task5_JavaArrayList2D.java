import java.util.*;

public class week11_task5_JavaArrayList2D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter number of elements: ");
            int d = sc.nextInt();

            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }

            list.add(row);
        }

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x >= 1 && x <= list.size()
                    && y >= 1 && y <= list.get(x - 1).size()) {

                System.out.println(list.get(x - 1).get(y - 1));

            } else {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}