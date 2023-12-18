package Arrays_List;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
*
*
*Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
*
*
* */
public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums={4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
      int sayac=1;

        Set<Integer> uniqueSet = new HashSet<>();
        Arrays.stream(nums).forEach(uniqueSet::add);
        int[] uniqueArray = uniqueSet.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(uniqueArray);
        System.out.println(Arrays.toString(uniqueArray));

        int max=0;
        for(int i=1;i<uniqueArray.length;i++){
            if(uniqueArray[i]-uniqueArray[i-1]==1){
                ++sayac;
                max=sayac;
            }else{
                sayac=1;
            }
        }
        return nums.length==0 ? 0 :  max==0 ? 1 : max ;
    }
}
