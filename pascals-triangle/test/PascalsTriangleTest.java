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
		
		assertTrue(testResult.length == 1);
		
		assertTrue(testResult[0].length == 1);
		assertTrue(testResult[0][0] == 1);
	}
	
	@Test
	public void testGetPascalsTriangleAs2DArrayWithHeight2() {
		
		int[][] testResult = this.testPascalsTriangle.getPascalsTriangleAs2DArray(2);
		
		assertTrue(testResult.length == 2);
		
		assertTrue(testResult[0].length == 1);
		assertTrue(testResult[0][0] == 1);
		
		assertTrue(testResult[1].length == 2);
		assertTrue(testResult[1][0] == 1);
		assertTrue(testResult[1][1] == 1);
	}

	@Test
	public void testGetPascalsTriangleAs2DArrayWithHeight3() {
		
		int[][] testResult = this.testPascalsTriangle.getPascalsTriangleAs2DArray(3);
		
		assertTrue(testResult.length == 3);
		
		assertTrue(testResult[0].length == 1);
		assertTrue(testResult[0][0] == 1);

		assertTrue(testResult[1].length == 2);
		assertTrue(testResult[1][0] == 1);
		assertTrue(testResult[1][1] == 1);

		assertTrue(testResult[2].length == 3);
		assertTrue(testResult[2][0] == 1);
		assertTrue(testResult[2][1] == 2);
		assertTrue(testResult[2][2] == 1);
	}

	@Test
	public void testGetPascalsTriangleAs2DArrayWithHeight4() {
		
		int[][] testResult = this.testPascalsTriangle.getPascalsTriangleAs2DArray(4);
		
		assertTrue(testResult.length == 4);
		
		assertTrue(testResult[0].length == 1);
		assertTrue(testResult[0][0] == 1);

		assertTrue(testResult[1].length == 2);
		assertTrue(testResult[1][0] == 1);
		assertTrue(testResult[1][1] == 1);

		assertTrue(testResult[2].length == 3);
		assertTrue(testResult[2][0] == 1);
		assertTrue(testResult[2][1] == 2);
		assertTrue(testResult[2][2] == 1);
		
		assertTrue(testResult[3].length == 4);
		assertTrue(testResult[3][0] == 1);
		assertTrue(testResult[3][1] == 3);
		assertTrue(testResult[3][2] == 3);
		assertTrue(testResult[3][3] == 1);	
	}

	@Test
	public void testGetPascalsTriangleAs2DArrayWithHeight5() {
		
		int[][] testResult = this.testPascalsTriangle.getPascalsTriangleAs2DArray(5);
		
		assertTrue(testResult.length == 5);
		
		assertTrue(testResult[0].length == 1);
		assertTrue(testResult[0][0] == 1);

		assertTrue(testResult[1].length == 2);
		assertTrue(testResult[1][0] == 1);
		assertTrue(testResult[1][1] == 1);

		assertTrue(testResult[2].length == 3);
		assertTrue(testResult[2][0] == 1);
		assertTrue(testResult[2][1] == 2);
		assertTrue(testResult[2][2] == 1);
		
		assertTrue(testResult[3].length == 4);
		assertTrue(testResult[3][0] == 1);
		assertTrue(testResult[3][1] == 3);
		assertTrue(testResult[3][2] == 3);
		assertTrue(testResult[3][3] == 1);	
		
		assertTrue(testResult[4].length == 5);
		assertTrue(testResult[4][0] == 1);
		assertTrue(testResult[4][1] == 4);
		assertTrue(testResult[4][2] == 6);
		assertTrue(testResult[4][3] == 4);
		assertTrue(testResult[4][4] == 1);
	}

}