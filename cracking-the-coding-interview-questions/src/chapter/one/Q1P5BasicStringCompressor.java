package chapter.one;

/**
 * Implement a method to perform basic string compressions using the counts of
 * repeated characters. For example, the string aabcccccaaa would become
 * a2b1c5a3. If the "compressed" string would not become smaller than the
 * original string, your method should return the original string.
 * 
 * 
 * @author Justin Stringer
 */
public class Q1P5BasicStringCompressor {

	/**
	 * Receives a string and returns a string. Uses StringBuilder to create the
	 * return string.
	 * 
	 * @param inputString
	 * @return String, compressed string if shorter, else original string
	 */
	public String compressString(String inputString) {

		if (inputString == null || inputString.length() == 0 || inputString.length() == 1) {
			return inputString;
		}

		StringBuilder returnStringBuilder = new StringBuilder();

		int charCount = 1;
		for (int i = 1; i < inputString.length(); i++) {
			if (inputString.charAt(i) == inputString.charAt(i - 1)) {
				charCount++;
			} else {
				returnStringBuilder.append(inputString.charAt(i - 1));
				returnStringBuilder.append(charCount);
				charCount = 1;
			}
		}

		// Process the last character in the string.
		returnStringBuilder.append(inputString.charAt(inputString.length() - 1));
		returnStringBuilder.append(charCount);

		// Only return the compressed string if it is shorter than the original
		// string.
		if (returnStringBuilder.toString().length() >= inputString.length()) {
			return inputString;
		} else {
			return returnStringBuilder.toString();
		}
	}

	/**
	 * Receives a char array and returns a char array.
	 * 
	 * @param inputChars
	 * @return
	 */
	public char[] compressStringAsCharArray(char[] inputChars) {

		if (inputChars == null || inputChars.length == 0 || inputChars.length == 1) {
			return inputChars;
		}

		// Determine the size of the compressed char array.
		int charCount = 1;
		int compressedCharArrayLength = 0;
		for (int i = 1; i < inputChars.length; i++) {
			if (inputChars[i] == inputChars[i - 1]) {
				charCount++;
			} else {
				compressedCharArrayLength += 1 + String.valueOf(charCount).length();
				charCount = 1;
			}
		}

		// Process the last char in the char array.
		compressedCharArrayLength += 1 + String.valueOf(charCount).length();

		// If the length of the compressed char array will not be any shorter,
		// then just return the original char array.
		if (compressedCharArrayLength >= inputChars.length) {
			return inputChars;
		}

		char[] returnCompressedCharArray = new char[compressedCharArrayLength];

		charCount = 1;
		int inputCharArrayIndex = 1;
		int returnCharArrayIndex = 0;
		for (inputCharArrayIndex = 1, returnCharArrayIndex = 0; inputCharArrayIndex < inputChars.length; inputCharArrayIndex++) {
			if (inputChars[inputCharArrayIndex] == inputChars[inputCharArrayIndex - 1]) {
				charCount++;
			} else {
				returnCompressedCharArray[returnCharArrayIndex] = inputChars[inputCharArrayIndex - 1];
				returnCharArrayIndex++;

				char[] charCountAsCharArray = String.valueOf(charCount).toCharArray();
				for (int k = 0; k < charCountAsCharArray.length; k++) {
					returnCompressedCharArray[returnCharArrayIndex] = charCountAsCharArray[k];
					returnCharArrayIndex++;
				}

				charCount = 1;
			}
		}

		
		// Process the last char in the char array.
		returnCompressedCharArray[returnCharArrayIndex] = inputChars[inputCharArrayIndex - 1];
		returnCharArrayIndex++;

		char[] charCountAsCharArray = String.valueOf(charCount).toCharArray();
		for (int k = 0; k < charCountAsCharArray.length; k++) {
			returnCompressedCharArray[returnCharArrayIndex] = charCountAsCharArray[k];
			returnCharArrayIndex++;
		}

		return returnCompressedCharArray;
	}

}
