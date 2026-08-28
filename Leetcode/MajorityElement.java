package Leetcode;

import java.util.Arrays;

//Leetcode 169. Majority Element
//Time Complexity: O(n^2)  Space Complexity: O(1)
//Brute force solution to find the majority element in an array
public class MajorityElement {
    
    public int majorityElement(int[] nums) {
        if(nums.length<1 || nums.length> 5 * 100*100*10) return 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<(int)Math.pow(-10,9) || nums[i]>(int)Math.pow(10,9)) return 0;
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    if(count> (int) nums.length/2) return nums[i];
                }
            }
        }
        return 0;
    }

    //Time Complexity: O(n log n)  Space Complexity: O(1)
    //Sorting solution to find the majority element in an array
    class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
}
