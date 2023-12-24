package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum3 {
    public static void main(String[] args) {
        int[] test={-1,0,1,2,-1,-4};
        System.out.println(threeSum(test));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List list=new ArrayList<>();

       for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
               for(int k=j+1;k<nums.length;k++){
                   if(nums[i]+nums[j]+nums[k]==0){
                       int[] dizi={nums[i],nums[j],nums[k]};
                       List<Integer> liste = Arrays.stream(dizi)
                               .boxed()
                               .collect(Collectors.toList());
                       liste.sort(null);
                       if(!list.contains(liste)){
                           list.add(liste);
                       }
                   }
               }
           }
       }
       return list;
    }
}
