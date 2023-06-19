import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before(){
        calculator= new Calculator();
    }


    @Test
    public void canAdd(){
       assertEquals(12, calculator.addNums(5,7));
}
    @Test
    public void canSubtract(){
        assertEquals(3, calculator.subtractNums(10,7));
    }

    @Test
    public void canMultiply(){
        assertEquals(14, calculator.multiplyNums(2,7));
    }

    @Test
    public void candivide(){
        assertEquals(5, calculator.divideNums(10,2), 0.0);
    }




}
