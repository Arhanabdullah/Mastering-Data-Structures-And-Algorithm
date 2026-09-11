package Leetcode;

public class ReverseDegreeOfAString {
//Leetcode 3498 . Reverse Degree of a String
    //The reverse degree of a string s is defined as the sum of the values of each character in s multiplied by its position (1-indexed) in the string.
    //The value of a character is defined as its position in the English alphabet (i.e, 'a' = 1, 'b' = 2, ..., 'z' = 26).
    //Given a string s, return the reverse degree of s.
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public int reverseDegree(String s) {
        int degree = 0;
        for (int i = 0; i < s.length(); i++) {
            degree += ('z' - s.charAt(i) + 1) * (i + 1);
        }
        return degree;
    }
}
