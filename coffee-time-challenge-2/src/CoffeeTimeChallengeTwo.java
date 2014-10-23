public class CoffeeTimeChallengeTwo {

	/**
	 * From: http://www.datagenetics.com/blog/june22014/index.html
	 * 
	 * 2) One Million
	 * 
	 * Challenge: Write 1,000,000 as the product of two numbers; neither of
	 * which contains any zeroes.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("START");

		for (int i = 2; i <= 999999; i++) {
			// System.out.println("i=" + i);

			if (!containsZero(i)) {
				// System.out.println("i=" + i);
				if (1000000 % i == 0) {
					int j = 1000000 / i;
					if (!containsZero(j)) {
						System.out.println("i=" + i);
						System.out.println("1000000%i=" + 1000000 % i);
						System.out.println("1000000/i=" + 1000000 / i);
						System.out.println("j=" + j);
						System.out.println("i*j=" + i * j);
					}
				}
			}

		}

		System.out.println("STOP");
	}

	static boolean containsZero(int num) {
		if (num == 0)
			return true;

		if (num < 0)
			num = -num;

		while (num > 0) {
			if (num % 10 == 0)
				return true;
			num /= 10;
		}
		return false;
	}

}
