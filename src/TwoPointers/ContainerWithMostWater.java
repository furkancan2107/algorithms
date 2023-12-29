package TwoPointers;

/*
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented
by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 */

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }
    public static int maxArea(int[] height) {
        int total=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int min=Math.min(height[i],height[j]);
                int carpim=(j-i)*min;
                if(total<carpim){
                    total=carpim;
                }
            }
        }
        return total;
    }
}
