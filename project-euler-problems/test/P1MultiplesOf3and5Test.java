import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Justin Stringer
 */
public class P1MultiplesOf3and5Test {

	private P1MultiplesOf3and5 testP1MultiplesOf3and5 = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.testP1MultiplesOf3and5 = new P1MultiplesOf3and5();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.testP1MultiplesOf3and5 = null;
	}

	/**
	 * Test method for
	 * {@link P1MultiplesOf3and5#sumOfNumbersThatAreMultiplesOf3And5BelowCeiling(java.lang.Long)}
	 * .
	 */
	@Test
	public void testSumOfNumbersThatAreMultiplesOf3And5BelowCeilingWithNull() {
		assertNull(this.testP1MultiplesOf3and5
				.sumOfNumbersThatAreMultiplesOf3And5BelowCeiling(null));

		assertNull(this.testP1MultiplesOf3and5
				.sumOfNumbersThatAreMultiplesOf3And5BelowCeilingTWO(null));
	}

	/**
	 * Test method for
	 * {@link P1MultiplesOf3and5#sumOfNumbersThatAreMultiplesOf3And5BelowCeiling(java.lang.Long)}
	 * .
	 */
	@Test
	public void testSumOfNumbersThatAreMultiplesOf3And5BelowCeilingWith0() {
		assertEquals(0l, this.testP1MultiplesOf3and5
				.sumOfNumbersThatAreMultiplesOf3And5BelowCeiling(0l)
				.longValue());
		assertEquals(0l, this.testP1MultiplesOf3and5
				.sumOfNumbersThatAreMultiplesOf3And5BelowCeilingTWO(0l)
				.longValue());
	}

	/**
	 * Test method for
	 * {@link P1MultiplesOf3and5#sumOfNumbersThatAreMultiplesOf3And5BelowCeiling(java.lang.Long)}
	 * .
	 */
	@Test
	public void testSumOfNumbersThatAreMultiplesOf3And5BelowCeilingWith3() {
		assertEquals(0l, this.testP1MultiplesOf3and5
				.sumOfNumbersThatAreMultiplesOf3And5BelowCeiling(3l)
				.longValue());
		assertEquals(0l, this.testP1MultiplesOf3and5
				.sumOfNumbersThatAreMultiplesOf3And5BelowCeilingTWO(3l)
				.longValue());
	}

	/**
	 * Test method for
	 * {@link P1MultiplesOf3and5#sumOfNumbersThatAreMultiplesOf3And5BelowCeiling(java.lang.Long)}
	 * .
	 */
	@Test
	public void testSumOfNumbersThatAreMultiplesOf3And5BelowCeilingWith10() {
		assertEquals(23l, this.testP1MultiplesOf3and5
				.sumOfNumbersThatAreMultiplesOf3And5BelowCeiling(10l)
				.longValue());
		assertEquals(23l, this.testP1MultiplesOf3and5
				.sumOfNumbersThatAreMultiplesOf3And5BelowCeilingTWO(10l)
				.longValue());
	}

	/**
	 * Test method for
	 * {@link P1MultiplesOf3and5#sumOfNumbersThatAreMultiplesOf3And5BelowCeiling(java.lang.Long)}
	 * .
	 */
	@Test
	public void testSumOfNumbersThatAreMultiplesOf3And5BelowCeilingWith1000() {

		long startTime = System.nanoTime();
		assertEquals(233168l, this.testP1MultiplesOf3and5
				.sumOfNumbersThatAreMultiplesOf3And5BelowCeiling(1000l)
				.longValue());
		System.out.println("Duration=" + (System.nanoTime() - startTime));

		startTime = System.nanoTime();
		assertEquals(233168l, this.testP1MultiplesOf3and5
				.sumOfNumbersThatAreMultiplesOf3And5BelowCeilingTWO(1000l)
				.longValue());
		System.out.println("Duration=" + (System.nanoTime() - startTime));
	}

}
