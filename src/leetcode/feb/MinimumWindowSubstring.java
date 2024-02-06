package leetcode.feb;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        /*Input: s = "ADOBECODEBANC", t = "ABC"
        Output: "BANC"
        Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t*/
    }

    //Time O(n) | space O(n)
    public String minWindow(String s, String t) {
        int m = s.length(), n = t.length();
        HashMap<Character, Integer> charCounterMap = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        int start = 0;
        for (char x : t.toCharArray())
            charCounterMap.put(x, charCounterMap.getOrDefault(x, 0) + 1);
        int count = charCounterMap.size();
        int i = 0, j = 0;
        while (j < s.length()) {
            charCounterMap.put(s.charAt(j), charCounterMap.getOrDefault(s.charAt(j), 0) - 1);
            if (charCounterMap.get(s.charAt(j)) == 0)
                count--;

            if (count == 0) {
                while (count == 0) {
                    if (ans > j - i + 1) {
                        ans = j - i + 1;
                        start = i;
                    }
                    charCounterMap.put(s.charAt(i), charCounterMap.getOrDefault(s.charAt(i), 0) + 1);
                    if (charCounterMap.get(s.charAt(i)) > 0)
                        count++;

                    i++;
                }
            }
            j++;
        }
        if (ans != Integer.MAX_VALUE)
            return s.substring(start, start + ans);
        else
            return "";
    }
}
