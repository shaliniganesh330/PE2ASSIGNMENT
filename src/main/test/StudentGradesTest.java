import com.stackroute.pe2.StudentsGrade;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradesTest {
    StudentsGrade obj;

    @Before
    public void setUp() {
        obj = new StudentsGrade();
    }

    @After
    public void tearDown() {
        obj = null;
    }

    @Test
    public void testAverageSuccess() {
        double[] numbers = {10, 20, 34, 45};
        double expectedValue = 27.25;
        double actualValue = obj.getAvgvalue(4, numbers);
        assertEquals(expectedValue, actualValue, 27.250);
    }

    @Test
    public void testMaximumSuccess() {
        int[] a = {10, 20, 30, 40};
        int expectedValue = 40;
        int actualValue = obj.maxValue(4, a);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testMinimumSuccess() {
        int[] a = {10, 20, 30, 40};
        int expectedValue = 10;
        int actualValue = obj.minValue(4, a);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testAverageFailure() {
        double[] numbers = {10, 20, 34, 45};
        double expectedValue = 71.25;
        double actualValue = obj.getAvgvalue(4, numbers);
        assertNotEquals(expectedValue, actualValue, 27.250);
    }

    @Test
    public void testMaximumFailure() {
        int[] a = {10, 20, 30, 40};
        int expectedValue = 30;
        int actualValue = obj.maxValue(4, a);
        assertNotEquals(expectedValue, actualValue);
    }

    @Test
    public void testMinimumFailure() {
        int[] a = {10, 20, 30, 40};
        int expectedValue = 40;
        int actualValue = obj.minValue(4, a);
        assertNotEquals(expectedValue, actualValue);
    }
}
