import java.util.Scanner;

public class week11_task2_FirstUniqueCharacterInString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        int index = -1;

        for (int i = 0; i < s.length(); i++) {

            if (freq[s.charAt(i)] == 1) {
                index = i;
                break;
            }
        }

        System.out.println("First Unique Character Index: " + index);

        sc.close();
    }
}