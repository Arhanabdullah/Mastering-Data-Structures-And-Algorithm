package Leetcode;

public class SmallestIndexDigitSum {
    // Leetcode 3550: Smallest Index With Equal Digit Sum
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Solution: Iterate through the array and check if the digit sum of the number
    // at the current index is equal to the index.
    // If the number is greater than 9, calculate the digit sum by repeatedly
    // dividing the number by 10 and adding the remainder to the sum.
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 9) {
                int sum = 0;
                while (nums[i] > 0) {
                    sum += nums[i] % 10;
                    nums[i] /= 10;
                }
                if (sum == i)
                    return i;
            } else if (nums[i] == i) {
                return i;
            }
        }
        return -1;
    }
}
