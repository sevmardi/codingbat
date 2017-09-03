package maxEnd3;

/**
 * 
 * Given an array of ints length 3, figure out which is larger, the first or
 * last element in the array, and set all the other elements to be that value.
 * Return the changed array.
 *
 */
public class maxEnd3 {
	public static int[] maxEnd3(int[] nums) {
		int max = nums[0] > nums[nums.length - 1] ? nums[0] : nums[nums.length - 1];

		nums[0] = max;
		nums[1] = max;
		nums[2] = max;

		return nums;
	}

}
