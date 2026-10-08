import java.util.Arrays;

public class RemoveElement {

    static int removeElement(int[] nums, int val) {

        int index = 0;

        for (int num : nums) {

            if (num != val) {
                nums[index] = num;
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};

        int k = removeElement(nums, 3);

        System.out.println("k = " + k);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
