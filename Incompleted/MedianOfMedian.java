/*https://github.com/JohnKurlak/Algorithms/blob/master/selection/Quickselect.java*/
public class MedianOfMedian {

	public static void main(String[] args) {
		int[] array = {9, 8, 7, 6, 5, 0, 1, 2, 3, 4};
		int k = 4;
		System.out.println(quickselect(array, 0, array.length - 1, k));
	}
	
	static int quickselect(int[] arr, int left, int right, int k) {
		int pivot = partition(arr, left, right);
		System.out.println(pivot);
		print(arr);
		if(k == pivot) {
			return arr[pivot];
		}else if(pivot > k) {
			return quickselect(arr, left, pivot - 1, k);
		}else {
			return quickselect(arr, pivot + 1, right, k);
		}
	}
	
	static int partition(int[] arr, int left, int right) {
		int index = left;
		for(int i = left + 1; i <= right; i++) {
			if(arr[index] > arr[i]) {
				swap(arr, index, i);
				index++;
			}
		}
		return index;
	}
	
	static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	
	static void print(int[] arr) {
		for(int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
