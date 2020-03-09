package org.home.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Possible Words using given characters in Python Given a dictionary and a
 * character array, print all valid words that are possible using characters
 * from the array. Note: Repetitions of characters is not allowed. Examples:
 * 
 * Input : Dict = ["go","bat","me","eat","goal","boy", "run"] arr =
 * ['e','o','b', 'a','m','g', 'l'] Output : go, me, goal.
 * 
 * @author M1030797
 *
 */
public class PossibleWords {
	public static void main(String[] args) {
		String []input = {"go", "bat", "me", "eat", "goal", "boy", "run"};
		char []charset = {'e', 'o', 'b', 'a', 'm', 'g', 'l'};
		System.out.println(possibleWords(input, charset));
	}

	private static List<String> possibleWords(String[] words, char[] charset) {
		List<String> list = new ArrayList<>();
		String chars = new String(charset);
		
		for (String word : words) {
			char []charsInWord = word.toCharArray();
			boolean flag = true;
			for(int i = 0; i < charsInWord.length; i++) {
				if(chars.indexOf(charsInWord[i]) < 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				list.add(word);
			}
		}
		return Collections.unmodifiableList(list);
	}
}
