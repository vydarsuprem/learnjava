package leetCode;

public class LeetCode_03_SubString {

	public static int lengthOfLongestSubstring(String s) {
		int num = 0;
		int len=s.length();
		String str = "";
		char array[] = new char[len];
		for(int i=0;i<len;i++) {
			array[i]=s.charAt(i);
		}
		
		System.out.println(s);
		for(int i=0;i<len;i++) {
			System.out.print(array[i]);
		}
		
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(array[i]==array[j]) {
					num=i;
				} else {
//					str+array[i];
				}
			}
		}
		System.out.println();
		return num;
	}

	public static void main(String[] args) {
//		lengthOfLongestSubstring("abcdefgh");
		int a = lengthOfLongestSubstring("abcabcbb");
		System.out.println(a);
//		lengthOfLongestSubstring("bbbbb");
//		lengthOfLongestSubstring("pwwkew");
	}

}
