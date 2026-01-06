//Leetcode problem -07 Reverse Integer

package Leetcode;

public class ReverseNumber {
    public static int reverse(int n) {
        int reverse = 0;
        int sign = n > 0 ? 1 : -1; 
        n = Math.abs(n);

        while (n > 0) {
            int a = n % 10;
            n = n / 10;


            if (reverse > (Integer.MAX_VALUE - a) / 10) {
                return 0; // overflow detected
            }

            reverse = reverse * 10 + a;
        }

        return sign * reverse;
    }
}
