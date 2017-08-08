package in1020;
/**
 * 
 * @author sevmardi
 * Objective: Given 2 int values, return true if either of them is in the range 10..20 inclusive.
 */
public class Solution {

	public static void main(String[] args) {
		
		System.out.println(in1020(-9, 29));
	}
	
	public static boolean in1020(int val1, int val2)
	{
		if ( (val1 >= 10 && val1 <= 20)|| (val2 >= 10 || val2 <= 20) ){
			return true;
		}
		return false;
	}
}
