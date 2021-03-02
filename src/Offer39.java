public class Offer39 {

    public static int majorityElement(int[] nums) {
        int key = -1, count = 0;
        for (int num : nums) {
            if (count == 0) {
                key = num;
            }
            count += key == num ? 1 : -1;
        }
        return key;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2};
        // int[] nums = new int[]{1};
        // int[] nums = new int[]{};
        System.out.println(majorityElement(nums));
    }

}
