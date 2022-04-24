package practice;

public class Fibonacci {

	public static void printSeries(int num1, int num2, int limit) {
		System.out.println(num1);
		do {
			int num;
			System.out.println(num2);
			num = num1;
			num1 = num2;
			num2 = num + num1;
		} while (num2 < limit);
	}

	public static void printSeries2(int num1, int num2, int limit) {
		System.out.print("0 : " + num1 + "\t");
		for (int i = 1; num2 < limit; i++) {
			int num;
			System.out.print(i + " : " + num2 + "\t");
			num = num1;
			num1 = num2;
			num2 = num + num1;
		}
	}

	public static int fib(int n) {
		int F[] = new int[n + 2];
		F[0] = 0;
		F[1] = 1;
		for (int i = 0; i < n; i++) {
			F[i + 2] = F[i + 1] + F[i];
		}
		return F[n];
	}

	public static void main(String[] args) {
//		printSeries(0, 1, 20);
		printSeries2(0, 1, 20);
		System.out.println();
		System.out.println(fib(4));
	}

}
