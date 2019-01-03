import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CheckPowerOfFourTest {

    CheckPowerOfFour obj ;
    @Before
    public void setUp() {
        obj = new CheckPowerOfFour();
    }

    @After
    public void tearDown() {

        obj = null;
    }

    @Test
    public void testSuccess()
    {
        boolean actual =  obj.checkPowerOfFour(64);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    public void testFail()
    {
        boolean actual =  obj.checkPowerOfFour(122);
        boolean expected = false;
        assertEquals(expected,actual);
    }

}
