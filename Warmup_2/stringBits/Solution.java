package stringBits;

/**
 * 
 * @author sevmardi 
 * Objective: Given a string, return a new string made of every
 *         other char starting with the first, so "Hello" yields "Hlo".
 * 
 */
public class Solution {

	public static void main(String[] args) {

		System.out.println(stringBits("text"));
	}

	public static String stringBits(String str) {

		String res = "";
		
		for(int i = 0; i < str.length(); i+=2 ){
			res+=str.substring(i, i+1);
		}
		
		return res;
	}
}
