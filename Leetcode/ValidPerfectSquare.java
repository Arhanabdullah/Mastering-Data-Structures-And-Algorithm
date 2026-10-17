package Leetcode;

public class ValidPerfectSquare {
    // Leetcode 367. Valid Perfect Square
    // Time Complexity: O(log n) where n is the input number.
    // Space Complexity: O(1)
    // Problem faced: i wasnt using the long data type for the square of mid, which
    // caused integer overflow for large values of num. Using long fixed the issue.
    public boolean isPerfectSquare(int num) {
        int low = 0;
        int high = num;
        if (num == 0 || num == 1)
            return true;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long sq = (long) mid * mid;
            if (sq == num)
                return true;
            if (sq > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

}
