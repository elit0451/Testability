import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(0, GoodCalculator.add(0, 0));
        assertEquals(4, GoodCalculator.add(2, 2));
        assertEquals(8, GoodCalculator.add(2, 6));
    }

    @Test
    public void testSubtract() {
        assertEquals(6, GoodCalculator.subtract(10, 4));
    }

    @Test
    public void testSum() {
        //Arrange
        int[] numbers = new int[] { };
        assertEquals(0, GoodCalculator.sum(numbers));

        numbers = new int[5];

        numbers[0] = 7;
        assertEquals(7, GoodCalculator.sum(numbers));

        numbers[0] = 7;
        numbers[1] = 11;
        assertEquals(18, GoodCalculator.sum(numbers));

    }

    @Test
    public void testMultiply() {
        assertEquals(4, GoodCalculator.multiply(2, 2));
        assertEquals(-2, GoodCalculator.multiply(2, -1));
    }

    @Test
    public void testDivide() {
        assertEquals(2, GoodCalculator.divide(4, 2));
        assertEquals(4, GoodCalculator.divide(-4, -1));
    }

    @Test
    public void testShouldThrowWhenDivisorZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            GoodCalculator.divide(10, 0);
        });
    }

    @Test
    public void testNotThrowWhenDividentZero() {

        assertDoesNotThrow(() -> {
            GoodCalculator.divide(0, 2);
        });
    }

    @Test
    public void testPower() {
        assertEquals(9, GoodCalculator.power(3,2));
    }

    @Test
    public void testValidfactorial() {
        assertEquals(120, GoodCalculator.factorial(5));
    }

    @Test
    public void testShouldThrowWhenNegativeFactorial() {
        assertThrows(IllegalArgumentException.class, () -> {
            GoodCalculator.factorial(-5);
        });
    }
}

