import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Justin Stringer
 */
public class P2EvenFibonacciNumbersTest {

	private P2EvenFibonacciNumbers testP2EvenFibonacciNumbers = null;

	/**
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.testP2EvenFibonacciNumbers = new P2EvenFibonacciNumbers();
	}

	/**
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.testP2EvenFibonacciNumbers = null;
	}

	@Test
	public void testSumOfEvenFibonacciNumbersLessThanCeilingWithNull() {
		assertNull(this.testP2EvenFibonacciNumbers
				.sumOfEvenFibonacciNumbersLessThanCeiling(null));
	}

	@Test
	public void testSumOfEvenFibonacciNumbersLessThanCeilingWith0() {
		assertEquals(0l, this.testP2EvenFibonacciNumbers
				.sumOfEvenFibonacciNumbersLessThanCeiling(0l).longValue());
	}

	@Test
	public void testSumOfEvenFibonacciNumbersLessThanCeilingWith1() {
		assertEquals(0l, this.testP2EvenFibonacciNumbers
				.sumOfEvenFibonacciNumbersLessThanCeiling(1l).longValue());
	}

	@Test
	public void testSumOfEvenFibonacciNumbersLessThanCeilingWith2() {
		assertEquals(0l, this.testP2EvenFibonacciNumbers
				.sumOfEvenFibonacciNumbersLessThanCeiling(2l).longValue());
	}

	@Test
	public void testSumOfEvenFibonacciNumbersLessThanCeilingWith10() {
		assertEquals(10l, this.testP2EvenFibonacciNumbers
				.sumOfEvenFibonacciNumbersLessThanCeiling(10l).longValue());
	}

	@Test
	public void testSumOfEvenFibonacciNumbersLessThanCeilingWith100() {
		assertEquals(44l, this.testP2EvenFibonacciNumbers
				.sumOfEvenFibonacciNumbersLessThanCeiling(100l).longValue());
	}

	@Test
	public void testSumOfEvenFibonacciNumbersLessThanCeilingWith4Million() {
		assertEquals(4613732l, this.testP2EvenFibonacciNumbers
				.sumOfEvenFibonacciNumbersLessThanCeiling(4000000l).longValue());
	}

}
