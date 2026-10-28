package Leetcode;

public class FindTheDifference {
    //Leetcode 389. Find the Difference
    // Time Complexity: O(n) 
    // Space Complexity: O(1)
    public char findTheDifference(String s, String t) {
        if (s.length() == 0)
            return t.charAt(0);
        int tSum = 0;
        int sSum = 0;
        for (int i = 0; i < s.length(); i++) {
            sSum += (int) s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            tSum += (int) t.charAt(i);
        }

        return (char) (tSum - sSum);
    }

}
