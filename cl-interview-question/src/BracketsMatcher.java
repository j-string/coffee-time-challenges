import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 
 * @author Justin Stringer
 */
public class BracketsMatcher {

	public Boolean doBracketsMatch(String inputString) {

		System.out.println("inputString=" + inputString);

		Stack<Character> stack = new Stack<Character>();

		Map<Character, Character> bracketsHashMap = new HashMap<Character, Character>();
		bracketsHashMap.put(')', '(');
		bracketsHashMap.put(']', '[');
		bracketsHashMap.put('}', '{');
		bracketsHashMap.put('>', '<');

		for (int i = 0; inputString != null && i < inputString.length(); i++) {
			Character currentCharacter = inputString.charAt(i);
			if (bracketsHashMap.containsValue(currentCharacter)) {
				stack.push(currentCharacter);
			} else if (bracketsHashMap.containsKey(currentCharacter)) {
				if (!stack.empty()) {
					Character lastOpeningBracket = stack.pop();
					if (bracketsHashMap.get(currentCharacter) != lastOpeningBracket) {
						return false;
					}
				} else {
					return false;
				}
			}
		}

		if (!stack.empty()) {
			return false;
		}

		return true;
	}
}
