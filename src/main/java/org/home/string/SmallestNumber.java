package org.home.string;

/**
 * https://www.geeksforgeeks.org/smallest-number-sum-digits-n-divisible-10n/
 * 
 * @author M1030797
 *
 */
public class SmallestNumber {
	public static void main(String[] args) {
		int n = 5;
		System.out.print("The number is :");
		digitsSum(n);
	}

	private static void digitsSum(int n) {
		if (n == 0) {
			System.out.print("0");
		}
		if (n % 9 != 0) {
			System.out.print(n % 9);
		}

		for (int i = 1; i <= n / 9; i++) {
			System.out.print("9");
		}
		for (int i = 1; i <= n; ++i)
			System.out.print("0");
		System.out.print("");
	}
}
