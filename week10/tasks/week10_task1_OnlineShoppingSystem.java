import java.util.ArrayList;
import java.util.Scanner;

public class week10_task1_OnlineShoppingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> products = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<String> cart = new ArrayList<>();

        products.add("Laptop");
        products.add("Mobile");
        products.add("Headphones");

        prices.add(50000.0);
        prices.add(20000.0);
        prices.add(2000.0);

        System.out.println("Online Shopping System");

        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " +
                    products.get(i) + " - Rs." + prices.get(i));
        }

        System.out.print("Enter product number to add to cart: ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= products.size()) {

            cart.add(products.get(choice - 1));

            System.out.println("Product added to cart!");

        } else {
            System.out.println("Invalid product choice");
        }

        System.out.println("Shopping Cart: " + cart);

        double total = 0;

        for (String item : cart) {
            int index = products.indexOf(item);
            total += prices.get(index);
        }

        System.out.println("Total Amount: Rs." + total);

        sc.close();
    }
}