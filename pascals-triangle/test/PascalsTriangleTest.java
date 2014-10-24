import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

/**
 * 
 * @author Justin Stringer
 */
public class PascalsTriangleTest {

	private PascalsTriangle testPascalsTriangle;

	@Before
	public void setUp() throws Exception {
		this.testPascalsTriangle = new PascalsTriangle();
	}

	@After
	public void tearDown() throws Exception {
		this.testPascalsTriangle = null;
	}

	@Test
	public void testGetPascalsTriangleAs2DArrayWithHeight0() {
		assertNull(this.testPascalsTriangle.getPascalsTriangleAs2DArray(0));
	}

	@Test
	public void testGetPascalsTriangleAs2DArrayWithHeight1() {
		
		int[][] testResult = this.testPascalsTriangle.getPascalsTriangleAs2DArray(1);
		
		assertTrue(testResult[0][0] == 1);
	}
	
	@Test
	public void testGetPascalsTriangleAs2DArrayWithHeight2() {
		
		int[][] testResult = this.testPascalsTriangle.getPascalsTriangleAs2DArray(2);
		
		assertTrue(testResult[0][0] == 1);
		assertTrue(testResult[1][0] == 1);
		assertTrue(testResult[1][1] == 1);
	}

	@Test
	public void testGetPascalsTriangleAs2DArrayWithHeight3() {
		
		int[][] testResult = this.testPascalsTriangle.getPascalsTriangleAs2DArray(3);
		
		assertTrue(testResult[0][0] == 1);

		assertTrue(testResult[1][0] == 1);
		assertTrue(testResult[1][1] == 1);

		assertTrue(testResult[2][0] == 1);
		assertTrue(testResult[2][1] == 2);
		assertTrue(testResult[2][2] == 1);
	}

}