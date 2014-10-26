package chapter.one;

public class Q1P2ReverseString {

	public String reverseString(String inputString) {

		StringBuilder reversedString = null;

		if (inputString == null || inputString.isEmpty() || inputString.length() == 1) { return inputString; }
		else {
			reversedString = new StringBuilder();
			for (int i=inputString.length()-1; i>=0; i--){
				reversedString.append(inputString.charAt(i));
			}
		}

		return reversedString.toString();
	}

}
