package chapter.one;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q1P3StringPermutationCheckerTest {

    private Q1P3StringPermutationChecker testQ1P3StringPermutationChecker = null;

    @Before
    public void setUp() throws Exception {
        this.testQ1P3StringPermutationChecker = new Q1P3StringPermutationChecker();
    }

    @After
    public void tearDown() throws Exception {
        this.testQ1P3StringPermutationChecker = null;
    }

    @Test
    public void testIsPermutationForTwoNulls() throws Exception {
        assertFalse(this.testQ1P3StringPermutationChecker.isPermutation(null, null));
    }

    @Test
    public void testIsPermutationForFirstNull() throws Exception {
        assertFalse(this.testQ1P3StringPermutationChecker.isPermutation(null, "x"));
    }

    @Test
    public void testIsPermutationForSecondNull() throws Exception {
        assertFalse(this.testQ1P3StringPermutationChecker.isPermutation("x", null));
    }

    @Test
    public void testIsPermutationForNonPermutationNoMatchingCharacters() throws Exception {
        assertFalse(this.testQ1P3StringPermutationChecker.isPermutation("xyz", "abc"));
    }

    @Test
    public void testIsPermutationForNonPermutationOneExtraCharacter() throws Exception {
        assertFalse(this.testQ1P3StringPermutationChecker.isPermutation("xyz", "xyzz"));
    }

    @Test
    public void testIsPermutationForPermutation() throws Exception {
        assertTrue(this.testQ1P3StringPermutationChecker.isPermutation("xyz", "xyz"));
    }

    @Test
    public void testIsPermutationForPermutationAllSpaces() throws Exception {
        assertTrue(this.testQ1P3StringPermutationChecker.isPermutation("   ", "   "));
    }

}