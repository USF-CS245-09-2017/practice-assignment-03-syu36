/**
 *
 * Implements Practice03Search interface and contains search method that performs a recursive binary search.
 *
 */
public class BinaryRecursiveSearch implements Practice03Search {

	@Override
	public String searchName() {
		return "Binary Recursive Search";
	}

	@Override
	public int search(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		return search(arr, target, start, end);
	}

	private int search(int[] arr, int target, int start, int end) {
		int mid = (start + end) / 2;

		if (start > end) {
			return -1;
		}

		if (arr[mid] == target) {
			return mid;
		} else if (target > arr[mid]) {
			return search(arr, target, mid + 1, end);
		}
		return search(arr, target, start, mid - 1);
	}

}