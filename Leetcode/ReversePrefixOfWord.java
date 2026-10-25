package Leetcode;

public class ReversePrefixOfWord {
    // Leetcode 2000. Reverse Prefix of Word
    // Time Complexity: O(n) where n is the length of the word
    // Space Complexity: O(n) where n is the length of the word
    // Used the two pointer approach to reverse the prefix of the word.
    //  Used the XOR operation to swap the characters in the word. 
    public String reversePrefix(String word, char ch) {
        int left = 0;
        int right = word.indexOf(ch);
        char[] c = word.toCharArray();
        while (left < right) {
            c[left] = (char) (c[left] ^ c[right]);
            c[right] = (char) (c[left] ^ c[right]);
            c[left] = (char) (c[left] ^ c[right]);
            left++;
            right--;
        }
        return String.valueOf(c);
    }
}
