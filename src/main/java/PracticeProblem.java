public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static boolean isPalindrome(String word) {
		word = word.replace(" ", "").toLowerCase();
		int mid = word.length() / 2;
		String firstHalf;
		String secondHalf;
		if (word.length() % 2 == 0) {
			// Even length
			firstHalf = word.substring(0, mid);
			secondHalf = word.substring(mid);
		} 
		else {
			firstHalf = word.substring(0, mid);
			secondHalf = word.substring(mid + 1);
		}
		String Second = "";
		for (int start = secondHalf.length() - 1; start >= 0; start--) {
			Second += secondHalf.charAt(start);
		}
		return firstHalf.equals(Second);
	}
}
