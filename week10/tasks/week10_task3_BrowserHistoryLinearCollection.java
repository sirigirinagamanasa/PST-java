import java.util.ArrayList;
import java.util.Scanner;

public class week10_task3_BrowserHistoryLinearCollection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> history = new ArrayList<>();

        int choice;

        do {
            System.out.println("\nBrowser History");
            System.out.println("1. Visit Website");
            System.out.println("2. View History");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter website URL: ");
                    String url = sc.nextLine();

                    history.add(url);

                    System.out.println("Website visited!");
                    break;

                case 2:
                    System.out.println("Browser History:");

                    for (String site : history) {
                        System.out.println(site);
                    }
                    break;

                case 3:
                    System.out.println("Exiting browser...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 3);

        sc.close();
    }
}
