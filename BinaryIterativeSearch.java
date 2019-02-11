/**
 *
 * Implements Practice03Search interface and contains search method that performs an iterative binary search.
 *
 */
public class BinaryIterativeSearch implements Practice03Search {

	@Override
	public String searchName() {
		return "Binary Iterative Search";
	}

	@Override
	public int search(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if(target > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

}