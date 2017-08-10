package doubleX;

/**
 * 
 * @author sevmardi 
 * Objective: Given a string, return true if the first instance
 *         of "x" in the string is immediately followed by another "x".
 */
public class Solution {

	public static void main(String[] args) {
		
		System.out.println(doubleX("Trex"));
	}
	
	public static boolean doubleX(String str)
	{
		int i = str.indexOf("x");
		
		String x = str.substring(i);
		
		return x.startsWith("xx");
	}
}
