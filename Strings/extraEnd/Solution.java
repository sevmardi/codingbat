package extraEnd;

/**
 * Given a string, return a new string made of 3 copies of the last 2 chars of
 * the original string. The string length will be at least 2.
 * 
 * @author sevmardi
 *
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(extraEnd("test"));
	}

	public static String extraEnd(String str) {
		
		if(str.length() <= 2) return "";
		
		String last  = str.substring(str.length() - 2);
		
		return last+=last + last;
	}
}
