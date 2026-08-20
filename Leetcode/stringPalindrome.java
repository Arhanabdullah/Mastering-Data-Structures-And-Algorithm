package Leetcode;
//leetcode 125. Valid Palindrome
public class stringPalindrome {

    // Two pointer method

    public boolean isPalindrome(String s) {
        if (s.length() < 1 || s.length() > 2 * Math.pow(10, 5))
            return false;
        int length = s.length();
        int left = 0;
        int right = length - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;
            if (left > right)
                break;
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
