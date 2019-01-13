import com.stackroute.pe2.CheckFactorial;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class FactorialofNumTest {
    CheckFactorial factorialobj;

    @Before
    public void setUp() throws Exception {

        factorialobj = new CheckFactorial();
    }

    @After
    public void tearDown() throws Exception {
        factorialobj = null;
    }

    @Test
    public void testFactorialSuccess() {
        long expected = 720;
        long actual = factorialobj.factorial(6);
        assertEquals(expected, actual);
    }

    @Test
    public void testFactorialSuccesss() {
        long expected = 479001600;
        long actual = factorialobj.factorial(12);
        assertEquals(expected, actual);
    }

    @Test
    public void testFactorialSuccesstwo() {
        long expected = 1;
        long actual = factorialobj.factorial(0);
        assertEquals(expected, actual);
    }

    @Test
    public void testFactorialFailure() {
        long expected = 32345768;
        long actual = factorialobj.factorial(22);
        assertNotEquals(expected, actual);
    }
}
