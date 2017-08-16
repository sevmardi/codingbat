package seeColor;

/**
 * Given a string, if the string begins with "red" or "blue" return that color
 * string, otherwise return the empty string.
 * 
 * @author sevmardi
 *
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(seeColor("red"));
	}

	public static String seeColor(String str) {

		if (str.length() >= 3 && str.substring(0, 3).equals("red"))
			return "red";

		if (str.length() >= 4 && str.substring(0, 4).equals("blue"))
			return "blue";

		return "";
	}
}
