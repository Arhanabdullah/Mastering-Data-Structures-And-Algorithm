package Leetcode;

public class DigitFrequencyScore {
    // Leetcode 3945: Digit Frequency Score
    // Time Complexity: O(log n) where n is the input number
    // Space Complexity: O(1)
    // Simple approach is to find the sum of digits of the number and return it as
    // the score.

    public int digitFrequencyScore(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n /= 10;
        }
        return sum;
    }
}
