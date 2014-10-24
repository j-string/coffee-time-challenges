import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Justin Stringer
 * 
 */
public class DuplicateNumberFinderTest {

	private DuplicateNumberFinder testDuplicateNumberFinder = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.testDuplicateNumberFinder = new DuplicateNumberFinder();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.testDuplicateNumberFinder = null;
	}

	/**
	 * Test method for
	 * {@link DuplicateNumberFinder#findDuplicateNumber(java.lang.Long[])}.
	 */
	@Test
	public void testFindDuplicateNumberWithOutDuplicate() {
		assertNull(this.testDuplicateNumberFinder
				.findDuplicateNumber(new Long[] { 1l, 2l }));
	}

	/**
	 * Test method for
	 * {@link DuplicateNumberFinder#findDuplicateNumber(java.lang.Long[])}.
	 */
	@Test
	public void testFindDuplicateNumberWithNull() {
		assertNull(this.testDuplicateNumberFinder.findDuplicateNumber(null));
	}

	/**
	 * Test method for
	 * {@link DuplicateNumberFinder#findDuplicateNumber(java.lang.Long[])}.
	 */
	@Test
	public void testFindDuplicateNumberWithOneNumber() {
		assertNull(this.testDuplicateNumberFinder
				.findDuplicateNumber(new Long[] { 1l }));
	}

	/**
	 * Test method for
	 * {@link DuplicateNumberFinder#findDuplicateNumber(java.lang.Long[])}.
	 */
	@Test
	public void testFindDuplicateNumberWithOneDuplicate() {
		assertTrue(2l == this.testDuplicateNumberFinder
				.findDuplicateNumber(new Long[] { 1l, 2l, 3l, 4l, 2l, 5l }));
	}

}
