// quest 32/50..
//18 june 2025

import java.util.HashSet;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxlength = 0;
        HashSet<Character>set = new HashSet<>();
        while (right<s.length()){
            char ch = s.charAt(right);
            while (set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
                }
                set.add(ch);
                right++;
                maxlength = Math.max(maxlength, set.size());
                }
                return maxlength;
                }
        public static void main(String[] args) {
        String s = "aabbbccddee";
        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(s));
    }
}
