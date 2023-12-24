package Arrays_List;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] newInt={-2,1,-3,4,-1,2,1,-5,4};
       maxSubArray(newInt);
    }
    public static int maxSubArray(int[] nums) {
List<Integer> list=new ArrayList<>();
int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] || nums[i]==nums[j]*-1){
                    if(!list.contains(nums[i])) {
                        list.add(nums[i]);
                        max+=nums[i];
                        System.out.println(nums[i]);
                    }

                }
            }
        }

        return max;
    }
}
