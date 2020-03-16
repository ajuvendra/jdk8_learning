package org.home.string;

/**
 * Given a string containing alphanumeric characters, calculate sum of all
 * numbers present in the string.
 * 
 * Examples:
 * 
 * Input: 1abc23 Output: 24
 * 
 * Input: geeks4geeks Output: 4
 * 
 * Input: 1abc2x30yz67 Output: 100
 * 
 * Input: 123abc Output: 123
 * 
 * @author M1030797
 *
 */
public class SumOfAllNumbers {
	static int findSum(String str) {
		String temp = "";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				temp += ch;
			} else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		return sum + Integer.parseInt(temp);
	}

	public static void main(String[] args) {
		String str = "12abc20yz68";
		System.out.println(findSum(str));
	}
}
