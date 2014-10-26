/**
 * Problem 1: Multiples of 3 and 5
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author Justin Stringer
 */
public class P1MultiplesOf3and5 {

	/**
	 * @param ceiling
	 * @return
	 */
	public Long sumOfNumbersThatAreMultiplesOf3And5BelowCeiling(Long ceiling) {

		if (ceiling == null) {
			return null;
		} else if (ceiling < 3) {
			return 0l;
		} else {
			Long sum = new Long(0);
			for (int i = 3; i < ceiling; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					sum += i;
				}
			}
			return sum;
		}

	}

	/**
	 * @param ceiling
	 * @return
	 */
	public Long sumOfNumbersThatAreMultiplesOf3And5BelowCeilingTWO(Long ceiling) {

		if (ceiling == null) {
			return null;
		} else if (ceiling < 3) {
			return 0l;
		} else {
			Long sum = new Long(0);
			for (int i = 1; i < ceiling; i++) {

				if (i * 3 < ceiling) {
					sum += i * 3;
				}

				if ((i * 5 < ceiling) && ((i * 5) % 3 != 0)) {
					sum += i * 5;
				}
			}
			return sum;
		}

	}

}
