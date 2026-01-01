package JavaBasics.SortingTechniques;

public class insertionSort {

    public static void insertionsort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int currentElement = arr[i];
            int previousElement = i-1;
            //finding out the correct element to insert
            while(previousElement>=0 && arr[previousElement]> currentElement){
                arr[previousElement+1] = arr[previousElement];
                previousElement--;
            }
            //Insertion
            arr[previousElement+1] = currentElement;

        }

    }
    public static void print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] ={2,4,3,7,6,5,1};
        insertionsort(arr);
        print(arr);
    }
}
// Time Complexity = O(n^2)