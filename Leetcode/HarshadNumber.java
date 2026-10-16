package Leetcode;

public class HarshadNumber{
    // Leetcode 3099. Check if a Number is a Harshad Number
    // Time Complexity: O(log n) where n is the input number.
    // Space Complexity: O(1)
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int num=x;
        int sum = 0;
        while(x>0){
            sum = sum + x%10;
            x = x/10;
        }
        if(num%sum ==0) return sum;
        return -1;
    }
}
