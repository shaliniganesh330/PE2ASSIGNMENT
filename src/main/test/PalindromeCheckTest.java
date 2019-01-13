import com.stackroute.pe2.PalindromeCheck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckTest {
    PalindromeCheck palindromeCheckobj;

    @Before
    public void setUp() {
        palindromeCheckobj = new PalindromeCheck();
    }

    @After
    public void tearDown() {
        palindromeCheckobj = null;
    }

    @Test
    public void testReverseSuccess() {
        int actual = palindromeCheckobj.reverse(121);
        int expected = 121;
        assertEquals(expected, actual);
    }

    @Test
    public void testReverseeSuccess() {
        int actual = palindromeCheckobj.reverse(235542);
        int expected = 245532;
        assertEquals(expected, actual);
    }

    @Test
    public void testPalindromeSuccess() {
        boolean actual1 = palindromeCheckobj.palindrome(121);
        boolean expected1 = true;
        assertEquals(expected1, actual1);
    }

    @Test
    public void testPalindromeFailure() {
        boolean actual2 = palindromeCheckobj.palindrome(235542);
        boolean expected2 = true;
        assertNotEquals(expected2, actual2);
    }
}
