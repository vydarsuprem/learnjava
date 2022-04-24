package leetCode;

import java.util.Scanner;

public class LeetCode_0007_ReverseInteger {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Maximun : " + Integer.MAX_VALUE);
		System.out.println("Minimun : " + Integer.MIN_VALUE);
		System.out.println(1534236469);
		System.out.println(1463847412);
		System.out.print("Enter number : ");
		int number = src.nextInt();
		System.out.println("Number : "+number);
		
		int reverse = reverse(number);
		System.out.println("Reverse : "+reverse);
		
		reverse = reverse2(number);
		System.out.println("Reverse 2 : "+reverse);
		src.close();
	}

	public static int reverse(int x) {
		int sum = 0;
		while (x != 0) {
			int y = 0;
			y = x % 10;
			x = x / 10;
			if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE && y == 7))
				return 0;
			if (sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE && y == -8))
				return 0;
			sum = sum * 10 + y;
		}
		return sum;
	}

	public static int reverse2(int x) {
		long rev = 0;
		int sign = 1;
		if (x < 0) {
			sign = -1;
			x *= -1;
		}
		int temp = x;
		while (temp != 0) {
			int rem = temp % 10;
			rev = (rev * 10) + rem;
			temp /= 10;
		}
		if (sign == -1) {
			rev *= -1;
		}
		if (rev > Integer.MAX_VALUE)
			return 0;
		else if (rev < Integer.MIN_VALUE)
			return 0;
		else
			return (int) rev;
	}

}
