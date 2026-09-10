package Leetcode;

public class CountCommasII {
//Leetcode 3871. Count Commas in Range II
// Time Complexity: O(log n) space Complexity: O(1) space
// Given an integer n, return the number of integers in the range [1, n]
// that contain at least one comma when written in standard decimal notation.
//totalCommas += n -start + 1; 
// count the numbers from start to n that have at least one comma
// start *= 1000; 
// move to the next range of numbers that will have commas
    public long countCommas(long n) {
        if (n < 1000)
            return 0;
        long totalCommas = 0;
        long start = 1000;
        while (start <= n) {
            totalCommas += n - start + 1;
            start *= 1000;
        }
        return totalCommas;
    }
}

