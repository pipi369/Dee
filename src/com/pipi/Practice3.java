package com.pipi;

import java.util.HashMap;
import java.util.Map;

public class Practice3 {

    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     * <p>
     * 示例 1:
     * <p>
     * 输入: "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * 示例 2:
     * <p>
     * 输入: "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     * 示例 3:
     * <p>
     * 输入: "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * <p>
     * 实现方案：滑动窗口
     */
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }

    private static int lengthOfLongestSubstring(String s) {
        // 最大不重复字符个数
        int max = 0;
        // Hash表，记录字符不重复的位置
        Map<Character, Integer> map = new HashMap<>();
        // 定义循环滑动窗口的开始和结束
        for (int end = 0, start = 0; end < s.length(); end++) {
            // 获得窗口的下一个字符
            char ch = s.charAt(end);
            // 判断字符是否出现过，如果出现过，滑动窗口向后移
            if (map.containsKey(ch)) {
                start = Math.max(map.get(ch), start);
            }
            // 记录字符不重复开始的位置
            map.put(ch, end + 1);
            // 获得最大的不重复个数
            max = Math.max(max, end - start + 1);
        }
        return max;
    }

}
