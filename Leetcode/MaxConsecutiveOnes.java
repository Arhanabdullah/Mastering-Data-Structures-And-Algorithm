package Leetcode;

public class MaxConsecutiveOnes {
    // Leetcode 485. Max Consecutive Ones
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Solution: Iterate through the array and count the number of consecutive 1's.
    // If we encounter a 0, reset the count to 0. Keep track of the maximum count
    // encountered during the iteration.
    // Return the maximum count at the end of the iteration.
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for (int n : nums) {
            if (n == 1) {
                count += 1;
            } else {
                count = 0;
            }
            if (maxCount < count)
                maxCount = count;
        }

        return maxCount;
    }
}
