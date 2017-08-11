package stringMatch;

/**
 * 
 * @author sevmardi Objective: Given 2 strings, a and b, return the number of
 *         the positions where they contain the same length 2 substring. So
 *         "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az"
 *         substrings appear in the same place in both strings.
 */
public class Solution {

	public int stringMatch(String a, String b) {
		int len = Math.min(a.length(), b.length());

		int count = 0;
		for (int i = 0; i < len -1; i++) {
			String aSub = a.substring(i, i + 2);
			String bSun = b.substring(i, i + 2);

			if (aSub.equals(bSun)) {
				count++;
			}
		}

		return count;
	}

}
