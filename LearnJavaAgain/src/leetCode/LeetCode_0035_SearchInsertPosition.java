package leetCode;

public class LeetCode_0035_SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int mid = 0;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] < target)
				start = mid + 1;
			else
				end = mid - 1;
		}
		if (nums[mid] < target) {
			return mid + 1;
		} else if (nums[mid] > target) {
			return mid == 0 ? mid : mid - 1;
		} else {
			return mid;
		}
	}

	public static int searchInsertSubmitted(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int mid = 0;
		if (nums[start] > target)
			return start;
		if (nums[end] < target)
			return end + 1;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] < target)
				start = mid + 1;
			else
				end = mid - 1;
		}
		if (nums[mid] < target)
			return mid + 1;
		else
			return mid;
	}
	
	public static int searchInsertBest(int[] nums, int target) {
		int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] > target) {
                end = middle - 1;
            } else if (nums[middle] < target) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return start;
	}
	

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 6 };
		int target1 = 5;
		int target2 = 2;
		int target3 = 7;
		int target4 = 0;
//		System.out.println(searchInsert(arr, target1));
//		System.out.println(searchInsert(arr, target2));
//		System.out.println(searchInsert(arr, target3));
//		System.out.println(searchInsert(arr, target4));
		System.out.println(searchInsertSubmitted(arr, target1));
		System.out.println(searchInsertSubmitted(arr, target2));
		System.out.println(searchInsertSubmitted(arr, target3));
		System.out.println(searchInsertSubmitted(arr, target4));
		System.out.println(searchInsertSubmitted(new int[] { 1, 3 }, 2));

	}

}
