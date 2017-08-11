package altPairs;

/**
 * 
 * @author sevmardi Objective: Given a string, return a string made of the chars
 *         at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(altPairs("kittens"));
		
	}
	public static final String altPairs(String str) {

		String res = "";

		for (int i = 0; i < str.length(); i += 4) {
			int end = i + 2;
			if (end > str.length()) {
				end = str.length();
			}
			res += str.substring(i, end);
		}
		return res;
	}
}
