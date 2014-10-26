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

	@Test
	public void testReverseStringForNull() { assertNull(this.testQ1P2ReverseString.reverseString(null)); }

	@Test
	public void testReverseStringForEmptyString() { assertEquals("", this.testQ1P2ReverseString.reverseString("")); }

	@Test
	public void testReverseStringForStringWithLengthOfOne() { assertEquals("x", this.testQ1P2ReverseString.reverseString("x")); }

	@Test
	public void testReverseStringForStringWithLengthOfTen() { assertEquals("gnirtStset", this.testQ1P2ReverseString.reverseString("testString")); }
}
