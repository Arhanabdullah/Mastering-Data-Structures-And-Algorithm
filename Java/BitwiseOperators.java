package Java;

public class BitwiseOperators {
    public static void main(String[] args) {
        // An integer has 32 bits.
        // int a =5;
        // int b= 6;
        // System.out.println(a&b);
        // System.out.println(a|b);
        // System.out.println(a^b);
        // System.out.println(~a);

        // The left shift operator (<<) shifts the bits of the integer to the left by a
        // specified number of positions, effectively multiplying the integer by 2 for
        // each position shifted.
        // left shift operator means multiply by 2
        //if we left shift more than 32 times the answer will be 0 because the bits will be shifted out of the integer's 32-bit representation.
        // int n = 1;
        // for (int i = 1; i < 34; i++) {
        //     n= n<<1;
        //     System.out.println("Left shift by one position: " + n);
        // }

        // The right shift operator (>>) shifts the bits of the integer to the right by a
        // specified number of positions, effectively dividing the integer by 2 for each
        // position shifted.
        // right shift operator means divide by 2
        // int num = 256;
        // for (int i = 1; i < 34; i++) {
        //     num= num>>1;
        //     System.out.println("Right shift by one position: " + num);
        // }

        // How to check if a number is even or odd using bitwise operator?
        // if the last bit is 0 then the number is even else odd
        // int number = 5;
        // if ((number & 1) == 0) System.out.println(number + " is even.");
        // else System.out.println(number + " is odd.");

        //Count set bits in a number using bitwise operator
        // int number = 4; 
        // int count = 0;
        // while (number > 0) {
        //     count += number & 1; // Increment count if the last bit is set
        //     number >>= 1; // Right shift the number to check the next bit
        // }
        // System.out.println("Number of set bits " + count);

        //if set bits count ==1  then the number is a power of 2
        // int num = 16; 
        // if((num & (num - 1)) == 0) System.out.println(num + " is a power of 2.");
        // else System.out.println(num + " is not a power of 2.");
        
        //Swap two numbers using bitwise operator
        // int a = 5;
        // int b = 10;
        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;
        // System.out.println("After swapping: a = " + a + ", b = " + b);

        //how to find the unique number in an array where every other number appears twice using bitwise operator
        // int[] arr = { 2, 3, 5, 4, 5, 3, 4 };
        // int unique = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     unique ^= arr[i];
        // }
        // System.out.println("The unique number is: " + unique);

        //Remove the last set bit of a number using bitwise operator
        // int n = 10; // Binary representation: 1010
        // System.out.println((n&(n-1))); // Output: 8 (Binary representation: 1000)

        //how to find the last set bit of a number using bitwise operator
        // int n = 10; // Binary representation: 1010
        // System.out.println((n&-(n))); // Output: 2 (Binary representation: 0010)

    }
}
