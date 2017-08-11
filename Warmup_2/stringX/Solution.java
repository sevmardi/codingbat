package stringX;

/**
 * 
 * @author sevmardi Objective: Given a string, return a version where all the
 *         "x" have been removed. Except an "x" at the very start or end should
 *         not be removed.
 */
public class Solution {

	public static void main(String[] args) {

	}

	public String stringX(String str) {

		String res = "";

		for (int i = 0; i < str.length(); i++)

		{
			if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
				res += str.substring(i, i + 1);
			}
		}

		return res;
	}

}
