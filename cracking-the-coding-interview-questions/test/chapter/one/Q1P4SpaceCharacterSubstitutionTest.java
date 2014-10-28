package chapter.one;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Justin Stringer
 */
public class Q1P4SpaceCharacterSubstitutionTest {

	private Q1P4SpaceCharacterSubstitution testQ1P4SpaceCharacterSubstitution = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.testQ1P4SpaceCharacterSubstitution = new Q1P4SpaceCharacterSubstitution();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.testQ1P4SpaceCharacterSubstitution = null;
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#shiftArrayElements(char[], int, int)}
	 * .
	 */
	@Test
	public void testShiftArrayElementForNull() {
		assertArrayEquals(null,
				this.testQ1P4SpaceCharacterSubstitution.shiftArrayElements(
						null, 1, 1));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#shiftArrayElements(char[], int, int)}
	 * .
	 */
	@Test
	public void testShiftArrayElementForEmptyArray() {
		assertArrayEquals(new char[0],
				this.testQ1P4SpaceCharacterSubstitution.shiftArrayElements(
						new char[0], 1, 1));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#shiftArrayElements(char[], int, int)}
	 * .
	 */
	@Test
	public void testShiftArrayElementForZeroNumberOfPositions() {
		assertArrayEquals(new char[] { 'a', 'b', ' ', ' ', ' ', ' ' },
				this.testQ1P4SpaceCharacterSubstitution.shiftArrayElements(
						new char[] { 'a', 'b', ' ', ' ', ' ', ' ' }, 1, 0));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#shiftArrayElements(char[], int, int)}
	 * .
	 */
	@Test(expected = Exception.class)
	public void testShiftArrayElementForShiftFromAtEndOfArray() {
		this.testQ1P4SpaceCharacterSubstitution.shiftArrayElements(new char[] {
				'a', 'b', ' ', ' ', ' ', ' ' }, new char[] { 'a', 'b', ' ',
				' ', ' ', ' ' }.length - 1, 1);
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#shiftArrayElements(char[], int, int)}
	 * .
	 */
	@Test(expected = Exception.class)
	public void testShiftArrayElementForShiftFromBeyondEndOfArray() {
		this.testQ1P4SpaceCharacterSubstitution.shiftArrayElements(new char[] {
				'a', 'b', ' ', ' ', ' ', ' ' }, new char[] { 'a', 'b', ' ',
				' ', ' ', ' ' }.length + 1, 1);
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#shiftArrayElements(char[], int, int)}
	 * .
	 */
	@Test
	public void testShiftArrayElementFor1And1() {
		assertArrayEquals(new char[] { 'a', 'b', 'b', ' ', ' ', ' ' },
				this.testQ1P4SpaceCharacterSubstitution.shiftArrayElements(
						new char[] { 'a', 'b', ' ', ' ', ' ', ' ' }, 1, 1));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#shiftArrayElements(char[], int, int)}
	 * .
	 */
	@Test
	public void testShiftArrayElementFor0And1() {
		assertArrayEquals(new char[] { 'a', 'a', 'b', 'c', ' ', ' ', ' ' },
				this.testQ1P4SpaceCharacterSubstitution.shiftArrayElements(
						new char[] { 'a', 'b', 'c', ' ', ' ', ' ', ' ' }, 0, 1));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#shiftArrayElements(char[], int, int)}
	 * .
	 */
	@Test
	public void testShiftArrayElementFor0And3() {
		assertArrayEquals(new char[] { 'a', 'b', 'c', 'a', 'b', 'c', ' ' },
				this.testQ1P4SpaceCharacterSubstitution.shiftArrayElements(
						new char[] { 'a', 'b', 'c', ' ', ' ', ' ', ' ' }, 0, 3));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#shiftArrayElements(char[], int, int)}
	 * .
	 */
	@Test
	public void testShiftArrayElementFor2And3() {
		assertArrayEquals(new char[] { 'a', 'b', 'c', ' ', ' ', 'c', ' ' },
				this.testQ1P4SpaceCharacterSubstitution.shiftArrayElements(
						new char[] { 'a', 'b', 'c', ' ', ' ', ' ', ' ' }, 2, 3));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#replaceSpaceCharacters(java.lang.String)}
	 * .
	 */
	@Test
	public void testReplaceSpaceCharacters() {
		assertEquals("a%20b  ",
				this.testQ1P4SpaceCharacterSubstitution
						.replaceSpaceCharacters("a b    "));
	}

}
