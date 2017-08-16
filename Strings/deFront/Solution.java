package deFront;

/**
 * Given a string, return a version without the first 2 chars. Except keep the
 * first char if it is 'a' and keep the second char if it is 'b'. The string may
 * be any length. Harder than it looks.
 * 
 * @author sevmardi
 *
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(deFront("xxcde"));
	}

	public static String deFront(String str) {
		   if(str.length() == 1 && str.charAt(0) != 'a')
		        return "";

		char first = 'a';
		char second = 'b';
		if (str.length() >= 2) {
			if (str.charAt(0) != first && str.charAt(1) != second) {
				return str.substring(2);
			}
			else if(str.charAt(0) != 'a') {
	            return str.substring(1);
	        } else if(str.charAt(1) != 'b') {
	            return "a" + str.substring(2);
	        }
		}
		return str;
	}
}
