
public class q4 {
	public static int search(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
		int mid = (left + right) / 2;
		if (arr[mid] == target) {
		return mid;
		} else if (arr[mid] < target) {
		left = mid + 1;
		} else {
		right = mid - 1;
		}
		}
		return -1;
		}
		public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9};
		int target = 5;
		int index = search(arr, target);
		if (index == -1) {
		System.out.println(target + " not found in the array");
		} else {
		System.out.println(target + " found at index " + index);
		}
		}
		}

