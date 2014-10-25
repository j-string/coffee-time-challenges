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
}