package one;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * The asked me a method that took in a string and return words up to the max
 * length. There could be any amount of spaces which made it a little tricky
 * 
 * @author Justin Stringer
 */
public class WordsLessThanNCharactersLong {

	/**
	 * @param inputString
	 * @param nlength
	 * @return
	 */
	public List<String> getWordsLessThanNCharactersLong(String inputString, int nlength) {

		if (nlength <= 0 || inputString == null || inputString.length() == 0) {
			return new ArrayList<String>();
		}

		List<String> wordsLessThanNCharactersLong = new ArrayList<String>();

		char[] inputChars = inputString.toCharArray();

		StringBuilder stringBuilder = new StringBuilder("");
		for (int i = 0; i < inputChars.length; i++) {
			if (inputChars[i] == ' ' && stringBuilder.length() > 0) {
				if (stringBuilder.length() <= nlength) {
					wordsLessThanNCharactersLong.add(stringBuilder.toString());
					stringBuilder = new StringBuilder("");
				}
			} else {
				stringBuilder.append(inputChars[i]);
			}
		}

		System.out.println(stringBuilder.length());

		if (stringBuilder.length() > 0 && stringBuilder.length() <= nlength) {
			wordsLessThanNCharactersLong.add(stringBuilder.toString());
		}

		return wordsLessThanNCharactersLong;
	}

	/**
	 * @param inputString
	 * @param nlength
	 * @return
	 */
	public List<String> getWordsLessThanNCharactersLongWithStringTokenizer(String inputString, int nlength) {

		if (nlength <= 0 || inputString == null || inputString.length() == 0) {
			return new ArrayList<String>();
		}

		List<String> wordsLessThanNCharactersLong = new ArrayList<String>();

		StringTokenizer stringTokenizer = new StringTokenizer(inputString);

		while (stringTokenizer.hasMoreTokens()) {
			String currentString = stringTokenizer.nextToken();
			if (currentString.length() <= nlength) {
				wordsLessThanNCharactersLong.add(currentString);
			}
		}

		return wordsLessThanNCharactersLong;
	}
}
