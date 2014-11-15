package chapter.one;

/**
 * 
 * @author Justin Stringer
 */
public class Q1P6RotateMatrix {

	/**
	 *
	 *
	 */
	public int[][] rotateMatrix(int[][] inputMatrix) {

		if (inputMatrix == null || inputMatrix.length == 0) {
			return inputMatrix;
		}

		System.out.println("\n=");
		this.printTwoDimensionalArray(inputMatrix);
		System.out.println("=");

		for (int i = 0; i < inputMatrix.length; i++) {
			if (inputMatrix.length != inputMatrix[i].length) {
				throw new RuntimeException("Matix height does not equal matrix width for row " + i + "!");
			}
		}

		int n = inputMatrix.length;

		if (n == 1) {
			return inputMatrix;
		}

		int[][] outputMatrix = new int[n][n];
		System.out.println("\n==");
		this.printTwoDimensionalArray(outputMatrix);
		System.out.println("==");

		for (int k = 0, l = n - 1; k <= l; k++, l--) {
			for (int i = k, j = l; i <= l; i++, j--) {
				outputMatrix[k][i] = inputMatrix[j][k];
				outputMatrix[i][l] = inputMatrix[k][i];
				outputMatrix[l][j] = inputMatrix[l][i];
				outputMatrix[j][k] = inputMatrix[l][j];
				System.out.println("\n===");
				this.printTwoDimensionalArray(outputMatrix);
				System.out.println("===");
			}
		}

		return outputMatrix;
	}

	private void printTwoDimensionalArray(int[][] twoDArray) {
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray.length; j++) {
				System.out.print(twoDArray[i][j] + " ");
			}
			System.out.println();
		}
	}

}
