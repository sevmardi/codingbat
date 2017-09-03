package withouEnd2;

/**
 * 
 * Given a string, return a version without both the first and last char of the
 * string. The string may be any length, including 0.
 * 
 * @author sevmardi
 *
 */
public class withouEnd2 {

	public static void main(String[] args) {
		System.out.println(withouEnd2("test"));
	}
	public static String withouEnd2(String str) {
		
	    if(str.length() <= 2)
	        return "";
	    
	    return str.substring(1, str.length() - 1);
	}

}
