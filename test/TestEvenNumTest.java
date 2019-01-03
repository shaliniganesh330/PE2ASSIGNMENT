import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestEvenNumTest {


    @Test
    public void testSuccess_1()
    {
        boolean actual = Evennumtest.isEven(24);
        boolean expected =true;
        assertEquals(expected,actual);
    }

    @Test
    public void testFail()
    {
        boolean actual = Evennumtest.isEven(123);
        boolean expected =false;
        assertEquals(expected,actual);
    }
}
