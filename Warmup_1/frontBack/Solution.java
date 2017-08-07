/**
 * 
 */
package frontBack;

/**
 * @author sevmardi Objective: Given a string, return a new string where the
 *         first and last chars have been exchanged.
 * 
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		System.out.println(frontBack("hello"));
	}

	public static String frontBack(String str) {
		if (str.length() <= 1)
			return str;

		String mid = str.substring(1, str.length() - 1);
		
		return str.charAt(str.length()-1) + mid + str.charAt(0);
	}
}
