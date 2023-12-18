package Arrays_List;

import java.util.*;

/*
* Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.



Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]*/
public class TopKFrequentElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[] {1,1,1,2,2,3,3,6,4,6},4)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        List<Integer> maps=new ArrayList<>();
        for (int i: nums){
            if(!maps.contains(i)){
                maps.add(i);
            }
            System.out.println(maps);
        }
        return new int[] {};
    }
    public static int addList(List list,int i,int s){
        if(!list.contains(i)){
            list.add(i);
            s++;
        }
        return s;

    }
}
