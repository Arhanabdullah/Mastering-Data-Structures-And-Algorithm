package Leetcode;

public class ScoreOfString {

    // Leetcode 3110: Score of String
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Solution: Iterate through the string and compare the ASCII values of adjacent
    // characters.
    // If the ASCII value of the previous character is greater than the current
    // character, add the difference to the result.
    // If the ASCII value of the current character is greater than or equal to the
    // previous character, add the difference to the result.
    public int scoreOfString(String s) {
        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) - s.charAt(i) > 0)
                result = result + s.charAt(i - 1) - s.charAt(i);
            else {
                result = result + s.charAt(i) - s.charAt(i - 1);
            }
        }
        return result;
    }
}
