package swapEnds;

/**
 *
 * Given an array of ints, swap the first and last elements in the array. Return
 * the modified array. The array length will be at least 1.
 *
 */
public class Solution {

	public static void main(String[] args) {
		
	}
	public static int[] swapEnds(int[] nums) {
		  int temp = nums[0];
		  nums[0] = nums[nums.length - 1];
		  nums[nums.length - 1] = temp;
		  return nums;
		  
	}
}
