package pl.edu.agh.mwo.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        assertEquals(12,calculator.sum(5,7));
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        assertEquals(2,calculator.subtract(7,5));
    }

    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator();
        assertEquals(35,calculator.multiply(7,5));
    }

    @Test
    public void testDivide(){
        Calculator calculator = new Calculator();
        assertEquals(7.0,calculator.divide(35,5));
    }

    @Test (expected = Exception.class)
    public void testDivideByZero(){
        Calculator calculator = new Calculator();
        calculator.divide(35,5);
    }

    @Test
    public void testAvg(){
        Calculator calculator = new Calculator();
        assertEquals(7.0,calculator.avg(9,5));
    }

    @Test
    public void testAvgMultiply(){
        Calculator calculator = new Calculator();
        ;
    }


}
