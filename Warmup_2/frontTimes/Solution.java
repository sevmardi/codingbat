package frontTimes;

/**
 * 
 * @author sevmardi Objective: Given a string and a non-negative int n, we'll
 *         say that the front of the string is the first 3 chars, or whatever is
 *         there if the string is less than length 3. Return n copies of the
 *         front;
 * 
 */
public class Solution {

	public static void main(String[] args) {
		
		System.out.println(frontTimes("text", 10));
	}

	public static String frontTimes(String str, int n) {

		int frontEnd = 3;
		if (frontEnd > str.length()) {
			frontEnd = str.length();
			
		}

		String front = str.substring(0, frontEnd);

		String res = "";

		for (int i = 0; i < n; i++) {
			res += front;
		}

		return res;
	}

}
