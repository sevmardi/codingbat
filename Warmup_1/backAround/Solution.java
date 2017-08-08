package backAround;

/**
 * 
 * @author sevmardi 
 * Objective: Given a string, take the last char and return a
 *         new string with the last char added at the front and back, so "cat"
 *         yields "tcatt". The original string will be length 1 or more.
 */
public class Solution {

	public static void main(String[] args) {

		System.out.println(backAround("text"));
	}

	public static String backAround(String str)
	{
		// take the string 
		// check the length of the string 
		String last = str.substring(str.length() -1);
		
		return last + str + last;
	}
}
