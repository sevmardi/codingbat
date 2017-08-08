package or35;

/**
 * 
 * @author sevmardi 
 * Objective: Return true if the given non-negative number is a
 *         multiple of 3 or a multiple of 5. Use the % "mod" operator
 * 
 */
public class Solution {

	public static void main(String[] args) {

		System.out.println(or35(5));
	}

	public static boolean or35(int number) {
		
		return (number % 3 == 0 || number % 5 == 0);
	}
}
