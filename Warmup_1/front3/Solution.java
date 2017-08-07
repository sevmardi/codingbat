/**
 * 
 */
package front3;

/**
 * @author sevmardi 
 * Objective: Given a string, we'll say that the front is the
 *         first 3 chars of the string. If the string length is less than 3, the
 *         front is whatever is there. Return a new string which is 3 copies of
 *         the front.
 */
public class Solution {

	public static void main(String[] args) {

		System.out.println(font3("Hello there "));
	}
	
	public static final String font3(String str)
	{
		String font; 
		
		if(str.length() <= 1) return str;
		
		if(str.length() >= 3) {
			font = str.substring(0, 3);
		}
		else
			font = str;
		return font+=font + font;
	}

}
