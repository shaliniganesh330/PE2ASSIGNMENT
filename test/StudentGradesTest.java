import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentGradesTest {
    StudentsGrade obj ;
    @Before
    public void setUp() {
        obj = new StudentsGrade();
    }

    @After
    public void tearDown() {
        obj = null;
    }

    @Test
    public void testAverage()
    {
        double[] numbers = {10,20,34,45};
        double expectedValue = 27.25;
        double actualValue = obj.getavgvalue(4,numbers);
        assertEquals(expectedValue,actualValue,27.250);
    }

    @Test
    public void testMaximum()
    {
        int[] a={10,20,30,40};
        int expectedValue = 40;
        int actualValue = obj.MaxValue(4,a);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testMinimum()
    {
        int[] a={10,20,30,40};
        int expectedValue = 10;
        int actualValue = obj.MinValue(4,a);
        assertEquals(expectedValue,actualValue);
    }
}
