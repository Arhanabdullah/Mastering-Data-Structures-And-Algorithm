public class reverseArray {

    public static void reverse(int[] arr, int n) {
        swap(arr, 0, n);
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int[] arr, int left, int right) {

        if (left >= right)
            return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        swap(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        reverse(arr, n);
    }
}
