import java.util.*;

public class week12_task3_TopKFrequentElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {

            nums[i] = sc.nextInt();

            freq.put(nums[i],
                    freq.getOrDefault(nums[i], 0) + 1);
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> freq.get(b) - freq.get(a));

        pq.addAll(freq.keySet());

        System.out.println("Top " + k + " Frequent Elements:");

        for (int i = 0; i < k && !pq.isEmpty(); i++) {

            System.out.println(pq.poll());
        }

        sc.close();
    }
}