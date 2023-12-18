package Arrays_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidAnagram {
    // 1.yöntem
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {// cba abc
            count[s.charAt(i) - 'a']++; // 3 2 1
            count[t.charAt(i) - 'a']--;// -1 0 1

        }
        for (int a : count) {
            if (a != 0) {
                return false;
            }

        }
        return true;
    }
    // 2.yöntem
    public static boolean isAnagram2(String s,String t){
        String[] list={s,t};
        List<String> stringList=new ArrayList<>();
        for (String str: list){
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            String sr=String.valueOf(chars);
            if(!stringList.contains(sr))
            {
                stringList.add(sr);
            }
        }
        if(stringList.size()!=1){
            return  false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram2("abc", "cba"));

    }
}
