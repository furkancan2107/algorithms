package Arrays_List;

/*
 * Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 8 };
 twoSum(nums,5);

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] returnArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    returnArray[0] = i;
                    returnArray[1] = j;

                    System.out.println(i+" "+ j);

                }

            }
        }
        return returnArray;

    }
}
