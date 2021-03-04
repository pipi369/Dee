import java.util.HashSet;

public class Ot1 {

    public static int findMidNumber(int[] nums) {
        int[] lr = new int[nums.length];
        int[] rr = new int[nums.length];

        int lp = nums[0], li = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= lp) {
                lp = nums[i];
                lr[li++] = nums[i];
            }
        }

        int rp = nums[nums.length - 1], ri = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] <= rp) {
                rp = nums[i];
                rr[ri++] = nums[i];
            }
        }

        HashSet<Integer> lrs = new HashSet<>();

        for (int i : lr) {
            lrs.add(i);
        }

        for (int i = 0; i < rr.length; i++) {
            if (lrs.contains(rr[i])) {
                return rr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 3, 4, 4, 6};
        System.out.println(findMidNumber(nums));
    }

}
