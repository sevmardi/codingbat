package diff21;

public class Solution {

	public static void main(String[] args) {
		diff21(9);
	}

	public static int diff21(int n) {
		if (n <= 21) {
			return 21 - n;
		} else
			return (n - 21) * 2;

	}
}
