package Leetcode;

public class RansomNote {
    // Leetcode 383. Ransom Note
    // Time Complexity: O(n + m), where n is the length of ransomNote and m is the
    // length of magazine.
    // Space Complexity: O(1), since the size of the character count array is
    // constant
    // Approach: Use an array to count the occurrences of each character in the
    // magazine, then decrement the count for each character in the ransom note. If
    // any count goes negative, it means we don't have enough of that character in
    // the magazine.

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCounts = new int[256];
        for (char c : magazine.toCharArray()) {
            charCounts[c]++;
        }
        for (char c : ransomNote.toCharArray()) {
            charCounts[c]--;
            if (charCounts[c] < 0) {
                return false;
            }
        }
        return true;
    }

}
