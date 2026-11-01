package Leetcode;

public class TwoSneakyNumberInDigitville {
    // Leetcode 3289. Find the Two Sneaky Numbers in Digitville
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] getSneakyNumbers(int[] nums) {
        int[] count = new int[nums.length-2];
        int[] ans = new int[2];
        for(int i=0; i<nums.length;i++){
            count[nums[i]]++;
        }
        int c = 0;
        for(int i = 0; i<count.length;i++){
            if(count[i] == 2){
                ans[c] = i;
                c++;
            }
        }
        return ans;
    }

}
