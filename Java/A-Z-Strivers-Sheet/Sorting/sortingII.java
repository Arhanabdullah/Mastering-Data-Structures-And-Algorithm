public class sortingII {

	private static void mergeSort(int[] arr, int low, int high) {
		if (low >= high) {
			return;
		}

		int mid = low + (high - low) / 2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		merge(arr, low, mid, high);
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int left = low;
		int right = mid + 1;
		int index = 0;

		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp[index++] = arr[left++];
			} else {
				temp[index++] = arr[right++];
			}
		}

		while (left <= mid) {
			temp[index++] = arr[left++];
		}

		while (right <= high) {
			temp[index++] = arr[right++];
		}

		for (int i = 0; i < temp.length; i++) {
			arr[low + i] = temp[i];
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {5, 2, 9, 1, 6, 3};

		System.out.println("Before sorting:");
		printArray(arr);

		mergeSort(arr, 0, arr.length - 1);

		System.out.println("After sorting:");
		printArray(arr);
	}
}
