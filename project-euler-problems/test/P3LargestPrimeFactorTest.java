import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Justin Stringer
 * 
 */
public class P3LargestPrimeFactorTest {

	private P3LargestPrimeFactor testP3LargestPrimeFactor = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.testP3LargestPrimeFactor = new P3LargestPrimeFactor();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.testP3LargestPrimeFactor = null;
	}

	/**
	 * Test method for {@link P3LargestPrimeFactor#isPrime(java.lang.Long)}.
	 */
	@Test
	public void testIsPrimeWithNull() {
		assertNull(this.testP3LargestPrimeFactor.isPrime(null));
	}

	/**
	 * Test method for {@link P3LargestPrimeFactor#isPrime(java.lang.Long)}.
	 */
	@Test
	public void testIsPrimeFor1() {
		assertFalse(this.testP3LargestPrimeFactor.isPrime(1l));
	}

	/**
	 * Test method for {@link P3LargestPrimeFactor#isPrime(java.lang.Long)}.
	 */
	@Test
	public void testIsPrimeFor2() {
		assertTrue(this.testP3LargestPrimeFactor.isPrime(2l));
	}

	/**
	 * Test method for {@link P3LargestPrimeFactor#isPrime(java.lang.Long)}.
	 */
	@Test
	public void testIsPrimeFor3() {
		assertTrue(this.testP3LargestPrimeFactor.isPrime(3l));
	}

	/**
	 * Test method for {@link P3LargestPrimeFactor#isPrime(java.lang.Long)}.
	 */
	@Test
	public void testIsPrimeFor4() {
		assertFalse(this.testP3LargestPrimeFactor.isPrime(4l));
	}

	/**
	 * Test method for {@link P3LargestPrimeFactor#isPrime(java.lang.Long)}.
	 */
	@Test
	public void testIsPrimeFor5() {
		assertTrue(this.testP3LargestPrimeFactor.isPrime(5l));
	}

	/**
	 * Test method for {@link P3LargestPrimeFactor#isPrime(java.lang.Long)}.
	 */
	@Test
	public void testIsPrimeFor29() {
		assertTrue(this.testP3LargestPrimeFactor.isPrime(29l));
	}

	/**
	 * Test method for {@link P3LargestPrimeFactor#isPrime(java.lang.Long)}.
	 */
	@Test
	public void testIsPrimeFor27() {
		assertFalse(this.testP3LargestPrimeFactor.isPrime(27l));
	}

	/**
	 * Test method for {@link P3LargestPrimeFactor#isPrime(java.lang.Long)}.
	 */
	@Test
	public void testIsPrimeFor997() {
		assertTrue(this.testP3LargestPrimeFactor.isPrime(997l));
	}

	/**
	 * Test method for {@link P3LargestPrimeFactor#isPrime(java.lang.Long)}.
	 */
	@Test
	public void testIsPrimeFor993() {
		assertFalse(this.testP3LargestPrimeFactor.isPrime(993l));
	}

	/**
	 * Test method for
	 * {@link P3LargestPrimeFactor#largestPrimeFactor(java.lang.Long)}.
	 */
	@Test
	public void testLargestPrimeFactorForNullArgument() {
		assertNull(this.testP3LargestPrimeFactor.largestPrimeFactor(null));
	}

	/**
	 * Test method for
	 * {@link P3LargestPrimeFactor#largestPrimeFactor(java.lang.Long)}.
	 */
	@Test
	public void testLargestPrimeFactorWith0() {
		assertNull(this.testP3LargestPrimeFactor.largestPrimeFactor(0l));
	}

	/**
	 * Test method for
	 * {@link P3LargestPrimeFactor#largestPrimeFactor(java.lang.Long)}.
	 */
	@Test
	public void testLargestPrimeFactorWith1() {
		assertNull(this.testP3LargestPrimeFactor.largestPrimeFactor(1l));
	}

	/**
	 * Test method for
	 * {@link P3LargestPrimeFactor#largestPrimeFactor(java.lang.Long)}.
	 */
	@Test
	public void testLargestPrimeFactorWith2() {
		assertEquals(2l, this.testP3LargestPrimeFactor.largestPrimeFactor(2l)
				.longValue());
	}

	/**
	 * Test method for
	 * {@link P3LargestPrimeFactor#largestPrimeFactor(java.lang.Long)}.
	 */
	@Test
	public void testLargestPrimeFactorWith13195() {
		assertEquals(29l,
				this.testP3LargestPrimeFactor.largestPrimeFactor(13195l)
						.longValue());
	}

	/**
	 * Test method for
	 * {@link P3LargestPrimeFactor#largestPrimeFactor(java.lang.Long)}.
	 */
	@Test
	public void testLargestPrimeFactorWith851475147() {
		assertEquals(27283l,
				this.testP3LargestPrimeFactor.largestPrimeFactor(851475147l)
						.longValue());
	}

	/**
	 * Test method for
	 * {@link P3LargestPrimeFactor#largestPrimeFactor(java.lang.Long)}.
	 */
	@Test
	public void testLargestPrimeFactorWith600851475143() {
		assertEquals(6857l,
				this.testP3LargestPrimeFactor.largestPrimeFactor(600851475143l)
						.longValue());
	}

}
