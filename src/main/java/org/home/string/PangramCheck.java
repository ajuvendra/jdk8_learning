package org.home.string;

/**
 * Given a string check if it is Pangram or not. A pangram is a sentence
 * containing every letter in the English Alphabet. Lowercase and Uppercase are
 * considered the same.
 * 
 * Examples:
 * 
 * Input : str = 'The quick brown fox jumps over the lazy dog' Output : Yes //
 * Contains all the characters from ‘a’ to ‘z’
 * 
 * Input : str='The quick brown fox jumps over the dog' Output : No // Doesn’t
 * contains all the characters from ‘a’ // to ‘z’, as ‘l’, ‘z’, ‘y’ are missing
 * 
 * @author M1030797
 *
 */
public class PangramCheck {
	public static void main(String[] args) {
		String str =  "The quick brown fox jumps over the lazy dog";
		System.out.println(isPangram(str));
		str = "The quick brown fox jumps over the dog";
		System.out.println(isPangram(str));
	}

	private static boolean isPangram(String str) {
		boolean result = true;
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		str = str.toLowerCase();
		for(int i = 0; i < alphabets.length();i++) {
			if(str.indexOf(alphabets.charAt(i)) < 0) {
				result = false;
				break;
			}
		}
		return result;
	}
}
