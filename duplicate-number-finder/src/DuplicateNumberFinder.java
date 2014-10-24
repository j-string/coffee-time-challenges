import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Justin Stringer
 */
public class DuplicateNumberFinder {

	/**
	 * @param numbers
	 * @return
	 */
	public Long findDuplicateNumber(Long[] numbers) {

		if (numbers == null || numbers.length == 1) {
			return null;
		}

		Set<Long> numbersSet = new HashSet<Long>();
		for (int i = 0; i < numbers.length; i++) {
			if (numbersSet.contains(numbers[i])) {
				return numbers[i];
			} else {
				numbersSet.add(numbers[i]);
			}
		}

		return null;
	}
}
