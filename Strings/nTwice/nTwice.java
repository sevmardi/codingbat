package nTwice;

/**
 * 
 * Given a string and an int n, return a string made of the first and last n
 * chars from the string. The string length will be at least n.
 *
 */
public class nTwice {

	public static String nTwice(String str, int n) {

		if(str.length() < n) return "";
		
		return str.substring(0, n) + str.substring(str.length() - n);
	}

}
