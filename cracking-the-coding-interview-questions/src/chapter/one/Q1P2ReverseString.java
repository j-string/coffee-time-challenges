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

	public Character[] reverseCharacterArrayInPlace(Character[] inputCharacterArray) {

		if (inputCharacterArray != null && inputCharacterArray.length != 0) { 
			int lastCharacter = 0;
			while (inputCharacterArray[lastCharacter] != null ) { lastCharacter++; }

			int i = 0;
			int j = lastCharacter - 1;
			while (i<j) {
				Character tempCharacter = inputCharacterArray[i];
				inputCharacterArray[i] = inputCharacterArray[j];
				inputCharacterArray[j] = tempCharacter;
				i++;
				j--;
			}
		}
		
		return inputCharacterArray;
	}
}
