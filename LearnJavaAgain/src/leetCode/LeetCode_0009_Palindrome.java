package leetCode;

public class LeetCode_0009_Palindrome {

	public static boolean isPalindrome(int x) {
		boolean result = false;
		if (x < 0) {
			result = false;
		} else {
			int num = x;
			int reverse = 0;
			while (num != 0) {
				reverse = reverse * 10 + num % 10;
				num = num / 10;
			}
			if (reverse == x)
				result = true;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(-121));
		System.out.println(isPalindrome(1021));

	}

}
