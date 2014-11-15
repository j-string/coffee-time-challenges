package one;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author Justin Stringer
 */
public class WordsLessThanNCharactersLongTest {

	private WordsLessThanNCharactersLong testWordsLessThanNCharactersLong = null;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.testWordsLessThanNCharactersLong = new WordsLessThanNCharactersLong();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.testWordsLessThanNCharactersLong = null;
	}

	/**
	 * Test method for
	 * {@link one.WordsLessThanNCharactersLong#getWordsLessThanNCharactersLong(java.lang.String, int)}
	 * .
	 */
	@Test
	public void testGetWordsLessThanNCharactersLongForNullString() {
		assertEquals(new ArrayList<String>(),
				this.testWordsLessThanNCharactersLong.getWordsLessThanNCharactersLong(null, 3));
	}

	/**
	 * Test method for
	 * {@link one.WordsLessThanNCharactersLong#getWordsLessThanNCharactersLong(java.lang.String, int)}
	 * .
	 */
	@Test
	public void testGetWordsLessThanNCharactersLongForNullEmptyString() {
		assertEquals(new ArrayList<String>(),
				this.testWordsLessThanNCharactersLong.getWordsLessThanNCharactersLong("", 3));
	}

	/**
	 * Test method for
	 * {@link one.WordsLessThanNCharactersLong#getWordsLessThanNCharactersLong(java.lang.String, int)}
	 * .
	 */
	@Test
	public void testGetWordsLessThanNCharactersLongForNEqualTo0() {
		assertEquals(new ArrayList<String>(),
				this.testWordsLessThanNCharactersLong.getWordsLessThanNCharactersLong("abc one", 0));
	}

	/**
	 * Test method for
	 * {@link one.WordsLessThanNCharactersLong#getWordsLessThanNCharactersLong(java.lang.String, int)}
	 * .
	 */
	@Test
	public void testGetWordsLessThanNCharactersLongForNEqualTo3WithOneWordReturned() {
		assertEquals(new ArrayList<String>(Arrays.asList("abc")),
				this.testWordsLessThanNCharactersLong.getWordsLessThanNCharactersLong("abc ones", 3));

	}

	/**
	 * Test method for
	 * {@link one.WordsLessThanNCharactersLong#getWordsLessThanNCharactersLong(java.lang.String, int)}
	 * .
	 */
	@Test
	public void testGetWordsLessThanNCharactersLongForNEqualTo4WithTwoWordsReturned() {
		assertEquals(new ArrayList<String>(Arrays.asList("abc", "ones")),
				this.testWordsLessThanNCharactersLong.getWordsLessThanNCharactersLong("abc ones", 4));

	}

	/**
	 * Test method for
	 * {@link one.WordsLessThanNCharactersLong#getWordsLessThanNCharactersLong(java.lang.String, int)}
	 * .
	 */
	@Test
	public void testGetWordsLessThanNCharactersLongForNEqualTo4WithThreeWordsReturned() {
		assertEquals(new ArrayList<String>(Arrays.asList("abc", "ones", "tax")),
				this.testWordsLessThanNCharactersLong.getWordsLessThanNCharactersLong("abc ones tax", 4));

	}

	/**
	 * Test method for
	 * {@link one.WordsLessThanNCharactersLong#getWordsLessThanNCharactersLong(java.lang.String, int)}
	 * .
	 */
	@Test
	public void testGetWordsLessThanNCharactersLongForNEqualTo3WithTwoWordsReturned() {
		assertEquals(new ArrayList<String>(Arrays.asList("abc", "tax")),
				this.testWordsLessThanNCharactersLong.getWordsLessThanNCharactersLong("abc ones tax", 3));

	}

	// Start string tokenizer version tests

	/**
	 * Test method for
	 * {@link one.WordsLessThanNCharactersLong#getWordsLessThanNCharactersLongWithStringTokenizer(java.lang.String, int)}
	 * .
	 */
	@Test
	public void testGetWordsLessThanNCharactersLongWithStringTokenizerForNullString() {
		assertEquals(new ArrayList<String>(),
				this.testWordsLessThanNCharactersLong.getWordsLessThanNCharactersLongWithStringTokenizer(null, 3));
	}

	/**
	 * Test method for
	 * {@link one.WordsLessThanNCharactersLong#getWordsLessThanNCharactersLongWithStringTokenizer(java.lang.String, int)}
	 * .
	 */
	@Test
	public void testGetWordsLessThanNCharactersLongWithStringTokenizerForNullEmptyString() {
		assertEquals(new ArrayList<String>(),
				this.testWordsLessThanNCharactersLong.getWordsLessThanNCharactersLongWithStringTokenizer("", 3));
	}

	/**
	 * Test method for
	 * {@link one.WordsLessThanNCharactersLong#getWordsLessThanNCharactersLongWithStringTokenizer(java.lang.String, int)}
	 * .
	 */
	@Test
	public void testGetWordsLessThanNCharactersLongWithStringTokenizerForNEqualTo0() {
		assertEquals(new ArrayList<String>(),
				this.testWordsLessThanNCharactersLong.getWordsLessThanNCharactersLongWithStringTokenizer("abc one", 0));
	}

	/**
	 * Test method for
	 * {@link one.WordsLessThanNCharactersLong#getWordsLessThanNCharactersLongWithStringTokenizer(java.lang.String, int)}
	 * .
	 */
	@Test
	public void testGetWordsLessThanNCharactersLongWithStringTokenizerForNEqualTo3WithOneWordReturned() {
		assertEquals(new ArrayList<String>(Arrays.asList("abc")),
				this.testWordsLessThanNCharactersLong.getWordsLessThanNCharactersLongWithStringTokenizer("abc ones", 3));

	}

	/**
	 * Test method for
	 * {@link one.WordsLessThanNCharactersLong#getWordsLessThanNCharactersLongWithStringTokenizer(java.lang.String, int)}
	 * .
	 */
	@Test
	public void testGetWordsLessThanNCharactersLongWithStringTokenizerForNEqualTo4WithTwoWordsReturned() {
		assertEquals(new ArrayList<String>(Arrays.asList("abc", "ones")),
				this.testWordsLessThanNCharactersLong.getWordsLessThanNCharactersLongWithStringTokenizer("abc ones", 4));

	}

	/**
	 * Test method for
	 * {@link one.WordsLessThanNCharactersLong#getWordsLessThanNCharactersLongWithStringTokenizer(java.lang.String, int)}
	 * .
	 */
	@Test
	public void testGetWordsLessThanNCharactersLongWithStringTokenizerForNEqualTo4WithThreeWordsReturned() {
		assertEquals(new ArrayList<String>(Arrays.asList("abc", "ones", "tax")),
				this.testWordsLessThanNCharactersLong.getWordsLessThanNCharactersLongWithStringTokenizer(
						"abc ones tax", 4));

	}

	/**
	 * Test method for
	 * {@link one.WordsLessThanNCharactersLong#getWordsLessThanNCharactersLongWithStringTokenizer(java.lang.String, int)}
	 * .
	 */
	@Test
	public void testGetWordsLessThanNCharactersLongWithStringTokenizerForNEqualTo3WithTwoWordsReturned() {
		assertEquals(new ArrayList<String>(Arrays.asList("abc", "tax")),
				this.testWordsLessThanNCharactersLong.getWordsLessThanNCharactersLongWithStringTokenizer(
						"abc ones tax", 3));

	}

	/**
	 * Test method for
	 * {@link one.WordsLessThanNCharactersLong#getWordsLessThanNCharactersLongWithStringTokenizer(java.lang.String, int)}
	 * .
	 */
	@Test
	public void testGetWordsLessThanNCharactersLongWithStringTokenizerForNEqualTo4WithTwoWordsReturnedAndMultipleSpaces() {
		assertEquals(new ArrayList<String>(Arrays.asList("abc", "ones")),
				this.testWordsLessThanNCharactersLong.getWordsLessThanNCharactersLongWithStringTokenizer("abc  ones", 4));

	}

}
