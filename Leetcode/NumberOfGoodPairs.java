package Leetcode;

public class NumberOfGoodPairs {
    // Leetcode 1512. Number of Good Pairs
    //Time Complexity: O(n) where n is the length of the input array.
    //Space Complexity: O(1) since the count array has a fixed size of 101.
    
    public int numIdenticalPairs(int[] nums) {
        int res = 0, count[] = new int[101];
        for (int a: nums) {
            res += count[a]++;
        }
        return res;
    }
}

