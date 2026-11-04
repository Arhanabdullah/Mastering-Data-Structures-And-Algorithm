package Leetcode;

public class NumberOfSteps {
    //Leetcode 1342: Number of Steps to Reduce a Number to Zero
    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    
    public int numberOfSteps(int num) {
        int n = num;
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 0) {
                n = n / 2;
                count++;
            } else {
                n = n - 1;
                count++;
            }
        }
        return count;
    }

}