// When should we use counting sort? Counting sort should be used when we know the range, like what is the maximum value or what is the minimum value, or when we have a small range of data, so that we have the sorted data.

package JavaBasics.SortingTechniques;


public class CountingSort {

    public static void countingsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count [] = new int[largest+1];
        for(int i=0; i<arr.length; i++){

            count[arr[i]]++;
        }
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            
            }
        }
    }

    public static void print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }
    public static void main(String[] args) {
        int arr[] ={1,6,4,8,6,5,2,4,3,4,3,2,4,3,7,6,5,1};
        countingsort(arr);
        print(arr);
    }
}
