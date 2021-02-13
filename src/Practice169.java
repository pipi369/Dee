import java.util.Arrays;

public class Practice169 {

    public static int majorityElement(int[] nums) {
        int major = nums[0], count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                major = nums[i];
                count = 1;
                continue;
            }
            if (nums[i] == major) {
                count++;
            } else {
                count--;
            }
        }
        return major;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{10, 9, 9, 9, 10};
        System.out.println(majorityElement(nums));
    }

}
