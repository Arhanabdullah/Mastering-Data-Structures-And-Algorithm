package Leetcode;
//Leetcode Problem 709
public class toLowerCase {
    class Solution {
    public String toLowerCase(String s) {
        // Manual ASCII conversion
        //Method 1
        //Time Complexity: O(n)
        // Very slow because of string concatenation in loop
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (65 <= ch && ch <= 90) {
                str += (char) (ch + 32);
            } else {
                str += ch;
            }
        }
        return str;
    }
}
}

//Method 2
//Using built-in function
//Time Complexity: O(n)
//Space Complexity: O(n)
//This is the best approach as it uses built-in function and is optimized for performance
// faster than manual conversion
class Solution {
    public String toLowerCase(String s) {
        if(s.length()< 1 || s.length()> 100) return "";
        s = s.toLowerCase();
        return s;
    }
}
