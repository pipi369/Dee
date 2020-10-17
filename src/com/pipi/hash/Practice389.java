package com.pipi.hash;

public class Practice389 {

    /**
     * 给定两个字符串 s 和 t，它们只包含小写字母。
     * <p>
     * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
     * <p>
     * 请找出在 t 中被添加的字母。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：s = "abcd", t = "abcde"
     * 输出："e"
     * 解释：'e' 是那个被添加的字母。
     * 示例 2：
     * <p>
     * 输入：s = "", t = "y"
     * 输出："y"
     * 示例 3：
     * <p>
     * 输入：s = "a", t = "aa"
     * 输出："a"
     * 示例 4：
     * <p>
     * 输入：s = "ae", t = "aea"
     * 输出："a"
     *  
     * <p>
     * 提示：
     * <p>
     * 0 <= s.length <= 1000
     * t.length == s.length + 1
     * s 和 t 只包含小写字母
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/find-the-difference
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }

//    /**
//     * 解法一：字母Hash表，最后字母个数大于0个就是增加的
//     * @param s
//     * @param t
//     * @return
//     */
//    public static char findTheDifference(String s, String t) {
//        // 将最短的数据放到前面处理
//        if (s.length() < t.length()) {
//            String tmp = s;
//            s = t;
//            t = tmp;
//        }
//
//        char[] c = new char[26];
//
//        for (int i = 0; i < s.length(); i++) {
//            c[s.charAt(i) - 'a']++;
//            if (i < t.length())
//                c[t.charAt(i) - 'a']--;
//        }
//
//        for (int i = 0; i < c.length; i++) {
//            if (c[i] > 0) return (char) (i + 'a');
//        }
//
//        return '0';
//    }

    /**
     * 解法二：第一个字符串的和减去第二个字符串的和，int转char
     * @param s
     * @param t
     * @return
     */
    public static char findTheDifference(String s, String t) {
        return (char) (charSum(t) - charSum(s));
    }

    public static int charSum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i);
        }
        return sum;
    }

}
