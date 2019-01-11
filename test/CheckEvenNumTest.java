import org.junit.Test;
import static org.junit.Assert.*;

public class CheckEvenNumTest {


    @Test
    public void testSuccess_1()
    {
        boolean actual = EvennumCheck.isEven(24);
        boolean expected =true;
        assertEquals(expected,actual);
    }

    @Test
    public void testFail()
    {
        boolean actual = EvennumCheck.isEven(123);
        boolean expected =false;
        assertEquals(expected,actual);
    }
}
