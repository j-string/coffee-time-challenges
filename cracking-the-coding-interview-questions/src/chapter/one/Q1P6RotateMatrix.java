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

		if (inputMatrix == null || inputMatrix.length == 0) { return inputMatrix; }

		for (int i = 0; i < inputMatrix.length; i++ ) {
			if (inputMatrix.length != inputMatrix[i].length) { throw new RuntimeException("Matix height does not equal matrix width for row " + i + "!"); }
		}

		if (inputMatrix.length == 1) { return inputMatrix; }

		int[][] outputMatrix = inputMatrix;


		for (int i = 0, j = inputMatrix.length-1; i < inputMatrix.length; i++, j--) {
			outputMatrix[0][i] = inputMatrix[j][0];
			outputMatrix[i][inputMatrix.length-1] = inputMatrix[0][i];
			outputMatrix[inputMatrix.length-1][i] = inputMatrix[inputMatrix.length-1][j];
			outputMatrix[i][0] = inputMatrix[inputMatrix.length-1][i];
		}

		return outputMatrix;
	}

}
