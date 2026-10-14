package Leetcode;

public class SmallestEvenMultiple {
    // Leetcode 2413. Smallest Even Multiple
    // Time Complexity: O(1) where n is the input number.
    // Space Complexity: O(1)
    
    public int smallestEvenMultiple(int n) {
        if(n%2!=0) return n*2;
        else return n;
    }
}
