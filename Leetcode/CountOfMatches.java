package Leetcode;

public class CountOfMatches {
//Leetcode 1688. Count of Matches in Tournament
//Method 1: Iterative approach
//Time complexity: O(log n)
//Space complexity: O(1)

    public int numberOfMatches(int n) {
        int matches = 0;
        while (n > 1) {
            matches += n / 2;
            n = (n + 1) / 2;
        }
        return matches;
    }

    //Method 2: Mathematical approach
    //Time complexity: O(1)
    //Space complexity: O(1)
    class Solution {
        public int numberOfMatches(int n) {
            return n - 1;
        }
    }
}

