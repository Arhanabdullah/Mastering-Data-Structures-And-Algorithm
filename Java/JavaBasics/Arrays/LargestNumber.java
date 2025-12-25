// This program is to  find the largest element of the array

package JavaBasics.Arrays;

public class LargestNumber {
    public static int largest(int n[]){
        int largest_num = Integer.MIN_VALUE;
        for(int i = 0 ; i< n.length; i++){
            if(largest_num<n[i]) largest_num= n[i];
        }
        return largest_num;
        }
    
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,8,256,46,3,69,156,13};
        System.out.println("The largest number is: " +largest(arr));
    }
}
