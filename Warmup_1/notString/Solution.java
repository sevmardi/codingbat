package notString;

/**
 * 
 * @author sevmardi Objective: Given a string, return a new string where "not "
 *         has been added to the front. However, if the string already begins
 *         with "not", return the string unchanged. Note: use .equals() to
 *         compare 2 strings.
 */

public class Solution {

	public static void main(String[] args) {
		System.out.println(notString("github"));
	}

	public static String notString(String str) {
		if (str.length() >= 3 && str.substring(0, 3).equals("not"))
			return str;
		return "not " + str;
	}

}
