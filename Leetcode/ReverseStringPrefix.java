package Leetcode;

public class ReverseStringPrefix {
    
    // Leetcode 3794. Reverse string Prefix
    // Time Complexity: O(k), where k is the length of the prefix to be reversed.
    // Space Complexity: O(n), where n is the length of the input string, since
    // we are creating a new character array to store the reversed prefix.
    public String reversePrefix(String s, int k) {
        if(k ==0 || k==1) return s;
        int left =0;
        int right =k-1;
        char[] arr = s.toCharArray();
        while(left<right){
            char temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            right--;
            left++;
        }
        return new String(arr) ;
    }
}

