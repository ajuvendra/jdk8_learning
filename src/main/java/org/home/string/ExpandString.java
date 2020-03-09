package org.home.string;

/**
 * Java program to expand a String if range is given? Suppose we have given a
 * String in which some ranges as specified and we have to place the numbers
 * which is between the given range in the specified place as given in the
 * example:
 * 
 * Input : string x = "1-5, 8, 11-14, 18, 20, 26-29" Output : string y = "1, 2,
 * 3, 4, 5, 8, 11, 12, 13, 14, 18, 20, 26, 27, 28, 29"
 * 
 * @author M1030797
 *
 */
public class ExpandString {
	public static void main(String[] args) {
		String str = "1-5, 8, 11-14, 18, 20, 26-29"; 
        System.out.println(expand(str)); 
	}

	private static String expand(String str) {
		String s[] = str.split(", ");
		StringBuilder builder = new StringBuilder();
		for (String string : s) {
			if(string.indexOf("-") >= 0) {
				String start[] = string.split("-");
				for(int i = Integer.parseInt(start[0]); i <= Integer.parseInt(start[1]); i++) {
					builder.append(i + ", ");
				}
			} else {
				builder.append(string + ", ");
			}
		}
		return builder.toString().substring(0, builder.toString().length() - 2);
	}

}
