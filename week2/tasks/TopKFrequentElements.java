import java.util.*;

public class TopKFrequentElements {

    static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Put numbers into a list
        List<Integer> numbers = new ArrayList<>(freq.keySet());

        // Sort by frequency (highest first)
        numbers.sort((a, b) -> freq.get(b) - freq.get(a));

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = numbers.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};

        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}
