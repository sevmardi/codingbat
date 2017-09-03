package sum3;

/**
 * 
 * Given an array of ints length 3, return the sum of all the elements.
 * 
 */
public class sum3 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5 };

		System.out.println(sum3(arr));
	}

	public static int sum3(int[] nums) {
		
		return nums[0] + nums[1] + nums[2];
	}
}
