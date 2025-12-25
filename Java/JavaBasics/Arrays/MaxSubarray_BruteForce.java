package JavaBasics.Arrays;
//Brute Force Method. Time complexity - n^3 
// very bad time complexity, least preferred
public class MaxSubarray_BruteForce {
    public static void maxsubarray(int n[]) {
        int maxSum= Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < n.length; i++) {
            int start =i;
            for (int j = i; j < n.length; j++) {
                int end =j;
                currentSum=0;
                for (int k = start; k <= end; k++) {
                    
                    currentSum+=n[k];

                    if(maxSum<currentSum){
                        maxSum = currentSum;
                    }
                }
                
            }
            
        }
        System.out.println("Maximum Sum "+ maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        maxsubarray(numbers);
    }

}
