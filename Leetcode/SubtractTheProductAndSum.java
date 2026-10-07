package Leetcode;

public class SubtractTheProductAndSum {
    //Leetcode 1281. Subtract the Product and Sum of Digits of an Integer
    //Time Complexity: O(log n) where n is the input number. The number of digits in n is log10(n), so the loop runs log10(n) times.
    //Space Complexity: O(1) since we are using a constant amount of space 
    

    public int subtractProductAndSum(int n) {
        int sum= 0;
        int product =1;
        while(n>0){
            int digit = n%10;
            sum += digit;
            product*=digit;
            n/=10;
        }
        return product - sum;
    }

}
