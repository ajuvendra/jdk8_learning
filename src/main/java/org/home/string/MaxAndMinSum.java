package org.home.string;

/**
 * Given two positive numbers calculate the minimum and maximum possible sums of
 * two numbers. We are allowed to replace digit 5 with digit 6 and vice versa in
 * either or both the given numbers.
 * 
 * Examples :
 * 
 * Input : x1 = 645 x2 = 666 Output : Minimum Sum: 1100 (545 + 555) Maximum Sum:
 * 1312 (646 + 666)
 * 
 * Input: x1 = 5466 x2 = 4555 Output: Minimum sum: 10010 Maximum Sum: 11132
 * 
 * @author M1030797
 *
 */
public class MaxAndMinSum {
	public static void main(String[] args) {
		int x1 = 5466;
		int x2 = 4555;
		calculateMaxAndMin(x1, x2);
	}

	private static void calculateMaxAndMin(int x1, int x2) {
		String strX1 = String.valueOf(x1);
		String strX2 = String.valueOf(x2);
		System.out.println(maxSum(strX1.replaceAll("5", "6"), strX2.replaceAll("5", "6")));
		System.out.println(minSum(strX1.replaceAll("6", "5"), strX2.replaceAll("6", "5")));
	}

	static long maxSum(String x1, String x2) {
		return Long.valueOf(x1) + Long.valueOf(x2);
	}

	static long minSum(String x1, String x2) {
		return Long.valueOf(x1) + Long.valueOf(x2);
	}
}
