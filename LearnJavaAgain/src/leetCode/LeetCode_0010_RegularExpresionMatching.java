package leetCode;

public class LeetCode_0010_RegularExpresionMatching {

	public static boolean isMatchUsingRegex(String s, String p) {
		String regex = p;
		if (s.matches(regex))
			return true;
		return false;
	}

	public static boolean isMatch(String s, String p) {
		//Still have to write the logic
		if (p.isEmpty())
			return false;
		int indexOfPatternForDot = p.indexOf('.');
		int indexOfPatternForAsterisk = p.indexOf('*');
		if(s.contains(p.subSequence(0, indexOfPatternForAsterisk)))
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isMatch("aa", "a"));
		System.out.println(isMatch("aa", "a*"));
		System.out.println(isMatch("aa", ".*"));
		System.out.println(isMatch("aa", ""));
	}

}
