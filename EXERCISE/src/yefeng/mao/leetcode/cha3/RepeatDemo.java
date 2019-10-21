package yefeng.mao.leetcode.cha3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @description: Given a string, find the length of the longest substring without repeating characters.
 * Example.
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * @author: YF.Mao
 * @create: 2019/5/23
 **/
public class RepeatDemo {
    public static void main(String[] args) {
        String s = "abcabcbb";
        String s2 = "";

        System.out.println(RepeatDemo.lengthOfLongestSubstring6(s));
        System.out.println(RepeatDemo.lengthOfLongestSubstring6(s2));
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] a = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int length = 0, start = 0;
        while (start < a.length) {
            //int num = b.indexOf(a[start]);
            //indexOf 不是从0开始计算的，而是从1
            int num = stringBuilder.indexOf(Character.toString(a[start]));
            if (num != -1) {
                stringBuilder = stringBuilder.delete(0, num + 1).append(Character.toString(a[start]));
                //b = b.substring(num + 1) + Character.toString(a[start]);
            } else {
                stringBuilder.append(Character.toString(a[start]));
                //b = b + Character.toString(a[start]);
            }
            length = Math.max(length, stringBuilder.length());
            start++;
        }
        return length;
    }

    public static int lengthOfLongestSubstring6(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = 0, start = 0;
        while (start < s.length()) {
            int num = stringBuilder.indexOf(String.valueOf(s.charAt(start)));
            if (num != -1) {
                stringBuilder = stringBuilder.delete(0, num + 1).append(String.valueOf(s.charAt(start)));
            } else {
                stringBuilder.append(String.valueOf(s.charAt(start)));
            }
            length = Math.max(length, stringBuilder.length());
            start++;
        }
        return length;
    }

    /**
     * 暴力解决方法，通过遍历来寻找最长字符
     */
    public int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (allUnique(s, i, j)) {
                    ans = Math.max(ans, j - i);
                }
            }
        }
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }

    /**
     * 指定了2个变量来寻找不重复的字符串，记录长度
     * 难点在于记录不重复的字符串，以及寻找合适的容器来存储，方便判断
     * 
     */
    public int lengthOfLongestSubstring3(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public int lengthOfLongestSubstring4(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    public int lengthOfLongestSubstring5(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}
