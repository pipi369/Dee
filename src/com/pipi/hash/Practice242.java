package com.pipi.hash;

public class Practice242 {

    /**
     * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
     * <p>
     * 示例 1:
     * <p>
     * 输入: s = "anagram", t = "nagaram"
     * 输出: true
     * 示例 2:
     * <p>
     * 输入: s = "rat", t = "car"
     * 输出: false
     * 说明:
     * 你可以假设字符串只包含小写字母。
     * <p>
     * 进阶:
     * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/valid-anagram
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(isAnagram("abc", "cba"));
    }

//    /**
//     * 方案一：排序字符串后对比
//     *
//     * @param s
//     * @param t
//     * @return
//     */
//    public static boolean isAnagram(String s, String t) {
//        char[] sa = s.toCharArray();
//        char[] ta = t.toCharArray();
//        Arrays.sort(sa);
//        Arrays.sort(ta);
//        return Arrays.toString(sa).equals(Arrays.toString(ta));
//    }

    /**
     * 方案二：使用Hash表存储每个字符出现的次数，如果字符表最后都是0，则两个字符串相等
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
            map[t.charAt(i) - 'a']--;
        }
        for (int i : map) {
            if (i != 0) return false;
        }
        return true;
    }

}
