package chapter.one;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

/**
 * 
 * @author Justin Stringer
 */
public class Q1P1StringWithAllUniqueCharactersTest {

	private Q1P1StringWithAllUniqueCharacters testQ1P1StringWithAllUniqueCharacters = null;

	@Before
	public void setup() {
		this.testQ1P1StringWithAllUniqueCharacters = new Q1P1StringWithAllUniqueCharacters();
	}

	@After
	public void tearDown() {
		this.testQ1P1StringWithAllUniqueCharacters = null;
	}

	// start set implementation tests
	@Test
	public void testHasAllUniqueCharactersForNull() {
		assertNull(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharacters(null));
	}

	@Test
	public void testHasAllUniqueCharactersForEmptyString() {
		assertNull(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharacters(""));
	}

	@Test
	public void testHasAllUniqueCharactersForStringWithOneCharacter() {
		assertTrue(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharacters("y"));
	}

	@Test
	public void testHasAllUniqueCharactersForTrue() {
		assertTrue(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharacters("yes"));
	}

	@Test
	public void testHasAllUniqueCharactersForFalse() {
		assertFalse(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharacters("no no"));
	}

	// start recursive implementation tests
	@Test
	public void testHasAllUniqueCharactersForNullRecursive() {
		assertNull(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharactersRecursive(null));
	}

	@Test
	public void testHasAllUniqueCharactersForEmptyStringRecursive() {
		assertNull(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharactersRecursive(""));
	}

	@Test
	public void testHasAllUniqueCharactersForStringWithOneCharacterRecursive() {
		assertTrue(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharactersRecursive("y"));
	}

	@Test
	public void testHasAllUniqueCharactersForTrueRecursive() {
		assertTrue(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharactersRecursive("yes"));
	}

	@Test
	public void testHasAllUniqueCharactersForFalseRecursive() {
		assertFalse(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharactersRecursive("no no"));
	}

	// start no recursion and no set implementation tests
	@Test
	public void testHasAllUniqueCharactersForNullNoRecursionNoSet() {
		assertNull(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharactersNoRecursionNoSet(null));
	}

	@Test
	public void testHasAllUniqueCharactersForEmptyStringNoRecursionNoSet() {
		assertNull(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharactersNoRecursionNoSet(""));
	}

	@Test
	public void testHasAllUniqueCharactersForStringWithOneCharacterNoRecursionNoSet() {
		assertTrue(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharactersNoRecursionNoSet("y"));
	}

	@Test
	public void testHasAllUniqueCharactersForTrueNoRecursionNoSet() {
		assertTrue(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharactersNoRecursionNoSet("yes"));
	}

	@Test
	public void testHasAllUniqueCharactersForFalseNoRecursionNoSet() {
		assertFalse(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharactersNoRecursionNoSet("no no"));
	}

	// array implementation
	@Test
	public void testHasAllUniqueCharactersArrayImplementationForNull() {
		assertNull(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharactersArrayImplementation(null));
	}

	@Test
	public void testHasAllUniqueCharactersArrayImplementationForEmptyString() {
		assertNull(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharactersArrayImplementation(""));
	}

	@Test
	public void testHasAllUniqueCharactersArrayImplementationForStringWithMoreThan256Characters() {
		assertFalse(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharactersArrayImplementation("12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890"));
	}

	@Test
	public void testHasAllUniqueCharactersArrayImplementationForStringWithOneCharacter() {
		assertTrue(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharactersArrayImplementation("y"));
	}

	@Test
	public void testHasAllUniqueCharactersArrayImplementationForTrue() {
		assertTrue(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharactersArrayImplementation("yes"));
	}

	@Test
	public void testHasAllUniqueCharactersArrayImplementationForFalse() {
		assertFalse(this.testQ1P1StringWithAllUniqueCharacters
				.hasAllUniqueCharactersArrayImplementation("no no"));
	}
}
