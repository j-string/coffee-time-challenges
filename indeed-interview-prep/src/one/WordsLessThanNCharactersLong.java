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

		StringBuilder stringBuilder = new StringBuilder("");
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == ' ') {
				if (stringBuilder.toString().length() > 0 && stringBuilder.toString().length() <= nlength) {
					wordsLessThanNCharactersLong.add(stringBuilder.toString());
				}
				stringBuilder = new StringBuilder("");
			} else {
				stringBuilder.append(inputString.charAt(i));
			}
		}

		if (stringBuilder.toString().length() > 0 && stringBuilder.toString().length() <= nlength) {
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

	/**
	 * @param inputString
	 * @param nlength
	 * @return
	 */
	public List<String> getWordsLessThanNCharactersLongWithCharArray(String inputString, int nlength) {

		if (nlength <= 0 || inputString == null || inputString.length() == 0) {
			return new ArrayList<String>();
		}

		List<String> wordsLessThanNCharactersLong = new ArrayList<String>();

		char[] word = new char[nlength];
		int charPosition = 0;
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == ' ') {
				if (charPosition > 0 && charPosition <= nlength) {
					wordsLessThanNCharactersLong.add(new String(word).trim());
				}
				word = new char[nlength];
				charPosition = 0;
			} else {
				if (charPosition < nlength) {
					word[charPosition] = inputString.charAt(i);
				}
				charPosition++;
			}
		}

		if (charPosition > 0 && charPosition <= nlength) {
			wordsLessThanNCharactersLong.add(new String(word).trim());
		}

		return wordsLessThanNCharactersLong;
	}

}
