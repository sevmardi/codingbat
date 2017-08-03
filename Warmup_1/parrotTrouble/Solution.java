package parrotTrouble;

/**
 * 
 * @author sevmardi 
 * Objective: We have a loud talking parrot. The "hour"
 *         parameter is the current hour time in the range 0..23. We are in
 *         trouble if the parrot is talking and the hour is before 7 or after
 *         20. Return true if we are in trouble.
 */

public class Solution {

	public static void main(String[] args) {
		System.out.println(parrotTrouble(true, 10));
	}

	public static boolean parrotTrouble(boolean talking, int hour) {
		return (talking && (hour < 7 || hour > 20));
	}

}
