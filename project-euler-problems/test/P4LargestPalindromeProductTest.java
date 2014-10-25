import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Justin Stringer
 */
public class P4LargestPalindromeProductTest {

    private P4LargestPalindromeProduct testP4LargestPalindromeProduct = null;

    /**
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        this.testP4LargestPalindromeProduct = new P4LargestPalindromeProduct();
    }

    /**
     *
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        this.testP4LargestPalindromeProduct = null;
    }

    @Test
    public void testIsPalindromicNumberForTrue() throws Exception {
        assertTrue(this.testP4LargestPalindromeProduct.isPalindromicNumber(9009l));
    }

    @Test
    public void testIsPalindromicNumberForFalse() throws Exception {
        assertFalse(this.testP4LargestPalindromeProduct.isPalindromicNumber(9109l));
    }

    @Test
    public void testDetermineLargestPalindromicNumberGivenNDigits() throws Exception {
        assertNull(this.testP4LargestPalindromeProduct.determineLargestPalindromicNumberGivenNDigits(null));
    }

    @Test
    public void testDetermineLargestPalindromicNumberGiven2Digits() throws Exception {
        assertEquals(9009l, this.testP4LargestPalindromeProduct.determineLargestPalindromicNumberGivenNDigits(2).longValue());
    }

    @Test
    public void testDetermineLargestPalindromicNumberGiven3Digits() throws Exception {
        assertEquals(906609l, this.testP4LargestPalindromeProduct.determineLargestPalindromicNumberGivenNDigits(3).longValue());
    }

}