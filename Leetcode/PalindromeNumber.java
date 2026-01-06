//Leetcode - 9. Palindrome Number

package Leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int a=0;
        int palindromeNumber=0;
        if (x<0){
            return false;
        }
        else if(x> Integer.MAX_VALUE - 1){
            return false;
        }
        else{
            int n= x;
            while(x>0){
            a=x%10;
            x/=10;
            palindromeNumber=(palindromeNumber*10)+a;
            }
            if(n == palindromeNumber){
                return true; 
            }
            else{
                return false;
            }
        }
    }
}

