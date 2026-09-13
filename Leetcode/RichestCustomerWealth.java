package Leetcode;

public class RichestCustomerWealth {
    //Leetcode 1672. Richest Customer Wealth
    //Method 1: Iterative approach
    //Time complexity: O(m * n)
    //Space complexity: O(1)
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}

