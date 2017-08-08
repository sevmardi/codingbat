package hasTeen;

/**
 * 
 * @author sevmardi 
 * Objective: We'll say that a number is "teen" if it is in the
 *         range 13..19 inclusive. Given 3 int values, return true if 1 or more
 *         of them are teen.
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(hasTeen(10, 2, 9));
	}

	public static boolean hasTeen(int a, int b, int c) {
		return (a>=13 && a<=19) ||
		         (b>=13 && b<=19) ||
		         (c>=13 && c<=19);
	}
}
