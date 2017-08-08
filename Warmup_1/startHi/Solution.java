package startHi;

/**
 * 
 * @author sevmardi
 * Objective: Given a string, return true if the string starts with "hi" and false otherwise.
 */
public class Solution {

	public static void main(String[] args) {
		
		System.out.println(startHi("hi"));
	}
	
	
	public static boolean startHi(String given)
	{
		if (given.length() < 2) return false;
		
		String firstTwo = given.substring(0, 2);
		
		return (firstTwo.equals("hi"));
	}
}
