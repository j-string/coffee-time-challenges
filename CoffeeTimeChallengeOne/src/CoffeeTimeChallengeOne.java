public class CoffeeTimeChallengeOne {

	/**
	 * From: http://www.datagenetics.com/blog/june22014/index.html
	 * 
	 * 1) Two Bases
	 * 
	 * Challenge: Find three digits X, Y and Z such that XYZ in base10 (ten) is
	 * equal to ZYX in base9 (nine)?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("START");

		for (int i = 1; i < 1000; i++) {
			Integer number = new Integer(i);

			// System.out.println("number=" + number);

			String numberAsString = String.valueOf(number);

			// add a zero character to pad the left end
			if (number < 100) {
				numberAsString = "0" + numberAsString;
			}

			// add a zero character to pad the left end
			if (number < 10) {
				numberAsString = "0" + numberAsString;
			}

			// System.out.println("numberAsString=" + numberAsString);

			// ignore numbers that contain a nine character
			if (numberAsString.indexOf('9') == -1) {

				String numberAsStringReversed = new StringBuilder(
						numberAsString).reverse().toString();

				// System.out.println("numberAsStringReversed="
				// + numberAsStringReversed);

				Integer numberAsStringReversedAndInBase9ValueOfInBase10 = Integer
						.valueOf(numberAsStringReversed, 9);

				// System.out
				// .println("numberAsStringReversedAndInBase9ValueOfInBase10="
				// + numberAsStringReversedAndInBase9ValueOfInBase10);

				if (number
						.equals(numberAsStringReversedAndInBase9ValueOfInBase10)) {
					System.out.println("Match found!");
					System.out.println("number=" + number);
					System.out.println("numberAsString=" + numberAsString);
					System.out.println("numberAsStringReversed="
							+ numberAsStringReversed);
					System.out
							.println("numberAsStringReversedAndInBase9ValueOfInBase10="
									+ numberAsStringReversedAndInBase9ValueOfInBase10);
				}

			}
		}

		System.out.println("STOP");
	}

}
