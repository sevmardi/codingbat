package theEnd;

/**
 * 
 * Given a string, return a string length 1 from its front, unless front is
 * false, in which case return a string length 1 from its back. The string will
 * be non-empty.
 * 
 * @author sevmardi
 *
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(theEnd("Text", true));
	}
	
	
	public static String theEnd(String str, boolean front) {
		  
		if(front)
			return str.substring(0,1);
		return str.substring(str.length() - 1);
	}

}
