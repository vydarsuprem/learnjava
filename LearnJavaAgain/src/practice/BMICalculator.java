package practice;

public class BMICalculator {

	public static float returnWeight(String str) {
		String[] arr = str.split("@");
		String f = arr[0].replace("-", ".");
		Float floatVal = Float.valueOf(f).floatValue();
		return floatVal;
	}

	public static float returnHeight(String str) {
		String[] arr = str.split("@");
		String f = arr[1].replace("-", ".");
		Float floatVal = Float.valueOf(f).floatValue();
		return floatVal;
	}

	public static void main(String[] args) {
		System.out.println(returnWeight("96-2@19-6"));
	}

}
