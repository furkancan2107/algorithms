package Arrays_List;

import java.util.*;

public class GroupAnagrams {
    /*
    * Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
* */
    public static void main(String[] args) {
        String[] list={"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(list));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> anagrams=new HashMap<>();
        for(String s : strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String str=String.valueOf(chars);
            if(!anagrams.containsKey(str)){
                anagrams.put(str,new ArrayList<>());
            }
            anagrams.get(str).add(s);
            System.out.println(anagrams);
        }
      return new ArrayList<>(anagrams.values());
    }
}
