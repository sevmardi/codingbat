package nonStart;

/**
 * Given 2 strings, return their concatenation, except omit the first char of
 * each. The strings will be at least length 1.
 * 
 * @author sevmardi
 *
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(nonStart("Hello", "World"));
	}
	public static String nonStart(String a, String b) {
		  
		return (a.substring(1)) + b.substring(1);
	}
}
