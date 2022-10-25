package ErnestProjects;

import ErnestProjects.ArithmeticTdd;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ArithmeticTddTest {

    @Test
    void testToGetSquareOfTheNumber() {
        ArithmeticTdd num = new ArithmeticTdd();
        assertEquals(25, num.getSquareOfNumbers(5));
    }
    @Test
    void testToGetDifferenceOfNumbers(){
        ArithmeticTdd num = new ArithmeticTdd();
        assertEquals(4, num.getDifferenceOfNumbers(10, 6));
    }
    @Test
    void testToGetAdditionOfNumbers() {
        ArithmeticTdd num = new ArithmeticTdd();
        assertEquals( 13, num.getAdditionOfNumbers(10, 3));
    }
    @Test
    void testToGetDivisionOfNumbers(){
        ArithmeticTdd num = new ArithmeticTdd();
        assertEquals( 12.5, num.getDivisionOfNumbers(25, 2));
    }


}
