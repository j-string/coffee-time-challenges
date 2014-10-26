package chapter.one;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Justin Stringer
 */
public class Q1P1StringWithAllUniqueCharacters {

        /**
         * @param stringToCheck
         * @return
         */
        public Boolean hasAllUniqueCharacters(String stringToCheck) {

                if (stringToCheck == null || stringToCheck.isEmpty()) { return null; }

                else if (stringToCheck.length() == 1) { return true; }

                else {
                        Set<Character> set = new HashSet<Character>();
                        set.add(stringToCheck.charAt(0));
                        for (int i = 1; i < stringToCheck.length(); i++) {
                                if (set.contains(stringToCheck.charAt(i))) { return false; }
                                else { set.add(stringToCheck.charAt(i)); }
                        }
                }

                return true;
        }

        /**
         * @param stringToCheck
         * @return
         */
        public Boolean hasAllUniqueCharactersRecursive(String stringToCheck) {

                if (stringToCheck == null || stringToCheck.isEmpty()) { return null; }

                else if (stringToCheck.length() == 1) { return true; }

                else { return !this.doesContainDuplicate(stringToCheck.substring(1), stringToCheck.charAt(0)); }

        }

        /**
         * @param stringToCheck
         * @param characterToCheckFor
         * @return
         */
	Boolean doesContainDuplicate(String stringToCheck, Character characterToCheckFor) {

		if (stringToCheck.length() == 0) { return false; }	

		else if (stringToCheck.indexOf(characterToCheckFor) != -1) { return true; }

		else { return this.doesContainDuplicate(stringToCheck.substring(1), stringToCheck.charAt(0)); }

	}

        /**
         * @param stringToCheck
         * @return
         */
        public Boolean hasAllUniqueCharactersNoRecursionNoSet(String stringToCheck) {

                if (stringToCheck == null || stringToCheck.isEmpty()) { return null; }

                else if (stringToCheck.length() == 1) { return true; }

                else {
			for (int i=0; i < stringToCheck.length(); i++) {
				if (stringToCheck.substring(i+1).indexOf(stringToCheck.charAt(0)) != -1) {
					return false;
				}
			}
                }

		return true;
        }
}
