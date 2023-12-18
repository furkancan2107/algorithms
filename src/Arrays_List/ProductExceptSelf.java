package Arrays_List;

import java.util.Arrays;

/*
* bir dizide elaman hariç onun dışındakileri çarpan program
* Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
* */
public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums={-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];

        Arrays.setAll(answer,x->1);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    answer[i]*=nums[j];
                }
            }
        }
        return answer;
    }
}
