package stringNames;

/**
 * 
 * @author sevmardi
 * Objective: Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 */
public class Solution {

	public static void main(String[] args) {
		
		System.out.println(stringTimes("text", 10));
	}
	
	public static String stringTimes(String str, int n)
	{	
		String res = "";
		
		for(int i= 0; i < n; i++)
		{
			res += str;
		}
		
		return res;
	}
	
	
}
