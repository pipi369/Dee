import java.util.Arrays;

public class Practice66 {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;

            if ((digits[i] %= 10) != 0) {
                return digits;
            }

        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{9, 8};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

}
