package Leetcode;
//leetcode 136. Single Number
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int num = 0;
        int count = 0;
        if (nums.length < 1 || nums.length > 3 * Math.pow(10, 4))
            return 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < -3 * Math.pow(10, 4) || nums[i] > 3 * Math.pow(10, 4))
                return 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    break;
                }
                count = 0;
            }
            if (count == 0) {
                num = nums[i];
            }
        }
        return num;
    }
}
