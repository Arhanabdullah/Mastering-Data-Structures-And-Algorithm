package Leetcode;

public class FinalValueOfVariable {
    //2011. Final Value of Variable After Performing Operations
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String c : operations) {
            if (c.charAt(1) == '+') {
                x = x + 1;
            } else {
                x = x - 1;
            }
        }
        return x;
    }
}

