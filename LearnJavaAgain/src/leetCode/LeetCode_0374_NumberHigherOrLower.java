package leetCode;

public class LeetCode_0374_NumberHigherOrLower {

	public static int guess(int num) {
		int pick = 6;
		if (num > pick) {
			return -1;
		} else if (num < pick) {
			return 1;
		} else {
			return 0;
		}
	}

	public static int guessNumber(int n) {
		int low = 1;
		int high = n;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int guess = guess(mid);
			if (guess == 0) {
				return mid;
			} else if (guess > 0) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(guessNumber(10));
	}

}
