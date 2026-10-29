import java.util.HashMap;
import java.util.Scanner;

public class week11_task3_DegreeOfAnArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        int degree = 0;
        int minLength = n;

        for (int i = 0; i < n; i++) {

            nums[i] = sc.nextInt();

            int num = nums[i];

            freq.put(num, freq.getOrDefault(num, 0) + 1);

            if (!first.containsKey(num)) {
                first.put(num, i);
            }

            last.put(num, i);

            degree = Math.max(degree, freq.get(num));
        }

        for (int num : freq.keySet()) {

            if (freq.get(num) == degree) {

                int length = last.get(num) - first.get(num) + 1;

                minLength = Math.min(minLength, length);
            }
        }

        System.out.println("Degree of Array: " + degree);
        System.out.println("Minimum Subarray Length: " + minLength);

        sc.close();
    }
}