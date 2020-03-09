package org.home.string;

import java.util.regex.Pattern;

/**
 * Reverse words in a given String in Java Let’s see an approach to reverse
 * words of a given String in Java without using any of the String library
 * function
 * 
 * Examples:
 * 
 * Input : "Welcome to geeksforgeeks" Output : "geeksforgeeks to Welcome"
 * 
 * Input : "I love Java Programming" Output :"Programming Java love I"
 * 
 * @author M1030797
 *
 */
public class ReverseWords {
	public static void main(String[] args) {
		String str = "This is java";
		System.out.println(reverseString(str));
	}

	private static String reverseString(String str) {
		Pattern p = Pattern.compile("\\s");
		String[] temp = p.split(str);
		StringBuilder builder = new StringBuilder();
		for (int i = temp.length - 1; i >= 0; i--) {
			if (i != 0) {
				builder.append(temp[i] + " ");
			} else {
				builder.append(temp[i]);
			}
		}
		return builder.toString();
	}
}
