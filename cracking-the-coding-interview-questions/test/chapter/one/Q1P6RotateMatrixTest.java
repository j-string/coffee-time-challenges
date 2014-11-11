package chapter.one;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Q1P6RotateMatrixTest {

	private Q1P6RotateMatrix testQ1P6RotateMatrix = null;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.testQ1P6RotateMatrix = new Q1P6RotateMatrix();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.testQ1P6RotateMatrix = null;
	}


	/**
	 * Test method for
	 * {@link chapter.one.Q1P6RotateMatrix#rotateMatrix(int[][])}
	 */
	@Test
	public void testRotateMatrixForNull() {
		assertNull(this.testQ1P6RotateMatrix.rotateMatrix(null));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P6RotateMatrix#rotateMatrix(int[][])}
	 */
	@Test
	public void testRotateMatrixForEmptyMatrix() {
		assertArrayEquals(new int[0][0], this.testQ1P6RotateMatrix.rotateMatrix(new int[0][0]));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P6RotateMatrix#rotateMatrix(int[][])}
	 */
	@Test
	public void testRotateMatrixForMatrixSize1() {
		assertArrayEquals(new int[][] {{1}}, this.testQ1P6RotateMatrix.rotateMatrix(new int[][] {{1}}));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P6RotateMatrix#rotateMatrix(int[][])}
	 */
	@Test(expected = RuntimeException.class)
	public void testRotateMatrixForMatrixWhereHeightIsLessThanWidth() {
		this.testQ1P6RotateMatrix.rotateMatrix(new int[2][3]);
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P6RotateMatrix#rotateMatrix(int[][])}
	 */
	@Test(expected = RuntimeException.class)
	public void testRotateMatrixForMatrixWhereHeightIsGreaterThanWidth() {
		this.testQ1P6RotateMatrix.rotateMatrix(new int[3][2]);
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P6RotateMatrix#rotateMatrix(int[][])}
	 */
	@Test
	public void testRotateMatrixForTwoByTwoMatrix() {
		assertArrayEquals(new int[][] {{4,1},{3,2}} , this.testQ1P6RotateMatrix.rotateMatrix(new int[][] {{1,2},{4,3}}));
	}

}
