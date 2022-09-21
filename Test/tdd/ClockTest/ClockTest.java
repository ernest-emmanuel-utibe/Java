package tdd.ClockTest;

import Chapter3.Clocks;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ClockTest {

    @Test
    void checkThatHourExist() {
        Clocks clocks = new Clocks(2, 45, 10);
        clocks.setHours(10);
        assertEquals(10,clocks.getHours());
    }
    @Test
    void checkThatMinutesExist() {
        Clocks e = new Clocks(9,55,60);
        e.setMinutes(20);
        assertEquals(20, e.getMinutes());
    }
    @Test
    void checkThatSecondsExist() {
        Clocks a = new Clocks(11,35,40);
        a.setSeconds(40);
        assertEquals(40, a.getSeconds());
    }

}



