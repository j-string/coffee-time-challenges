package chapter.one;

import static org.junit.Assert.assertArrayEquals;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author Justin Stringer
 */
public class Q1P4SpaceCharacterSubstitutionTest {

	private Q1P4SpaceCharacterSubstitution testQ1P4SpaceCharacterSubstitution = null;

	/**
	 * @throws Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Handler[] handlers = Logger.getLogger("").getHandlers();
		for (int index = 0; index < handlers.length; index++) {
			handlers[index].setLevel(Level.FINEST);
		}
		Logger.getLogger(Q1P4SpaceCharacterSubstitution.class.getName()).setLevel(Level.FINEST);
	}

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
		assertArrayEquals(null, this.testQ1P4SpaceCharacterSubstitution.shiftArrayElements(null, 1, 1));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#shiftArrayElements(char[], int, int)}
	 * .
	 */
	@Test
	public void testShiftArrayElementForEmptyArray() {
		assertArrayEquals(new char[0], this.testQ1P4SpaceCharacterSubstitution.shiftArrayElements(new char[0], 1, 1));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#shiftArrayElements(char[], int, int)}
	 * .
	 */
	@Test
	public void testShiftArrayElementForZeroNumberOfPositions() {
		assertArrayEquals(new char[] { 'a', 'b', ' ', ' ', ' ', ' ' },
				this.testQ1P4SpaceCharacterSubstitution.shiftArrayElements(new char[] { 'a', 'b', ' ', ' ', ' ', ' ' },
						1, 0));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#shiftArrayElements(char[], int, int)}
	 * .
	 */
	@Test(expected = RuntimeException.class)
	public void testShiftArrayElementForShiftFromAtEndOfArray() {
		this.testQ1P4SpaceCharacterSubstitution.shiftArrayElements(new char[] { 'a', 'b', ' ', ' ', ' ', ' ' },
				new char[] { 'a', 'b', ' ', ' ', ' ', ' ' }.length - 1, 1);
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#shiftArrayElements(char[], int, int)}
	 * .
	 */
	@Test(expected = RuntimeException.class)
	public void testShiftArrayElementForShiftFromBeyondEndOfArray() {
		this.testQ1P4SpaceCharacterSubstitution.shiftArrayElements(new char[] { 'a', 'b', ' ', ' ', ' ', ' ' },
				new char[] { 'a', 'b', ' ', ' ', ' ', ' ' }.length + 1, 1);
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#shiftArrayElements(char[], int, int)}
	 * .
	 */
	@Test
	public void testShiftArrayElementFor1And1() {
		assertArrayEquals(new char[] { 'a', 'b', 'b', ' ', ' ', ' ' },
				this.testQ1P4SpaceCharacterSubstitution.shiftArrayElements(new char[] { 'a', 'b', ' ', ' ', ' ', ' ' },
						1, 1));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#shiftArrayElements(char[], int, int)}
	 * .
	 */
	@Test
	public void testShiftArrayElementFor0And1() {
		assertArrayEquals(
				new char[] { 'a', 'a', 'b', 'c', ' ', ' ', ' ' },
				this.testQ1P4SpaceCharacterSubstitution.shiftArrayElements(new char[] { 'a', 'b', 'c', ' ', ' ', ' ',
						' ' }, 0, 1));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#shiftArrayElements(char[], int, int)}
	 * .
	 */
	@Test
	public void testShiftArrayElementFor0And3() {
		assertArrayEquals(
				new char[] { 'a', 'b', 'c', 'a', 'b', 'c', ' ' },
				this.testQ1P4SpaceCharacterSubstitution.shiftArrayElements(new char[] { 'a', 'b', 'c', ' ', ' ', ' ',
						' ' }, 0, 3));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#shiftArrayElements(char[], int, int)}
	 * .
	 */
	@Test
	public void testShiftArrayElementFor2And3() {
		assertArrayEquals(
				new char[] { 'a', 'b', 'c', ' ', ' ', 'c', ' ' },
				this.testQ1P4SpaceCharacterSubstitution.shiftArrayElements(new char[] { 'a', 'b', 'c', ' ', ' ', ' ',
						' ' }, 2, 3));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#replaceSpaceCharacters(char[], int)}
	 * .
	 */
	@Test
	public void testReplaceSpaceCharactersWithOneSpace() {
		assertArrayEquals(new char[] { 'a', '%', '2', '0', 'b' },
				this.testQ1P4SpaceCharacterSubstitution.replaceSpaceCharacters(new char[] { 'a', ' ', 'b', ' ', ' ' },
						3));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#replaceSpaceCharacters(char[], int)}
	 * .
	 */
	@Test
	public void testReplaceSpaceCharactersWithTwoSpaces() {
		assertArrayEquals(
				new char[] { 'a', '%', '2', '0', '%', '2', '0', 'b' },
				this.testQ1P4SpaceCharacterSubstitution.replaceSpaceCharacters(new char[] { 'a', ' ', ' ', 'b', ' ',
						' ', ' ', ' ' }, 4));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#replaceSpaceCharactersSimpler(char[], int)}
	 * .
	 */
	@Test
	public void testReplaceSpaceCharactersSimplerForNull() {
		assertArrayEquals(null, this.testQ1P4SpaceCharacterSubstitution.replaceSpaceCharactersSimpler(null, 4));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#replaceSpaceCharactersSimpler(char[], int)}
	 * .
	 */
	@Test
	public void testReplaceSpaceCharactersSimplerForArrayOfLength0() {
		assertArrayEquals(new char[0],
				this.testQ1P4SpaceCharacterSubstitution.replaceSpaceCharactersSimpler(new char[0], 4));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#replaceSpaceCharactersSimpler(char[], int)}
	 * .
	 */
	@Test
	public void testReplaceSpaceCharactersSimplerForTrueLengthOf0() {
		assertArrayEquals(new char[] { 'a', ' ', ' ', 'b' },
				this.testQ1P4SpaceCharacterSubstitution.replaceSpaceCharactersSimpler(
						new char[] { 'a', ' ', ' ', 'b' }, 0));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#replaceSpaceCharactersSimpler(char[], int)}
	 * .
	 */
	@Test
	public void testReplaceSpaceCharactersSimplerWithNoSpaces() {
		assertArrayEquals(new char[] { 'a', 'b', 'c', 'd' },
				this.testQ1P4SpaceCharacterSubstitution.replaceSpaceCharactersSimpler(
						new char[] { 'a', 'b', 'c', 'd' }, 4));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#replaceSpaceCharactersSimpler(char[], int)}
	 * .
	 */
	@Test(expected = RuntimeException.class)
	public void testReplaceSpaceCharactersSimplerWithNotEnoughSpaceToReplace() {
		this.testQ1P4SpaceCharacterSubstitution.replaceSpaceCharactersSimpler(new char[] { 'a', ' ', 'b' }, 3);
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#replaceSpaceCharactersSimpler(char[], int)}
	 * .
	 */
	@Test
	public void testReplaceSpaceCharactersSimplerWithOneSpace() {
		assertArrayEquals(
				new char[] { 'a', '%', '2', '0', 'b' },
				this.testQ1P4SpaceCharacterSubstitution.replaceSpaceCharactersSimpler(new char[] { 'a', ' ', 'b', ' ',
						' ' }, 3));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#replaceSpaceCharactersSimpler(char[], int)}
	 * .
	 */
	@Test
	public void testReplaceSpaceCharactersSimplerWithTwoSpaces() {
		assertArrayEquals(
				new char[] { 'a', '%', '2', '0', '%', '2', '0', 'b' },
				this.testQ1P4SpaceCharacterSubstitution.replaceSpaceCharactersSimpler(new char[] { 'a', ' ', ' ', 'b',
						' ', ' ', ' ', ' ' }, 4));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#replaceSpaceCharactersSimpler(char[], int)}
	 * .
	 */
	@Test
	public void testReplaceSpaceCharactersSimplerWithTwoSeparatedSpaces() {
		assertArrayEquals(
				new char[] { 'a', '%', '2', '0', 'b', '%', '2', '0', 'c' },
				this.testQ1P4SpaceCharacterSubstitution.replaceSpaceCharactersSimpler(new char[] { 'a', ' ', 'b', ' ',
						'c', ' ', ' ', ' ', ' ' }, 5));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#replaceSpaceCharactersSimpler(char[], int)}
	 * .
	 */
	@Test
	public void testReplaceSpaceCharactersSimplerWithInitialSpace() {
		assertArrayEquals(
				new char[] { '%', '2', '0', 'a', 'b', '%', '2', '0', 'c' },
				this.testQ1P4SpaceCharacterSubstitution.replaceSpaceCharactersSimpler(new char[] { ' ', 'a', 'b', ' ',
						'c', ' ', ' ', ' ', ' ' }, 5));
	}

	/**
	 * Test method for
	 * {@link chapter.one.Q1P4SpaceCharacterSubstitution#replaceSpaceCharactersSimpler(char[], int)}
	 * .
	 */
	@Test
	public void testReplaceSpaceCharactersSimplerWithEndingSpace() {
		assertArrayEquals(
				new char[] { '%', '2', '0', 'a', 'b', 'c', '%', '2', '0' },
				this.testQ1P4SpaceCharacterSubstitution.replaceSpaceCharactersSimpler(new char[] { ' ', 'a', 'b', 'c',
						' ', ' ', ' ', ' ', ' ' }, 5));
	}

}
