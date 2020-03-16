package org.home.string;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Given an alphanumeric string, extract maximum numeric value from that string.
 * 
 * Examples:
 * 
 * Input : 100klh564abc365bg Output : 564 Maximum numeric value among 100, 564
 * and 365 is 564. Input : abchsd0365sdhs Output : 365
 * 
 * @author M1030797
 *
 */
public class ExtractMaximum {
	public static void main(String[] args) {
		String str = "100klh564abc365bg";
		System.out.println(maximum(str ));
		System.out.println(maximumRegex(str ));
	}
	
	private static BigInteger maximumRegex(String str) {
		String regex = "\\d+";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		BigInteger max = BigInteger.ZERO;
		while(m.find()) {
			BigInteger num = new BigInteger(m.group());
			if(num.compareTo(max) > 0) {
				max = num;
			}
		}
		return max;
	}

	private static int maximum(String str) {
		String temp = "0";
		List<Integer> numbers = new ArrayList<>();
		for(int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				temp += str.charAt(i);
			} else {
				if(!temp.equals("0")) {
					numbers.add(Integer.valueOf(temp));
				}
				temp = "0";
			}
		}
		return numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
	}
}
