package stringSplosion;

/**
 * 
 * @author sevmardi 
 * Objective: Given a non-empty string like "Code" return a
 *         string like "CCoCodCode".
 * 
 * 
 */
public class Solution {

	public static void main(String[] args) {

		System.out.println(stringSplosion("Code"));
	}
	
	public static String stringSplosion(String str)
	{
		String res = "";
		
		for (int i = 0; i < str.length(); i++) {
			res+= str.substring(0, i+1);
			
		}
		
		return res;
		
	}
}
