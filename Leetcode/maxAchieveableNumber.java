public class maxAchieveableNumber {
//Leetcode 2769. Find the Maximum Achievable Number
// Time Complexity: O(1) space Complexity: O(1) space
// Maximum achievable number is the sum of the original number and twice the number of operations performed.
    class Solution {
        public int theMaximumAchievableX(int num, int t) {
            return num + t * 2;
        }
    }
}
