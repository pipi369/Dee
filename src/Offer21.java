public class Offer21 {

    public static int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if ((nums[i] & 1) == 1) {
                i++;
                continue;

            }
            if ((nums[j] & 1) == 0) {
                j--;
                continue;
            }
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{2, 16, 3, 5, 13, 1, 16, 1, 12, 18, 11, 8, 11, 11, 5, 1};
        exchange(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

}

