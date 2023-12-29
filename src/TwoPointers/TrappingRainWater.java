package TwoPointers;
/*
* Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
*
* */
public class TrappingRainWater {
    public static void main(String[] args) {
        trap(new int[] {4,2,0,3,2,5});
        //
    }

    public static int trap(int[] height) {
        int total=0;
        for(int i=2;i<height.length-1;i+=2){
           int min=Math.min(height[i-1],height[i+1]);
           int max=Math.max(height[i-1],height[i+1]);
           int min2=Math.min(max,height[i]);
           total+=max-min2;
            System.out.println(total);
        }
        return total;
    }
}
