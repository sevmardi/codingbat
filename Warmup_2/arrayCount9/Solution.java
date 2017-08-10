package arrayCount9;

/**
 * 
 * @author sevmardi Objective:Given an array of ints, return the number of 9's
 *         in the array.
 */
public class Solution {
	public static void main(String[] args) {

		int[] arr = {1,2,9};
		
		System.out.println(arrayCount9(arr));
		
		
	}
	
	public static int arrayCount9(int[] arr)
	{
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 9)
			{
				count++;
			}
		}
		
		return count;
	}
}
