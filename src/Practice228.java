import java.util.ArrayList;
import java.util.List;

public class Practice228 {

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i = 0, size = nums.length;
        while (i < size) {
            int low = i;
            i++;
            while (i < size && nums[i] - 1 == nums[i - 1]) {
                i++;
            }

            int high = i - 1;

            String buffer = String.valueOf(nums[low]);
            if (low != high) {
                buffer += "->" + nums[high];
            }
            result.add(buffer);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 4, 5, 7};
        summaryRanges(nums).forEach(System.out::println);
    }

}
