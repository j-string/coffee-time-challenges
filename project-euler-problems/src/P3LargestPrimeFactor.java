/**
 * Problem 3: Largest prime factor
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author Justin Stringer
 */
public class P3LargestPrimeFactor {

	public Long largestPrimeFactor(Long inputLong) {

		if (inputLong == null || inputLong < 2) {
			return null;
		}

		if (inputLong == 2) {
			return 2l;
		}

		Long squareRootRoundUp = new Double((Math.ceil(Math.sqrt(Double
				.valueOf(inputLong))))).longValue();

		for (long i = squareRootRoundUp; i > 0; i--) {

			if (inputLong % i == 0 && this.isPrime(i)) {
				return i;
			}
			
		}

		return 2l;
	}

	/**
	 * @param inputLong
	 * @return
	 */
	protected Boolean isPrime(Long inputLong) {

		if (inputLong == null) {
			return null;
		}

		if (inputLong == 2) {
			return true;
		}

		if (inputLong == 1 || inputLong % 2 == 0) {
			return false;
		}

		Long squareRootRoundUp = new Double((Math.ceil(Math.sqrt(Double
				.valueOf(inputLong))))).longValue();

		for (int i = 3; i < squareRootRoundUp; i += 2) {

			if (inputLong % i == 0) {
				return false;
			}

		}

		return true;
	}
}
