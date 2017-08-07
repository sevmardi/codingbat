/**
 * 
 */
package sumDouble;

/**
 * @author sevmardi 
 * Objective: Given two int values, return their sum. Unless
 *         the two values are the same, then return double their sum.
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		System.out.println(sumDouble(5, 10));
	}
	

	public static int sumDouble(int a, int b) {
		if(a == b)
		{
			int dValue = (a+b) * 2;
			return dValue;
		}
		int sum = a + b;
		
		return sum;
		
 	}
}
