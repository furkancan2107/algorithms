package SlidingWindow;

import java.util.*;
import java.util.stream.Collectors;

/*
* Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*/
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        //String s="anviaj";
        System.out.println(lengthOfLongestSubstring("anviaj"));
      //  System.out.println(s.indexOf(s.charAt(3)));

    }
    public static int lengthOfLongestSubstring(String s) {
        String s2="";
        int max=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                s2=s.substring(i,j+1);
                 int d=control(s2);
                 if(max<d) max=d;
            }
        }
        return s.length()==1 ? 1 : max;
    }
    public static int control(String s2){
        Set<Character> characters=new HashSet<>();
        String s="";
        int max=0;
        for(int i=0;i<s2.length();i++){
            if(!characters.contains(s2.charAt(i))){
                characters.add(s2.charAt(i));
                 s+=s2.charAt(i);
                int d=i-s2.indexOf(s.charAt(0))+1;
                if(d==s.length())
                if(max<d) max=d;
            }
        }
        return max;
    }


}
