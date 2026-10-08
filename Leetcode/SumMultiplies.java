package Leetcode;

public class SumMultiplies {
    // Leetcode 2652. Sum Multiples
    // Time Complexity: O(n) where n is the input number. The loop runs n times.
    // Space Complexity: O(1) since we are using a constant amount of space
    // Brute Force Approach: Iterate through all numbers from 1 to n and check if
    // they are multiples of 3, 5, or 7. If they are, add them to the sum.

    public int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
                sum = sum + i;
        }
        return sum;
    }

    
}
