import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

/**
 * 
 * @author Justin Stringer
 */
public class BracketsMatcherTest {

	private BracketsMatcher testBracketsMatcher;

	@Before
	public void setUp() throws Exception {
		testBracketsMatcher = new BracketsMatcher();
	}

	@After
	public void tearDown() throws Exception {
		testBracketsMatcher = null;
	}

	@Test
	public void testBracketsMatcherWithNull() {
		assertTrue(this.testBracketsMatcher.doBracketsMatch(null));
	}

	@Test
	public void testBracketsMatcherWithEmptyString() {
		assertTrue(this.testBracketsMatcher.doBracketsMatch(""));
	}

	@Test
	public void testBracketsMatcherWithNoBrackets() {
		assertTrue(this.testBracketsMatcher.doBracketsMatch("abc"));
	}

	@Test
	public void testBracketsMatcherWithOneNonBracketCharacter() {
		assertTrue(this.testBracketsMatcher.doBracketsMatch("a"));
	}

	@Test
	public void testBracketsMatcherWithOneMatchingSetOfParentheses() {
		assertTrue(this.testBracketsMatcher.doBracketsMatch("()"));
	}

	@Test
	public void testBracketsMatcherWithOneUnmatchedOpeningParentheses() {
		assertFalse(this.testBracketsMatcher.doBracketsMatch("a(b"));
	}

	@Test
	public void testBracketsMatcherWithOneUnmatchedOpeningParenthesesAndMatchedSquareBrackets() {
		assertFalse(this.testBracketsMatcher.doBracketsMatch("a[c(b]d"));
	}

	@Test
	public void testBracketsMatcherWithOutOfOrderClosures() {
		assertFalse(this.testBracketsMatcher.doBracketsMatch("a[c(b]d)"));
	}

	@Test
	public void testBracketsMatcherWithInitialClosingBracket() {
		assertFalse(this.testBracketsMatcher.doBracketsMatch("a}oo"));
	}

	@Test
	public void testBracketsMatcherWithMoreClosingBracketsThanOpeningBrackets() {
		assertFalse(this.testBracketsMatcher.doBracketsMatch("a<({})>]oo"));
	}

	@Test
	public void testBracketsMatcherWithOneClosingBracket() {
		assertFalse(this.testBracketsMatcher.doBracketsMatch("}"));
	}

}