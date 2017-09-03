package right2;

/**
 * 
 * Given a string, return a "rotated right 2" version where the last 2 chars are
 * moved to the start. The string length will be at least 2.
 *
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(right2("hello"));
	}

	public static String right2(String str) {
		if(str.length() <  2) return "";
		String newString = "";
		if(str.length() >= 2)
		{
			newString =	str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
			
		}
		
		return newString;
	}

}
