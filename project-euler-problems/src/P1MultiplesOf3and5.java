/**
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
