package tdd.RainFallTest;

import ErnestProjects.RainFallInLagos;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RainFallTest {
    @Test
    public void numberOfRainFallInJanuaryTests() {
        double numberOfRainFall = RainFallInLagos.numberOfRainFall("January", 2);
        assertEquals(15.0, numberOfRainFall);
    }

    @Test
    public void numberOfRainFallInFebruaryTests() {
        double numberOfRainFall = RainFallInLagos.numberOfRainFall("February", 3);
        assertEquals(40.0, numberOfRainFall);
    }

    @Test
    public void numberOfRainFallInMarchTests() {
        double numberOfRainFall = RainFallInLagos.numberOfRainFall("March", 6);
        assertEquals(75.0, numberOfRainFall);
    }

    @Test
    public void numberOfRainFallInAprilTests() {
        double numberOfRainFall = RainFallInLagos.numberOfRainFall("April", 9);
        assertEquals(140.0, numberOfRainFall);
    }

    @Test
    public void numberOfRainFallInMayTests() {
        double numberOfRainFall = RainFallInLagos.numberOfRainFall("May", 12);
        assertEquals(205.0, numberOfRainFall);
    }

    @Test
    public void numberOfRainFallInJuneTests() {
        double numberOfRainFall = RainFallInLagos.numberOfRainFall("June", 16);
        assertEquals(310.0, numberOfRainFall);
    }

    @Test
    public void numberOfRainFallInJulyTests() {
        double numberOfRainFall = RainFallInLagos.numberOfRainFall("July", 13);
        assertEquals(255.0, numberOfRainFall);
    }

    @Test
    public void numberOfRainFallInAugustTests() {
        double numberOfRainFall = RainFallInLagos.numberOfRainFall("August", 12);
        assertEquals(110.0, numberOfRainFall);
    }

    @Test
    public void numberOfRainFallInSeptemberTests() {
        double numberOfRainFall = RainFallInLagos.numberOfRainFall("September", 13);
        assertEquals(165.0, numberOfRainFall);
    }

    @Test
    public void numberOfRainFallInOctoberTests() {
        double numberOfRainFall = RainFallInLagos.numberOfRainFall("October", 11);
        assertEquals(135.0, numberOfRainFall);
    }

    @Test
    public void numberOfRainFallInNovemberTests() {
        double numberOfRainFall = RainFallInLagos.numberOfRainFall("November", 5);
        assertEquals(55.0, numberOfRainFall);
    }

    @Test
    public void numberOfRainFallInDecemberTests() {
        double numberOfRainFall = RainFallInLagos.numberOfRainFall("December", 1);
        assertEquals(20.0, numberOfRainFall);
    }
}
