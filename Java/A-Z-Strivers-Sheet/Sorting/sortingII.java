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

	private static void quickSort(int[] arr, int low, int high) {
		if (low >= high) {
			return;
		}

		int pivotIndex = partition(arr, low, high);
		quickSort(arr, low, pivotIndex - 1);
		quickSort(arr, pivotIndex + 1, high);
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				swap(arr, i, j);
			}
		}

		swap(arr, i + 1, high);
		return i + 1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
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
		int[] quickArr = {5, 2, 9, 1, 6, 3};

		System.out.println("Before sorting:");
		printArray(arr);
		printArray(quickArr);

		mergeSort(arr, 0, arr.length - 1);
		quickSort(quickArr, 0, quickArr.length - 1);

		System.out.println("After merge sort:");
		printArray(arr);

		System.out.println("After quick sort:");
		printArray(quickArr);
	}
}
