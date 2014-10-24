/**
 * 
 * @author Justin Stringer
 */
public class PascalsTriangle {

	/**
	 * @param height
	 */
	public void printPascalsTriangle(int height) {

	}

	public String getPascalsTriangleAsString(int height) {
		String returnString = null;

		return returnString;
	}

	/**
	 * @param height
	 * @return
	 */
	protected int[][] getPascalsTriangleAs2DArray(int height) {

		if (height < 1) {
			return null;
		}

		int[][] return2DArray = new int[height][];

		for (int i = 0; i < height; i++) {
			return2DArray[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					return2DArray[i][j] = 1;
				} else {
					return2DArray[i][j] = return2DArray[i - 1][j - 1]
							+ return2DArray[i - 1][j];
				}
			}
		}

		return return2DArray;
	}
}
