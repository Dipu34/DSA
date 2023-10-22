
public class q6 {
	public static int maxSubarraySum(int[] arr) {
		int maxSum =0;
		int curSum = 0;
		for (int i = 0; i < arr.length; i++) {
		curSum += arr[i];
		maxSum = Math.max(maxSum, curSum);
		if (curSum < 0) {
		curSum = 0;
		}
		}
		return maxSum;
		}
		public static void main(String[] args) {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int maxSum = maxSubarraySum(nums);
		System.out.println("Maximum subarray sum is " + maxSum);
		}
		}


