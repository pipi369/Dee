public class Offer58II {

    public static String reverseLeftWords(String s, int n) {
        StringBuilder buf = new StringBuilder(s);
        for (int i = 0; i < n; i++) {
            buf.append(s.charAt(i));
        }

        return buf.toString().substring(n);
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(reverseLeftWords(str, 2));
    }

}
