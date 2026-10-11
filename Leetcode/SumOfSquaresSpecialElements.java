public class SumOfSquaresSpecialElements {
    // Leetcode 2778. Sum of Squares of Special Elements
    // Time Complexity: O(n) where n is the length of the input array.
    // Space Complexity: O(1)

    public int sumOfSquares(int[] nums) {
        int sum = 0;
        for (int i = 1; i <= nums.length; i++) {
            if (nums.length % i == 0) {
                sum = sum + (nums[i - 1] * nums[i - 1]);
            }
        }
        return sum;
    }
}