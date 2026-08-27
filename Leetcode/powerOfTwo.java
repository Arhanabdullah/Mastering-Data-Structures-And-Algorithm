package Leetcode;
//Leetcode 231. Power of Two
//Recursive solution to check if a number is a power of two
// Time Complexity: O(log n)  Space Complexity: O(log n) due to recursion stack

public class powerOfTwo {
    class Solution {

    public boolean isPowerOfTwo(int n) {
        if (n == 1)
            return true;
        if (n < 1)
            return false;
        if (n > Integer.MAX_VALUE)
            return false;
        return (n % 2 == 0) && isPowerOfTwo(n / 2);
    }

}
}
