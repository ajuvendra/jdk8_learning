package org.home.string;

/**
 * Given two numbers as strings. The numbers may be very large (may not fit in
 * long long int), the task is to find sum of these two numbers.
 * 
 * Examples:
 * 
 * Input : str1 = "3333311111111111", str2 = "44422222221111" Output :
 * 3377733333332222
 * 
 * Input : str1 = "7777555511111111", str2 = "3332222221111" Output :
 * 7780887733332222
 * 
 * @author M1030797
 *
 */
public class SumTwoLargeNumber {
	public static void main(String[] args) {
		String str1 = "7777555511111111";
		String str2 = "3332222221111";
		System.out.println(findSum(str1, str2));
	}

	private static String findSum(String str1, String str2) {
		if(str1.length() > str2.length()) {
			String temp = str1;
			str1 = str2;
			str2 = temp;
		}
		char []ch1 = str1.toCharArray();
		char []ch2 = str2.toCharArray();
		
		int counter = ch1.length - 1;
		int remainder = 0;
		StringBuilder builder = new StringBuilder();
		
		for(int i = ch2.length - 1; i >= 0; i--) {
			int num1 = 0;
			if(counter >= 0) {
				num1 = Integer.valueOf(String.valueOf(ch1[counter]));
				counter--;
			}
			int num2 = Integer.valueOf(String.valueOf(ch2[i]));
			int sum = num1 + num2 + remainder;
			remainder = 0;
			if(sum > 9) {
				remainder = Integer.valueOf(String.valueOf(String.valueOf(sum).toCharArray()[0]));
				builder.append(String.valueOf(sum).toCharArray()[1]);
			} else {
				builder.append(sum);
			}
		}
		return builder.reverse().toString();
	}
}
