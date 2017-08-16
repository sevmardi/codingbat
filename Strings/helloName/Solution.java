package helloName;

/**
 * 
 * @author sevmardi 
 * Given a string name, e.g. "Bob", return a greeting of the
 *         form "Hello Bob!".
 * 
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(helloName("Bob"));
	}

	public static String helloName(String name) {
		return ("Hello " + name + "!");
	}

}
