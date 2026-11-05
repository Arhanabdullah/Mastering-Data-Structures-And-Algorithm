package Leetcode;

import java.util.Arrays;

public class FindtheDistanceValueBetweenTwoArrays {
    // Leetcode 1385: Find the Distance Value Between Two Arrays
    // Time Complexity: O(nlogn+mlogm+n×m)
    // Space Complexity: O(1)
    // Brute Force Approach: For each element in arr1, check all elements in arr2 to
    // see if the absolute difference is less than or equal to d. If it is, mark it
    // as invalid. If no elements in arr2 are within the distance d of the current
    // element in arr1, increment the count of valid elements.

    // Not optimized, but works for small input sizes.
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            boolean valid = true;
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    valid = false;
                    break;
                }
            }
            if (valid)
                ans++;
        }
        return ans;
    }
}
