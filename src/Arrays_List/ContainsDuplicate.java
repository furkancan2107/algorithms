package Arrays_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
* Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*
* Bir tamsayı dizisi nums verildiğinde, herhangi bir değer
* dizide en az iki kez görünüyorsa true döndürür ve her eleman farklıysa false döndürür.
* */
public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new  int[] {1,2,3,7}));
    }
    public static boolean containsDuplicate(int[] nums) {
        int sonuc=0;
        if(nums.length>= Math.pow(10,5)){
            return false;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    sonuc=1;
                    break;
                }
            }
        }
        if(sonuc==1) return true;
        return false;
    }
}
