import com.stackroute.pe2.EvennumCheck;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckEvenNumTest {


    @Test
    public void testCheckEvenNumSuccess()
    {
        boolean actual = EvennumCheck.isEven(24);
        boolean expected =true;
        assertEquals(expected,actual);
    }
    @Test
    public void testCheckEvenNumFailure()
    {
        boolean actual = EvennumCheck.isEven(123);
        boolean expected =true;
        assertNotEquals(expected,actual);
    }
}
