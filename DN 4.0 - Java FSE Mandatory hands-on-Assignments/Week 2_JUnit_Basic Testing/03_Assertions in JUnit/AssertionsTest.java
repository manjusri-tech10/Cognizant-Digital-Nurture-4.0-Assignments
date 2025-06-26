import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        int expected = 5;
        int actual = 2 + 3;
        System.out.println("Checking assertEquals: Expected 5, Actual " + actual);
        assertEquals(expected, actual);

        boolean conditionTrue = 5 > 3;
        System.out.println("Checking assertTrue: 5 > 3 is " + conditionTrue);
        assertTrue(conditionTrue);

        boolean conditionFalse = 5 < 3;
        System.out.println("Checking assertFalse: 5 < 3 is " + conditionFalse);
        assertFalse(conditionFalse);

        Object obj1 = null;
        System.out.println("Checking assertNull: Object is " + obj1);
        assertNull(obj1);

        Object obj2 = new Object();
        System.out.println("Checking assertNotNull: Object is not null -> " + obj2);
        assertNotNull(obj2);
    }
}
