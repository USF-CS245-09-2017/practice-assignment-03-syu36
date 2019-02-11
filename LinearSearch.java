/**
 *
 * Implements Practice03Search interface and contains search method that performs a linear search.
 *
 */
public class LinearSearch implements Practice03Search {

	@Override
	public String searchName() {
		return "Linear Search";
	}

	@Override
	public int search(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

}