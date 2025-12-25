package JavaBasics.Arrays;

public class MaxSubarray_PrefixSum{

    public static void maxsubarray(int n[]) {
        int maxSum= Integer.MIN_VALUE;
        int currentSum = 0;
        int prefix[] = new int[n.length];
        prefix[0]= n[0];
        for(int i =1;i<prefix.length;i++ ){
            prefix[i]= prefix[i-1]+n[i];

        }

        for (int i = 0; i < n.length; i++) {
            int start =i;
            for (int j = i; j < n.length; j++) {
                int end= j;
                currentSum=0;
                
                    
                    currentSum= i==0? prefix[end] : prefix[end]-prefix[start-1];
                    if(maxSum<currentSum){
                        maxSum = currentSum;
                
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
