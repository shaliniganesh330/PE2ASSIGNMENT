import com.stackroute.pe2.CheckPowerOfFour;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPowerOfFourTest {

    CheckPowerOfFour obj;

    @Before
    public void setUp() {
        obj = new CheckPowerOfFour();
    }

    @After
    public void tearDown() {

        obj = null;
    }

    @Test
    public void testCheckPowerOfFourSuccess() {
        boolean actual = obj.checkPowerOfFour(64);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckPowerOfFourFailure() {
        boolean actual = obj.checkPowerOfFour(122);
        boolean expected = true;
        assertNotEquals(expected, actual);
    }
    @Test
        public void testCheckPowerOfFourInvalid() {
        boolean actual = obj.checkPowerOfFour(0);
        boolean expected = false;
        assertFalse(null, actual);
    }
}
