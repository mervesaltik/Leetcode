/* Given a string s, find the length of the longest substring 
 * without repeating characters. 
 * A substring is a contiguous non-empty sequence of characters within a string.
 * 
 * Example 1 : Input : s = "abcabcbb" 
 * Output : 3
 * Explanation : The answer is "abc" , with the length of 3.
 * 
 * Example 2 : Input : s = "bbbbb" 
 * Output : 1
 * Explanation : The answer is "b" , with the lenght of 1. 
 * 
 * Example 3 : Input : s : "pwwkew"
 * Output : 3
 * Explanation : The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring. */

import java.util.ArrayList;

class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {

        int start = 0 ;
        int end = 0;
        int max_length = 0; 
        ArrayList <Character> list = new ArrayList<Character>();

        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max_length = Math.max(max_length,list.size());
            }
            else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_length;         
        
    }

}
