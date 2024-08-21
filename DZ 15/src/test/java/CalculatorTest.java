import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void addTest() {
        assertEquals(15, calc.add(10, 5));
    }

    @Test
    public void subtractTest() {
        assertEquals(5, calc.subtract(10,5));
    }
    @Test
    public void multiplyTest() {
        assertEquals(50, calc.multiply(10,5));
    }
    @Test
    public void divideTest() {
        assertEquals(2, calc.divide(10,5));
    }
    @Test
    public void divideByZeroTest(){
        ArithmeticException ae = assertThrows(ArithmeticException.class, () -> calc.divide(5,0));
        assertEquals("Делить на ноль нельзя", ae.getMessage());
    }



}