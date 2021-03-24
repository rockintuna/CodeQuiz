package leetcode;

import java.util.*;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Map<Integer, Character> map = new HashMap<>();
        List<Integer> lengthList = new ArrayList<>(Arrays.asList(0));
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (map.containsValue(chars[i])) {
                lengthList.add(map.size());
                for (int j = 0; j <= map.get(chars[i]); j++) {
                    map.remove()
                }
                index = 0;
                //map.put(chars[i], index);
            } else if ( i == chars.length-1 ) {
                map.put(chars[i], index++);
                lengthList.add(map.size());
            } else {
                map.put(chars[i], index++);
            }
        }

        lengthList.sort(Collections.reverseOrder());
        return lengthList.get(0);
    }

    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();
        System.out.println(longestSubstring.lengthOfLongestSubstring("pwwkew"));

    }
}
