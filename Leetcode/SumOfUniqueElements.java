package Leetcode;

public class SumOfUniqueElements{
    // Leetcode 1748. Sum of Unique Elements
    // Given an integer array nums, return the sum of all the unique elements of nums.
    // An element is unique if it appears exactly once in the array.
    // Time Complexity: O(n) where n is the length of the input array nums.
    // Space Complexity: O(1) since the size of the result array is constant (101) and does not depend on the input size.
    public int sumOfUnique(int[] nums) {
        int sum=0;
        int [] result=new int[101];
        for(int num: nums){
            result[num]++;
        }
        for(int i=0;i<result.length;i++){
            if(result[i]==1){
                sum+=i;
            }
        }
        return sum;
    }

}