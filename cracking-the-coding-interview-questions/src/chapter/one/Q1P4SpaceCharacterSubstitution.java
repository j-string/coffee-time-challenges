package chapter.one;

import java.util.logging.Logger;

/**
 * 
 * @author Justin Stringer
 */
public class Q1P4SpaceCharacterSubstitution {

	private final Logger logger = Logger.getLogger(this.getClass().getName());

	/**
	 * @param inputChars
	 * @param trueLength
	 * @return
	 */
	public char[] replaceSpaceCharacters(char[] inputChars, int trueLength) {

		if (inputChars == null) {
			return null;
		} else if (inputChars.length == 0) {
			return inputChars;
		} else {
			for (int i = 0; i < trueLength; i++) {
				if (inputChars[i] == ' ') {
					inputChars = this.shiftArrayElements(inputChars, i, 2);
					inputChars[i] = '%';
					inputChars[i + 1] = '2';
					inputChars[i + 2] = '0';
					trueLength += 2;
				}
			}

			return inputChars;
		}
	}

	/**
	 * @param inputChars
	 * @param shiftFrom
	 * @param numberOfPositions
	 */
	char[] shiftArrayElements(char[] inputChars, int shiftFrom, int numberOfPositions) {
		if (inputChars == null || inputChars.length == 0 || numberOfPositions == 0) {
			return inputChars;
		} else if (shiftFrom >= inputChars.length - 1) {
			throw new RuntimeException("Cannot shift from the end of the array or beyond!");
		} else {
			for (int i = inputChars.length - 1; i >= shiftFrom + numberOfPositions; i--) {
				inputChars[i] = inputChars[i - numberOfPositions];
			}
			return inputChars;
		}
	}

	/**
	 * Makes an initial pass through the array to count all the spaces before
	 * trueLength is reached. Makes a second pass through the array, starting at
	 * the end, and working backward.
	 * 
	 * 2n
	 * 
	 * @param inputChars
	 * @param trueLength
	 * @return
	 */
	public char[] replaceSpaceCharactersSimpler(char[] inputChars, int trueLength) {

		logger.finest("trueLength=" + trueLength);

		if (inputChars == null || inputChars.length == 0 || trueLength == 0) {
			return inputChars;
		}

		logger.finest("inputChars.length=" + inputChars.length);

		int numberOfSpaces = 0;
		for (int i = 0; i < trueLength; i++) {
			if (inputChars[i] == ' ') {
				numberOfSpaces++;
			}
		}

		logger.finest("numberOfSpaces=" + numberOfSpaces);

		if (numberOfSpaces == 0) {
			return inputChars;
		}

		int newTrueLength = trueLength + numberOfSpaces * 2;

		logger.finest("newTrueLength=" + newTrueLength);

		if (newTrueLength > inputChars.length) {
			throw new RuntimeException("Not enough space in char array to convert all space characters to \"%20\"\'s");
		}

		for (int j = trueLength - 1, k = newTrueLength - 1; j >= 0; j--) {
			if (inputChars[j] == ' ') {
				inputChars[k] = '0';
				inputChars[k - 1] = '2';
				inputChars[k - 2] = '%';
				k -= 3;
			} else {
				inputChars[k] = inputChars[j];
				k--;
			}
		}

		return inputChars;
	}

}
