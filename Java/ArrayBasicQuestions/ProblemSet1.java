package Java.ArrayBasicQuestions;

import java.util.Arrays;

public class ProblemSet1 {

    // Java Array Basic Questions
    // Problem Set 1
    // Question 1: Reverse an array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    // Question 2: Shift the elements by one position to the right
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Approach: Store the last element in a variable, then iterate from the end of
    // the array to the beginning, shifting each element to the right. Finally,
    // place the stored last element at the first position.
    public static void shiftRight(int[] arr) {
        int lastElement = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
        System.out.println(Arrays.toString(arr));
    }

    // Question 3: Shift the elements by k position
    // Time Complexity: O(n)
    // Space Complexity: O(k)
    // Approach: Store the last k elements in a temporary array, then iterate from
    // the end of the array to the beginning, shifting each element to the right by
    // k positions. Finally, place the stored last k elements at the first k
    // positions in reverse order.
    public static void shiftByK(int[] arr, int k) {
        int[] lastKElements = new int[k];
        int count = 0;
        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            lastKElements[count] = arr[i];
            System.out.println(lastKElements[count]);
            count++;
        }
        for (int i = arr.length - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = lastKElements[k - 1 - i];
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // System.out.println("Original Array: " + Arrays.toString(arr));
        // System.out.println("Reversed Array: " + Arrays.toString(reverseArray(arr)));
        // shiftRight(arr);
        shiftByK(arr, 2);

    }
}
