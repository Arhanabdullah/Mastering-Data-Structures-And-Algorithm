public class CountCommas {
//Leetcode 3870. Count Commas in Range
// Time Complexity: O(1) space Complexity: O(1) space
// Given an integer n, return the number of integers in the range [1, n]
// that contain at least one comma when written in standard decimal notation.

    public int countCommas(int n) {
        if ( n < 1000)
            return 0;

        return n - 999;
    }

}
