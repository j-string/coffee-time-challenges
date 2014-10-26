package chapter.one;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Justin Stringer
 */
public class Q1P3StringPermutationChecker {


    public Boolean isPermutation(String firstString, String secondString) {

        if (firstString == null || secondString == null || firstString.length() != secondString.length()) {
            return false;
        }
        else {
            Map<Character, Integer> firstStringHash = new HashMap<Character, Integer>();
            Map<Character, Integer> secondStringHash = new HashMap<Character, Integer>();
            for (int i = 0; i < firstString.length(); i++) {

                char currentFirstStringChar = firstString.charAt(i);
                if (firstStringHash.containsKey(currentFirstStringChar)) {
                    firstStringHash.put(currentFirstStringChar, firstStringHash.get(currentFirstStringChar) + 1);
                } else {
                    firstStringHash.put(currentFirstStringChar, 1);
                }

                char currentSecondStringChar = secondString.charAt(i);
                if (secondStringHash.containsKey(currentSecondStringChar)) {
                    secondStringHash.put(currentSecondStringChar, secondStringHash.get(currentSecondStringChar) + 1);
                } else {
                    secondStringHash.put(currentSecondStringChar, 1);
                }
            }

            for (Character keyCharacter: firstStringHash.keySet()) {
                if (!secondStringHash.containsKey(keyCharacter) || secondStringHash.get(keyCharacter) != firstStringHash.get(keyCharacter)){
                    return false;
                }
            }

            return true;
        }

    }

}
