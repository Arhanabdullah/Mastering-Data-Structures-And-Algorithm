package Leetcode;

public class PartitionArrayAccordingToTheGivenPivot {
    // Leetcode 2161: Partition Array According to the Given Pivot
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Simple direct calculation solution
    // This solution uses two pointers to partition the array into three parts:
    // elements less than the pivot, elements equal to the pivot, and elements
    // greater than the pivot.
    
    public int[] pivotArray(int[] nums, int pivot) {
        int left = 0;
        int right = nums.length - 1;
        int ans[] = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        while (i < nums.length) {
            if (nums[i] < pivot) {
                ans[left++] = nums[i];
            }
            if (nums[j] > pivot) {
                ans[right--] = nums[j];
            }
            i++;
            j--;
        }
        while (left <= right) {
            ans[left++] = pivot;
        }
        return ans;
    }
}
