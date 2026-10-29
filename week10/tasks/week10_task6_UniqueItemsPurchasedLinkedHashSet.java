import java.util.LinkedHashSet;
import java.util.Scanner;

public class week10_task6_UniqueItemsPurchasedLinkedHashSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedHashSet<String> items = new LinkedHashSet<>();

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter item: ");
            String item = sc.nextLine();

            items.add(item);
        }

        System.out.println("Unique Items Purchased:");

        for (String item : items) {
            System.out.println(item);
        }

        System.out.println("Total Unique Items: " + items.size());

        sc.close();
    }
}
