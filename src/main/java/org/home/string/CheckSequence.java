package org.home.string;

/**
 * Given an input string and a pattern, check if characters in the input string
 * follows the same order as determined by characters present in the pattern.
 * Assume there won’t be any duplicate characters in the pattern.
 * 
 * Examples:
 * 
 * Input: string = "engineers rock" pattern = "er"; Output: true Explanation:
 * All 'e' in the input string are before all 'r'.
 * 
 * Input: string = "engineers rock" pattern = "egr"; Output: false Explanation:
 * There are two 'e' after 'g' in the input string.
 * 
 * Input: string = "engineers rock" pattern = "gsr"; Output: false Explanation:
 * There are one 'r' before 's' in the input string.
 * 
 * @author M1030797
 *
 */
public class CheckSequence {
	public static void main(String[] args) {
		String str = "engineers rock";
		String pattern = "er";
		System.out.println(checkOrder(str, pattern));
	}

	private static boolean checkOrder(String str, String pattern) {
		boolean result = false;
		
		return result;
	}
	
	
}
