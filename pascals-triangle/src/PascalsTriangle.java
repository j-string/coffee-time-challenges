/**
 * 
 * @author Justin Stringer
 */
public class PascalsTriangle {

	public void printPascalsTriangle(int height) {

	}

	public String getPascalsTriangleAsString(int height) {
		String returnString = null;

		return returnString;
	}

	protected int[][] getPascalsTriangleAs2DArray(int height) {
		int[][] return2DArray = null;

		if (height != 0) {

			return2DArray = new int[height][];

			return2DArray[0] = new int[] { 1 };

			for (int i = 1; i < height; i++) {
				return2DArray[i] = new int[height];
				for (int j = 0; j < height; j++) {
					System.out.println("i=" + i + ", j=" + j);
					if (j == 0) {
						return2DArray[i][j] = 1;
					} else if (j == height - 1) {
						return2DArray[i][j] = 1;
					} else {
						return2DArray[i][j] = return2DArray[i - 1][j - 1]
								+ return2DArray[i - 1][j];
					}
				}
			}
		}

		return return2DArray;
	}
}
