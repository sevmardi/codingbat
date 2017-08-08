package front22;

/**
 * 
 * @author sevmardi 
 * Objective: Given a string, take the first 2 chars and return
 *         the string with the 2 chars added at both the front and back, so
 *         "kitten" yields"kikittenki". If the string length is less than 2, use
 *         whatever chars are there.
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(font22("hello"));
	}

	public static String font22(String str) {
	
		int take = 2;
		if(take > str.length())
		{
			take = str.length();
		}
		String front = str.substring(0, take);
		return front  + str + front;
		
	}
}
