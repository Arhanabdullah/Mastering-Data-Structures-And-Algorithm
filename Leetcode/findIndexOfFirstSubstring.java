package Leetcode;
//Leetcode 28. Implement strStr()
// O(n) time complexity and O(1) space complexity
public class findIndexOfFirstSubstring {
    
    
    public int strStr(String haystack, String needle) {
        if (haystack.length() < 1 || needle.length() < 1 || haystack.length() > (int) Math.pow(10, 4)
                || needle.length() > (int) Math.pow(10, 4))
            return -1;
        int pos = haystack.indexOf(needle);
        return pos;
    }
}

