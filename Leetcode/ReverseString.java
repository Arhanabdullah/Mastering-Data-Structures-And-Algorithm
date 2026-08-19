package Leetcode;
//Two Pointer method - Leetcode 344. Reverse String
public class ReverseString {

    public void reverseString(char[] s) {
        if (s.length < 1 || s.length > Math.pow(10, 5))
            return;
        int left = 0;
        int right = s.length - 1;
        char temp;
        while (left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
