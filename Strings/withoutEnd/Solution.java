package withoutEnd;

/**
 * Given a string, return a version without the first and last char, so "Hello"
 * yields "ell". The string length will be at least 2.
 * 
 * @author sevmardi
 *
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(withoutEnd("test"));
	}

	public static String withoutEnd(String str) {

		if (str.length() <= 1)
			return str;
		
		return str.substring(1, str.length() - 1);
	}

}
