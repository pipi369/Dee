public class Offer17 {

    public static int[] printNumbers(int n) {
        int[] res = new int[((int) Math.pow(10, n)) - 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = i + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = printNumbers(3);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

}
