import java.util.Arrays;
import java.util.HashMap;

public class Practice1 {

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int[] result = new int[2];
        HashMap<Integer, Integer> diffPos = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int diff = target - value;
            if (diffPos.containsKey(value)) {
                result[0] = diffPos.get(value);
                result[1] = i;
                return result;
            }
            diffPos.put(diff, i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 18)));
    }

}
