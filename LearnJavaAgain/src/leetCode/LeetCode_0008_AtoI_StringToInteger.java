package leetCode;

public class LeetCode_0008_AtoI_StringToInteger {

	public static int myAtoi(String s) {
		String str = s.trim();
		int num = 0;
		if (str.contains(" ")) {
			int end = str.indexOf(' ');
			str = str.substring(0, end);
		}
		String newStr = str.replace("-", "");
		newStr = newStr.replace("+", "");
				
		for (int i = 0; i < newStr.length(); i++) {
			num = num * 10 + (newStr.charAt(i) - '0');
		}
		if (str.charAt(0) == '-' || str.charAt(str.length() - 1) == '-')
			num = num * -1;
		if (str.charAt(0) == '+' || str.charAt(str.length() - 1) == '+')
			num = num * 1;
		return num;
	}

	public static void main(String[] args) {
//		System.out.println(myAtoi("42"));
		System.out.println(myAtoi("    -42"));
//		System.out.println(myAtoi("4193 with words"));
	}

}
