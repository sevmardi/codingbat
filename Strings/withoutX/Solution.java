package withoutX;

/**
 * 
 * Given a string, if the first or last chars are 'x', return the string without
 * those 'x' chars, and otherwise return the string unchanged.
 * 
 * @author sevmardi
 *
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(withoutX("xHi"));
	}

	public static String withoutX(String str) {

		int start = 0;
		int end = str.length();

		if (str.length() > 0 && str.charAt(0) == 'x')
			start = 1;
		if (str.length() > 1 && str.charAt(str.length() - 1) == 'x')
			end--;

		return str.substring(start, end);
	}
}
