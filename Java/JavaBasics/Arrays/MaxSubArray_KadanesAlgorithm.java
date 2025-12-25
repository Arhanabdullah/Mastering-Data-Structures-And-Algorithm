package JavaBasics.Arrays;

public class MaxSubArray_KadanesAlgorithm {
    public static void Kadanes(int n[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0;i<n.length;i++){
            currentSum+=n[i];
            if(currentSum<0){
                currentSum = 0;
            }
            maxSum =Math.max(currentSum, maxSum);
        }
        System.out.println("Maximum Subarray Sum: " +maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {-1,-2,0,4,8,4,6,-2,-4,-4,-6}; 
        Kadanes(numbers);
    }
}
