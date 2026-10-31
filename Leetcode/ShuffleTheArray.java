package Leetcode;

public class ShuffleTheArray {
    // Leetcode 1470. Shuffle the Array
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] shuffle(int[] nums, int n) {
        int i = 0;
        int j = n;
        int count =0;
        int[] arr = new int[2*n];
        while(count<2*n){
            arr[count] = nums[i];
            count++;
            i++;
            arr[count] =nums[j];
            count++;
            j++;
        }
    return arr;
    }
}
