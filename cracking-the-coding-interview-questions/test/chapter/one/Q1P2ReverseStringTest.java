package chapter.one;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;


import static org.junit.Assert.*;

public class Q1P2ReverseStringTest {

	private Q1P2ReverseString testQ1P2ReverseString = null;

	@Before
	public void setup() { this.testQ1P2ReverseString = new Q1P2ReverseString(); }

	@After
	public void tearDown() { this.testQ1P2ReverseString = null; }

	//string reversal tests
	@Test
	public void testReverseStringForNull() { assertNull(this.testQ1P2ReverseString.reverseString(null)); }

	@Test
	public void testReverseStringForEmptyString() { assertEquals("", this.testQ1P2ReverseString.reverseString("")); }

	@Test
	public void testReverseStringForStringWithLengthOfOne() { assertEquals("x", this.testQ1P2ReverseString.reverseString("x")); }

	@Test
	public void testReverseStringForStringWithLengthOfTen() { assertEquals("gnirtStset", this.testQ1P2ReverseString.reverseString("testString")); }

	//character array reversal tests
	@Test
	public void testReverseCharacterArrayInPlaceForNull() { assertNull(this.testQ1P2ReverseString.reverseCharacterArrayInPlace(null)); }

	@Test
	public void testReverseCharacterArrayInPlaceForEmptyArray() { assertEquals(new Character[0], this.testQ1P2ReverseString.reverseCharacterArrayInPlace(new Character[0])); }

	@Test
	public void testReverseCharacterArrayInPlaceForArrayWithLengthOfOne() { 
		Character[] testCharacterArray = {'x'};
		assertEquals(testCharacterArray, this.testQ1P2ReverseString.reverseCharacterArrayInPlace(testCharacterArray)); 
	}

	@Test
	public void testReverseCharacterArrayInPlaceForArrayWithLengthOfTen() { 
		Character[] testCharacterArray = {'t', 'e', 's', 't', 'S', 't', 'r', 'i', 'n', 'g', null, null};
		Character[] resultCharacterArray = {'g', 'n', 'i', 'r', 't', 'S', 't', 's', 'e', 't', null, null};
		assertEquals(resultCharacterArray, this.testQ1P2ReverseString.reverseCharacterArrayInPlace(testCharacterArray)); 
	}
}
