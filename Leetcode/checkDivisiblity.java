public class checkDivisiblity {

    // leetcode 3622. Check divisibility by Digit sum and product
    // Time Complexity: O(log n) space Complexity: O(1) space
    
        public boolean checkDivisibility(int n) {
            int originalNumber = n;
            int modulo = 0;
            int product = 1;
            int sum = 0;
            while (originalNumber > 0) {
                modulo = originalNumber % 10;
                sum += modulo;
                product *= modulo;
                originalNumber /= 10;

            }
            if (n % sum == 0 && n % product == 0)
                return true;

            else
                return false;
        }
        public static void main(String[] args) {
            checkDivisiblity obj = new checkDivisiblity();
            int n = 99;
            boolean result = obj.checkDivisibility(n);
            System.out.println(result);
        }
    }

