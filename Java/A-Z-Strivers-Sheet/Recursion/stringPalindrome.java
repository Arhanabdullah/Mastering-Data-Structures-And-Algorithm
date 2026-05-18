public class stringPalindrome {
    public static boolean isPalindrome(String s) {
        // to convert the string into lowercase and replacing all the special characters
        // and numbers with ""
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        return swapString(s, 0, s.length());
    }

    public static boolean swapString(String s, int i, int n) {
        if (i >= n / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false;
        }
        return swapString(s, i + 1, n);
    }
    public static void main(String[] args) {
        String s = "aabbcc";
        System.out.println(isPalindrome(s));
    }
}
