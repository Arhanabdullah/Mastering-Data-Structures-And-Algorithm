package Leetcode;

public class Maximum69Number {
    // Leetcode 1323. Maximum 69 Number
    // Time Complexity: O( n) where n is the input number. 
    // Space Complexity: O(n)
    // Not an optimal solution
        public int maximum69Number(int num) {
            return Integer.parseInt(("" + num).replaceFirst("6", "9"));
        }
    }

