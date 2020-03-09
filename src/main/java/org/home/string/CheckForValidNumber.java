package org.home.string;

/**
 * Validate if a given string is numeric.
 * 
 * Examples:
 * 
 * Input : str = "11.5" Output : true
 * 
 * Input : str = "abc" Output : false
 * 
 * Input : str = "2e10" Output : true
 * 
 * Input : 10e5.4 Output : false
 * 
 * @author M1030797
 *
 */
public class CheckForValidNumber {
	public static void main(String[] args) {
		String str = "-10000000000000";
				
		System.out.println(validateInteger(str));
		System.out.println(validateIntegerRegex(str));
		System.out.println(validateFloatRegex(str));
	}

	private static String validateIntegerRegex(String str) {
		String regex = "[+-]?[0-9][0-9]*";
		if(str.matches(regex)) {
			return str + " is a valid integer number";
		} else {
			return str + " is not a valid integer number";
		}
	}
	
	private static String validateFloatRegex(String str) {
		String regex = "[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?";
		if(str.matches(regex)) {
			return str + " is a valid float number";
		} else {
			return str + " is not a valid float number";
		}
	}
	private static String validateInteger(String str) {
		try {
			Integer.parseInt(str);
		} catch (Exception e) {
			return str + " is not a valid integer number";
		}
		return str + " is a valid integer number";
	}
}
