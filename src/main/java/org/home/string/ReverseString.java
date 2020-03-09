package org.home.string;

/**
 * Reverse a string in Java 
 * 
 * Input: s = "abc" Output: s = "cba"
 * 
 * @author M1030797
 *
 */
public class ReverseString {
	public static void main(String[] args) {
		String str = "This is java.";
		System.out.println(reverseWithBuiltInFunction(str));
		System.out.println(reverseWithCharArray(str));
	}

	private static String reverseWithBuiltInFunction(String str) {
		StringBuilder builder = new StringBuilder(str);
		return builder.reverse().toString();
	}
	
	private static String reverseWithCharArray(String str) {
		char []arr = str.toCharArray();
		char []result = new char[arr.length];
		for(int i = 0; i < arr.length; i++) {
			result[i] = arr[arr.length - i - 1];
		}
		return new String(result);
	}
}
