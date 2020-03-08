package org.home.string;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Write a Java Program to Swap first and last character of words in a Sentence
 * as mentioned in the example?
 * 
 * Examples:
 * Input : geeks for geeks 
 * Output :seekg rof seekg
 * 
 * @author M1030797
 *
 */
public class SwapFirstLastCharacters {
	static String doSwapping(String str) {
		String s[] = str.split(" ");
		String temp = "";
		for(int i = 0; i < s.length; i++) {
			char chFirst = s[i].charAt(0);
			char chLast = s[i].charAt(s[i].length() - 1);
			temp = s[i].substring(1, s[i].length() - 1);
			temp = chLast + temp + chFirst;
			s[i] = temp;
		}
		// String.join is added in JDK8, we can use Collectors.joining as well
		return Arrays.stream(s).collect(Collectors.joining(" "));
//		return String.join(" ", s);
	}
	public static void main(String[] args) {
		String str = "geeks for geeks";
		System.out.println(doSwapping(str));
		
	}
}
