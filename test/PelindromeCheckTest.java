import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PelindromeCheckTest {
    PelindromeCheck obj;
    @Before
    public void setUp()
    {
        obj = new PelindromeCheck();
    }

    @After
    public void tearDown()
    {
        obj = null;
    }

    @Test
    public void reverseSuccess_1()
    {
       int actual = obj.reverse(121);
       int expected = 121;
        assertEquals(expected,actual);
    }

    @Test
    public void reverseSuccess_2()
    {
        int actual =  obj.reverse(235542);
        int expected = 245532;
        assertEquals(expected,actual);
    }

    @Test
    public void pelindromeSuccess()
    {
        boolean actual1 =  obj.pelindrome(121);
        boolean expected1 = true;
        assertEquals(expected1,actual1);
    }
    @Test
    public void pelindromeFail()
    {
        boolean actual2 =  obj.pelindrome(235542);
        boolean expected2 = false;
        assertEquals(expected2,actual2);
    }
}
