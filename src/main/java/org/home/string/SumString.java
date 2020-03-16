package org.home.string;

/**
 * Not working yet
 * 
 * @author M1030797
 *
 */

public class SumString {

	public static void main(String[] args) {
		System.out.println(isSumStr("1212243660"));
	}

	private static boolean isSumStr(String str) {
		int len = str.length();
		for (int i = 1; i < len; i++) {
			for (int j = i + 1; i + j <= len; j++) {
				if (checkSumStrUtil(str, 0, i, j)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean checkSumStrUtil(String str, int beg, int len1, int len2) {
		String s1 = str.substring(beg, len1);
		String s2 = str.substring(beg + len1, len2);
		System.out.println("S1: " + s1 + " S2: " + s2);
		String s3 = stringSum(s1, s2);
		System.out.println("Sum: " + s3);

		int s3_len = s3.length();
		if (s3_len > str.length() - len1 - len2 - beg)
			return false;
		
		if (s3.equals(str.substring(beg + len1 + len2 - 1, beg + len1 + len2 + s3_len))) { 
			  
	        // if we reach at the end of the string 
	        if (beg + len1 + len2 + s3_len == str.length()) 
	            return true; 
	  
	        // otherwise call recursively for n2, s3 
	        return checkSumStrUtil(str, beg + len1, len2, 
	                                              s3_len); 
	    } 
		
		return false;
	}

	private static String stringSum(String s1, String s2) {
		int sum = Integer.valueOf(s1) + Integer.valueOf(s2);
		return String.valueOf(sum);
	}
}
