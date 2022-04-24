package leetCode;

public class LeetCode_0704_BinarySearch {

	private static void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

	public static int[] sortArray(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
				}
			}
		}
		return arr;
	}

	public static int linearSearch(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] nums, int target) {
//		sortArray(nums);
		int start = 0;
		int end = nums.length - 1;
		int mid;

		while (start <= end) {
			mid = (start + end) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else if (nums[mid] > target) {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { -1,0,3,5,9,12 };
		print(arr);
//		int sortArray[] = sortArray(arr);
//		print(sortArray);
		System.out.println("**********");
		int index = binarySearch(arr, 9);
		System.out.println("Index : " + index);

	}
}
