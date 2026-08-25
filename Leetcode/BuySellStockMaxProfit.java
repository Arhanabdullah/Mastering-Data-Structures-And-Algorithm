package Leetcode;
//Buy and Sell Stock Max Profit
//Leetcode Problem 121
public class BuySellStockMaxProfit {
    //Method 1
    //Using One Pointer Approach
    //Time Complexity: O(n)
    //Space Complexity: O(1)

    public int maxProfit(int[] prices) {
        if (prices.length < 1 || prices.length > (int) Math.pow(10, 5))
            return 0;
        int profit = 0;
        int buy = prices[0];
        for(int i =0; i<prices.length;i++){
            if(prices[i]<buy){
                buy = prices[i];
            }
            else if(prices[i]-buy> profit)
                profit =prices[i]-buy;
        }
        return profit;
        }
}


//Method 2
//Using Two Pointer Approach
//Not better in terms of time complexity but better in terms of space complexity
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 1 || prices.length > (int) Math.pow(10, 5))
            return 0;
        int profit = 0;
        int left = 0;
        int right = 1;
        while(right<prices.length){
            if(prices[left]<prices[right]){
            profit = Math.max(prices[right]-prices[left], profit);
            }else{
                left = right;
            }

            right++;
        }
        return profit;
        }
}


