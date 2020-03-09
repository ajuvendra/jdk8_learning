package org.home.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Given a string, extract the first letter of each word in it. “Words” are
 * defined as contiguous strings of alphabetic characters i.e. any upper or
 * lower case characters a-z or A-Z.
 * 
 * Examples:
 * 
 * Input : Geeks for geeks Output :Gfg
 * 
 * Input : United Kingdom Output : UK
 * 
 * @author M1030797
 *
 */
public class FirstLetterOfWord {
	public static void main(String[] args) {
		String str = "A Computer Science Portal for Geeks";
		System.out.println(firstLetters(str));
	}

	private static String firstLetters(String str) {
		String regex = "\\b[a-zA-Z]";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		StringBuilder builder = new StringBuilder();
		
		while(m.find()) {
			builder.append(m.group());
		}
		return builder.toString();
	}
}
