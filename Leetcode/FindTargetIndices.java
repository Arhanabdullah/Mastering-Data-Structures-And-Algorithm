package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndices {
    // Leetcode 2089. Find Target Indices After Sorting Array
    // Time Complexity: O(nlogn), where n is the length of nums, due to sorting.
    // Space Complexity: O(1), since we are using a constant amount of extra space.
    // Approach: Sort the array and then iterate through it to find the indices of
    // the target value.
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> matchingIndices = new ArrayList<>();
        for(int i = 0 ; i< nums.length;i++){
            if(nums[i]== target) matchingIndices.add(i);
        }
        
        return matchingIndices;
    }

}
