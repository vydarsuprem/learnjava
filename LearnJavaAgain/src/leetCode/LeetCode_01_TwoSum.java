package leetCode;

public class LeetCode_01_TwoSum {

	public static int[] twoSum1(int[] nums, int target) {
		int[] array = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] < target) {
				target -= nums[i];
			}
			if (nums[i] + nums[i + 1] == target) {
				array[0] = i;
				array[1] = i + 1;
			}
		}
		return array;
	}

	public static int[] twoSum2(int[] nums, int target) {
//		int j = 0;
		int sum = target;
		int[] array = new int[2];
		for (int i = 0, j = 0; i < nums.length - 1; i++, j++) {
			if (nums[i] <= target) {
				sum = sum - nums[i];
				System.out.println(i);
				array[j] = i;
//				j++;
			}
		}
		return array;
	}

	public static int[] twoSum3(int[] array, int target) {
		int[] arr = new int[2];
		int num = 0, sum = 0;
		for (int i = 0; i < array.length; i++) {
			num = array[i];
			for (int j = i + 1; j < array.length; j++) {
				sum = num + array[j];
				if (sum == target) {
					arr[0] = i;
					arr[1] = j;
					System.out.println("["+i+","+j+"]");
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int array[] = { 2, 7, 11, 15 };
		int target = 9;

		int array2[] = { 3, 2, 4 };
		int target2 = 6;
		
//		System.out.println("Array : "+array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("\nMethod 1");
		twoSum1(array, target);

		System.out.println("\nMethod 2");
		twoSum2(array2, target2);

		System.out.println("\nMethod 3");
		int arr[] = twoSum3(array2, target2);
		System.out.println(arr);

	}

}