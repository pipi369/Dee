
public class Offer05 {
    /**
     * 解题思路
     * <p>
     * 创建一个字符数组，长度为 str.length * 3，因为有可能输入的全都是空格。
     * <p>
     * 循环字符串，碰到的是空格就插入%20，如果不是空格插入原字符
     * <p>
     * 最后字符数组转字符串时，index为替换支持的字符串真是长度
     */
    public static String replaceSpace(String s) {
        char[] tmp = new char[s.length() * 3];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                tmp[index++] = '%';
                tmp[index++] = '2';
                tmp[index++] = '0';
            } else {
                tmp[index++] = s.charAt(i);
            }
        }
        return new String(tmp, 0, index);
    }

    public static void main(String[] args) {
        String str = "We are happy.";
        System.out.println(replaceSpace(str));
    }

}
