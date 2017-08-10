package arrayFront9;

/**
 * 
 * @author sevmardi 
 * Objective: Given an array of ints, return true if one of the
 *         first 4 elements in the array is a 9. The array length may be less
 *         than 4.
 */
public class Solution {

	public static boolean arrayFront9(int[] nums) {
		  
		if(nums.length < 4) return false;
		
		int end = nums.length;
		if(end < 4 ) end = 4;
		
		for (int i = 0; i < end; i++) {
			if(nums[i] == 9)
			{
				return true;
			}
		}
		
		return false;
	}

}
