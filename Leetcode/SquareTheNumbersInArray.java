package Leetcode;
//Leetcode 977. Squares of a Sorted Array
//Time Complexity: O(n log n)  Space Complexity: O(1)
//Brute force solution to find the squares of a sorted array
import java.util.Arrays;

public class SquareTheNumbersInArray {
    public int[] sortedSquares(int[] nums) {
        if (nums.length < 1 || nums.length > 100 * 100)
            return new int[]{};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < -100 * 100 || nums[i] > 100 * 100)
                return new int[]{};
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

}
