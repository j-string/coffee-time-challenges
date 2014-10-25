/**
 *
 * Problem 4: Largest palindrome product
 *
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * @author Justin Stringer
 */
public class P4LargestPalindromeProduct {

    public Long determineLargestPalindromicNumberGivenNDigits(Integer digits) {

        if (digits == null || digits == 0) { return null; }

        else if (digits == 1) { return 9l; }

        else {

            Long startingNumberOne = 9l;
            for (int i = 1; i < digits; i++) {
                startingNumberOne *= 10;
                startingNumberOne += 9;
            }

            Long currentHighest = 0l;

            for (Long i = startingNumberOne; i > 0; i--) {
                for (Long j = i; j > 0; j--) {
                    Long currentNumber = i*j;
                    if (this.isPalindromicNumber(currentNumber) && currentNumber > currentHighest) {
                        currentHighest = currentNumber;
                    }
                }
            }

            return currentHighest;
        }
    }

    /**
     *
     * @param number
     * @return
     */
    protected Boolean isPalindromicNumber(Long number) {

        String numberAsString = String.valueOf(number);
        String numberAsReversedString = new StringBuilder(numberAsString).reverse().toString();

        if (numberAsString.compareTo(numberAsReversedString) == 0) return true;
        else return false;
    }
}
