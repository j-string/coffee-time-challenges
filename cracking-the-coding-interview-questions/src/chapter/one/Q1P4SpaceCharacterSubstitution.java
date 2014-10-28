package chapter.one;

/**
 * 
 * @author Justin Stringer
 */
public class Q1P4SpaceCharacterSubstitution {

	/**
	 * @param inputString
	 * @return
	 */
	public String replaceSpaceCharacters(String inputString) {

		if (inputString == null) {
			return null;
		} else if (inputString.isEmpty() || !inputString.contains(" ")) {
			return inputString;
		} else {
			char[] inputChars = inputString.toCharArray();
			for (int i = 0; i < inputChars.length; i++) {
				if (inputChars[i] == ' ')
				{
					inputChars = this.shiftArrayElements(inputChars, i, 3);
					inputChars[i] = '%';
					inputChars[i+1] = '2';
					inputChars[i+2] = '0';
				}
			}

			return new String(inputChars);
		}
	}

	/**
	 * @param inputChars
	 * @param shiftFrom
	 * @param numberOfPositions
	 */
	char[] shiftArrayElements(char[] inputChars, int shiftFrom,
			int numberOfPositions) {
		if (inputChars == null || inputChars.length == 0
				|| numberOfPositions == 0) {
			return inputChars;
		} else if (shiftFrom >= inputChars.length - 1) {
			throw new RuntimeException(
					"Cannot shift from the end of the array or beyond!");
		} else {
			for (int i = inputChars.length - 1; i >= shiftFrom
					+ numberOfPositions; i--) {
				inputChars[i] = inputChars[i - numberOfPositions];
			}
			return inputChars;
		}
	}
}
