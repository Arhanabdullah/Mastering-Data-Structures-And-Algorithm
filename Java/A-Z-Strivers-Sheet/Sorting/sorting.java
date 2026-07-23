
public class sorting {

    public static void selectionSort(int arr[]) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int min_i = i;
            for (int j = i; j <= arr.length - 1; j++) {
                if (arr[j] < arr[min_i])
                    min_i = j;
            }
            int temp = arr[min_i];
            arr[min_i] = arr[i];
            arr[i] = temp;
        }

    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) { // i-1 is used otherwise it will throw a runtime error
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    j--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 9 };
        System.out.println("Original array:");
        printArray(arr);
        // selectionSort(arr);
        // System.out.println("Array after selection sort:");
        // printArray(arr);
        // bubbleSort(arr);
        // System.out.println("Array after bubble sort:");
        // printArray(arr);
        insertionSort(arr);
        System.out.println("Array after Insertion sort:");
        printArray(arr);
    }
}
