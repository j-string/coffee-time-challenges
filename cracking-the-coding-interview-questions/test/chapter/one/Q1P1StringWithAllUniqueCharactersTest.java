package chapter.one;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

import chapter.one.Q1P1StringWithAllUniqueCharacters;

/**
 * @author Justin Stringer
 *
 */
public class Q1P1StringWithAllUniqueCharactersTest {

        private Q1P1StringWithAllUniqueCharacters testQ1P1StringWithAllUniqueCharacters = null;

        @Before
        public void setup() { this.testQ1P1StringWithAllUniqueCharacters = new Q1P1StringWithAllUniqueCharacters(); }

        @After
        public void tearDown() { this.testQ1P1StringWithAllUniqueCharacters = null; }

        @Test
        public void testHasAllUniqueCharactersForNull() { assertNull(this.testQ1P1StringWithAllUniqueCharacters.hasAllUniqueCharacters(null)); }

        @Test
        public void testHasAllUniqueCharactersForEmptyString() { assertNull(this.testQ1P1StringWithAllUniqueCharacters.hasAllUniqueCharacters(null)); }

        @Test
        public void testHasAllUniqueCharactersForStringWithOneCharacter() { assertTrue(this.testQ1P1StringWithAllUniqueCharacters.hasAllUniqueCharacters("y")); }

        @Test
        public void testHasAllUniqueCharactersForTrue() { assertTrue(this.testQ1P1StringWithAllUniqueCharacters.hasAllUniqueCharacters("yes")); }

        @Test
        public void testHasAllUniqueCharactersForFalse() { assertFalse(this.testQ1P1StringWithAllUniqueCharacters.hasAllUniqueCharacters("no no")); }

}