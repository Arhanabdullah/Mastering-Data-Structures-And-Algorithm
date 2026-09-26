package Leetcode;

public class DifferenceOfNondivisibleAndDivisible {

    // Leetcode 2894:Divisible and Non-divisible Sums Difference
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Brute Force solution
    // Solution: Iterate through the numbers from 0 to n and check if the number is
    // divisible by m or not. If it is divisible, add it to the divisible sum. If it
    // is not divisible, add it to the non-divisible sum. Finally, return the
    // difference between the non-divisible sum and the divisible sum.

    public int differenceOfSums(int n, int m) {
        int divisibleSum = 0;
        int notDivisibleSum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % m != 0)
                notDivisibleSum += i;
            else
                divisibleSum += i;
        }
        return notDivisibleSum - divisibleSum;
    }

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    // Optimal solution
    // Solution: The sum of the first n natural numbers is given by the formula
    // n*(n+1)/2. The sum of the first d natural numbers is given by the formula
    // d*(d+1)/2. The sum of the first d natural numbers that are divisible by m is
    // given by the formula m*d*(d+1)/2, where d = n/m. Therefore, the difference
    // between the sum of the first n natural numbers and the sum of the first d
    // natural numbers that are divisible by m is given by the formula n*(n+1)/2 -
    // m*d*(d+1)/2.
    // The final result is the difference between the sum of the first n natural
    // numbers and the sum of the first d natural numbers that are divisible by m.

    class Solution {
        public int differenceOfSums(int n, int m) {
            int totalSum = n * (n + 1) / 2;
            int d = n / m;
            int divisibleSum = m * d * (d + 1);
            return totalSum - divisibleSum;
        }
    }
}
