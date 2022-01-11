import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorImplTest {
    Calculator calculator;

    @Before
    public void start() throws Exception {
        calculator = new CalculatorImpl();
        System.out.println("In start calculator=" + calculator);
    }

    @After
    public void finish() throws Exception {
        calculator = null;
        System.out.println("In finish calculator" + calculator);
    }

    @Test
    public void addNullPlusNull() {
        System.out.println("Before addNullPlusNull");
        assertEquals(0, calculator.add(0, 0));
        System.out.println("After addNullPlusNull");
    }

    @Test
    public void addValuePlusValue() {
        assertEquals(11, calculator.add(5, 6));
    }

    @Test
    public void addNullPlusValue() {
        assertEquals(5,calculator.add(0, 5));

    }

    @Test
    public void subtractZeroAndZero() {
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    public void subtractValueAndZero() {
        assertEquals(1, calculator.subtract(1, 0));
    }

    @Test
    public void subtractValueAndValue() {
        assertEquals(0, calculator.subtract(7, 7));
    }

    @Test
    public void subtractValueAndBiggerValue() {
        assertEquals(-5, calculator.subtract(2, 7));
    }

    @Test(expected = DivisionException.class)
    public void divideZeroAndZero() throws DivisionException {
        calculator.divide(0, 0);
    }

    @Test(expected = DivisionException.class)
    public void divideValueAndZero() throws DivisionException {
        calculator.divide(2, 0);
    }

    @Test
    public void divideValueAndValue() throws DivisionException {
        assertEquals(5, calculator.divide(10,2));
    }

    @Test(expected = DivisionException.class)
    public void divideValueAndValueNotIntegerResult() throws DivisionException {
        calculator.divide(10,3);
    }

    @Test(expected = DivisionException.class)
    public void divideValueAndValueNotIntegerResult_2() throws DivisionException {
        calculator.divide(3,5);
    }

    @Test
    public void divideZeroAndValue() throws DivisionException {
        assertEquals(0,calculator.divide(0,1));
    }

    @Test
    public void multiplyZeroAndZero() {
        assertEquals(0, calculator.multiply(0, 0));
    }

    @Test
    public void multiplyValueAndValue() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void multiplyZeroAndValue() {
        assertEquals(0, calculator.multiply(0, 3));
    }

    @Test
    public void multiply2() {
         calculator = new Calculator2();
        assertEquals(0, calculator.multiply(0, 3));
    }
}