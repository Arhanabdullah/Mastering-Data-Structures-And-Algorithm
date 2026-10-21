package Leetcode;

public class FindGCDOfArray {
    // Leetcode 1979. Find GCD of Array
    // Time Complexity: O(n), where n is the length of the input array, since we are
    // iterating through the array to find the minimum and maximum values.
    // Space Complexity: O(1), since we are using a constant amount of space to
    // store the minimum and maximum values, as well as the GCD.

    public int findGCD(int[] nums) {
        int gcd = 0;
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
            if (nums[i] > max)
                max = nums[i];
        }
        for (int i = 1; i <= min; i++) {
            if (min % i == 0 && max % i == 0)
                gcd = i;
        }
        return gcd;
    }

}
