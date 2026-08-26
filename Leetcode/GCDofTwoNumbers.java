package Leetcode;
//Leetcode Problem: 3658. GCD of Odd and Even Sums
//Brute Force Approach
//Not the most efficient solution but works for the given constraints

public class GCDofTwoNumbers {
    public int gcdOfOddEvenSums(int n) {
        if (n < 1 || n > 1000)
            return 0;
        int sumOdd=0;
        int sumEven = 0;
        if(n%2 != 0){
        int count = 0;
            for(int i = 1; i<Integer.MAX_VALUE; i=i+2){
                sumOdd+=i;
                sumEven+= i+1;
                count++;
                if(count==n){
                    break;
                }
            }
            
        }else{
            int count = 0;
            for(int i = 2 ; i< Integer.MAX_VALUE; i=i+2){
                sumEven += i;
                sumOdd +=i-1;
                count++;
                if(count==n){
                    break;
                }
            }
        }
        for(int i= sumEven ; i>0;i--){
            if(sumEven%i ==0 && sumOdd%i ==0){
                return i;
            }
        }
    return 0;
    }

//Optimized Approach
//Constant Time Complexity O(1) and Constant Space Complexity O(1)
//Mathematical Observation: The GCD of the sum of the first n odd numbers and the sum of the first n even numbers is always equal to n.
//Mathematically, the sum of the first n odd numbers is n^2 and the sum of the first n even numbers is n(n+1). The GCD of n^2 and n(n+1) is always equal to n.

    class Solution {
    public int gcdOfOddEvenSums(int n) {
        return n;
    }
}


}
