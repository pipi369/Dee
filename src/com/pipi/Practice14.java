package com.pipi;

public class Practice14 {

    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     * <p>
     * 如果不存在公共前缀，返回空字符串 ""。
     * <p>
     * 示例 1:
     * <p>
     * 输入: ["flower","flow","flight"]
     * 输出: "fl"
     * 示例 2:
     * <p>
     * 输入: ["dog","racecar","car"]
     * 输出: ""
     * 解释: 输入不存在公共前缀。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-common-prefix
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */
    public static void main(String[] args) {
//        String[] strs = new String[]{"flower", "flow", "flight"};
        String[] strs = new String[]{"ab", "a"};
        System.out.println(longestCommonPrefix(strs));
    }

    /**
     * 第一次解题，纵向扫描
     *
     * @param strs
     * @return
     */
//    public static String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0) return "";
//
//        // 以第一个字符串长度为准，对所有字符串进行比较
//        for (int i = 0; i < strs[0].length(); i++) {
//            char ch = strs[0].charAt(i);
//
//            // 从数组的第二个字符串开始，逐个比较所有字符串与第一个字符串每个位置的字符是否相等，如果遇到不相等的，则返回相同部分字符串
//            for (int j = 1; j < strs.length; j++) {
//                if (i + 1 > strs[j].length() || strs[j].charAt(i) != ch)
//                    return strs[0].substring(0, i);
//            }
//        }
//
//        return strs[0];
//    }

    /**
     * 横向扫描
     *
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        // 从数组的第二个字符串开始逐个比较每个字符串的公共前缀
        for (int i = 1; i < strs.length; i++) {
            // 逐个对比
            prefix = longestCommonPrefix(prefix, strs[i]);
            if (prefix.length() == 0) {
                break;
            }
        }

        return prefix;
    }

    public static String longestCommonPrefix(String str1, String str2) {
        // 循环次数以字段的字符串为准
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        // 逐个比较两个字符串公共部分
        while (index < length && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        // 截取公共部分返回
        return str2.substring(0, index);
    }

}
