package Leetcode;

public class MinimumElementAfterReplacementDigitSum {
    // Leetcode 3300: Minimum Element After Replacement with Digit Sum
    // Time Complexity: O(n log m) 
    // Space Complexity: O(1)
    //Simple direct calculation solution
    public int minElement(int[] nums) {
        int min = 1000;
        for(int i =0;i<nums.length;i++){
            int sum =0;
            while(nums[i]>0){
                sum=sum+nums[i]%10;
                nums[i]=nums[i]/10;

            }
            if(sum<min) min =sum;
        }
        return min;
    }
}

