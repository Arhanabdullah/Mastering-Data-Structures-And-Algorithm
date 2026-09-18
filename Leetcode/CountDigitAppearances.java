package Leetcode;

public class CountDigitAppearances {
    //3895. Count Digit Appearances 
    //Time Complexity: O(n log m) where n is the length of nums and m is the number of digits in each number
    //Space Complexity: O(1)
    public int countDigitOccurrences(int[] nums, int digit) {
        int count =0;
        for(int num: nums){
            while(num>0){
                if(num%10 == digit ) count++;
                num/=10;
            }
        }
        return count;
    }

}
