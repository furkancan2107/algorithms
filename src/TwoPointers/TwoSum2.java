package TwoPointers;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int t=0,s=0;
       for(int i=0;i<numbers.length;i++){
           for(int j=i+1;j<numbers.length;j++){
               if(numbers[i]+numbers[j]==target){
                   t=i+1;
                   s=j+1;
               }
           }
       }
       return new int[] {t,s};
    }
}
