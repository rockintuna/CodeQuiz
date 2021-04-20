package leetcode;

import java.util.*;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        Set<Character> set = new HashSet<>();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if ( set.contains(s.charAt(i)) ) {
                while ( s.charAt(index) != s.charAt(i) ) {
                    set.remove(s.charAt(index++));
                }
                index++;
            } else {
                set.add(s.charAt(i));
            }
            length = Math.max(length, set.size());
            System.out.println(length+"  "+set.toString());
        }
        return length;
    }

    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();
        System.out.println(longestSubstring.lengthOfLongestSubstring(""));

    }
}
