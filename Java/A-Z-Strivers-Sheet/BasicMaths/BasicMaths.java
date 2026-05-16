import java.util.Arrays;
public class BasicMaths {

    public static void numberOfDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        System.out.println(count);
    }

    public static void reverseOfNumber(int n) {
        int reversedNum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            n /= 10;
            reversedNum = reversedNum * 10 + lastDigit;
        }
        System.out.println(reversedNum);
    }

    public static void palindromeNumber(int n) {
        int reversedNum = 0;
        int originalNumber = n;
        while (n > 0) {
            int lastDigit = n % 10;
            n /= 10;
            reversedNum = reversedNum * 10 + lastDigit;

        }
        if (reversedNum == originalNumber) {

            System.out.println(originalNumber + " is a palindrome number");
        } else
            System.out.println(originalNumber + " is not a palindrome number");
    }

    public static boolean armstrongNumber(int n) {
        int originalNumber = n;
        int armstrongNumber = 0;
        while (n > 0) {
            int rem = n % 10;
            armstrongNumber = (int) (armstrongNumber + Math.pow(rem, 3));
            n /= 10;
        }

        if (armstrongNumber == originalNumber)
            return true;
        else
            return false;
    }

    public static void printAllDivisions(int n) {
        int divisors[] = new int[n];
        int index = 0;
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                divisors[index++] = i;
            }
            if(n % (n/i) == 0 && i != n/i) {
                divisors[index++] = n/i;
            }
        }
        Arrays.sort(divisors, 0, index);
        for (int i = 0; i < divisors.length; i++) {
            if (divisors[i] != 0) {
                System.out.print(divisors[i] + " ");
            }
        }
    }

    public static void primeNumbers(int n){
        
        int count = 0;
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {;
                count++;
            }
            if(n % (n/i) == 0 && i != n/i) {
                count++;
            }
        }
        if(count == 2) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
    public int GCD(int n1, int n2) {
        int gcd = 0;
        for(int i = 1 ; i<=Math.min(n1,n2); i++){
            if(n1%i==0 && n2%i==0){
                gcd =i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 6;
        BasicMaths bm = new BasicMaths();
        // numberOfDigits(number);
        // reverseOfNumber(number);
        // palindromeNumber(number);
        // armstrongNumber(number);
        // printAllDivisions(number);
        // primeNumbers(number);
        bm.GCD(number1, number2);
    }
}