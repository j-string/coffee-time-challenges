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
	 * @param inputString
	 * @return
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

		returnStringBuilder.append(inputString.charAt(inputString.length() - 1));
		returnStringBuilder.append(charCount);

		return returnStringBuilder.toString();
	}

}
