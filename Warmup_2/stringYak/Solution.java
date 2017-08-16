package stringYak;

/**
 * 
 * Suppose the string "yak" is unlucky. Given a string, return a version where
 * all the "yak" are removed, but the "a" can be any char. The "yak" strings
 * will not overlap.
 * 
 * @author sevmardi
 *
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(stringYak("yak"));
	}
	public static String stringYak(String str) {
		String res = "";

		for (int i = 0; i < str.length(); i++) {

			if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
				i+=2;
			}
			else
				res += str.charAt(i);
		}
		
		return res;
	}
}
