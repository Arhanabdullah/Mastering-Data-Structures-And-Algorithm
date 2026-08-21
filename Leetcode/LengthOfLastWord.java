package Leetcode;

// Leetcode 58. Length of Last Word
// This solution uses the built-in String methods to find the length of the last word in a given string. It first trims any leading or trailing whitespace, then finds the index of the last space character and extracts the substring that represents the last word. Finally, it returns the length of that substring.
//Time Complexity: O(n), where n is the length of the input string. The trim() method and lastIndexOf() method both run in linear time, and substring() also runs in linear time in the worst case.
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if (s.length() < 1 || s.length() > (int) Math.pow(10, 4))
            return 0;
        s = s.trim();
        return s.substring(s.lastIndexOf(" ")+ 1).length();
    }

}
