import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class FactorialofNumTest {
    Factorial obj;
    @Before
    public void setUp() throws Exception {

        obj = new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test    public void factorial_sucess_1() {
        long expected = 720;
        long actual = obj.factorial(6);
        assertEquals(expected, actual);
    }
    @Test
    public void factorial_sucess_2() {
        long expected = 479001600;
        long actual = obj.factorial(12);
        assertEquals(expected, actual);
    }
    @Test
    public void factorial_sucess_3() {
        long expected = 32345768;
        long actual = obj.factorial(22);
        assertNotEquals(expected, actual);
    }
}
