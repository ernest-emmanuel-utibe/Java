package tdd.AirConditionerTest;
import Chapter3.AirConditioner;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AirConditionerTest<airConditioner> {

	AirConditioner airconditioner;

	@Test
	void testThatObjectExist() {
		AirConditioner airConditioner = new AirConditioner();
		airConditioner.turnOn();
		String state = airConditioner.showState();
		assertEquals("It is on", state);
	}

	@Test
	void whenTurnOffTest() {
		AirConditioner airConditioner = new AirConditioner();
		airConditioner.turnOff();
		String state = airConditioner.showState();
		assertEquals("It is off", state);
	}

	@Test
	void whenIncreaseTemperatureTest() {
		AirConditioner airConditioner = new AirConditioner();
		airConditioner.increaseTemperature(30);
		int temperature = airConditioner.showTemperature();
		assertEquals(30, temperature);
	}

	@Test
	void whenDecreaseTemperature() {
		AirConditioner airConditioner = new AirConditioner();
		airConditioner.increaseTemperature(25);
		airConditioner.decreaseTemperature(5);
		int temperature = airConditioner.showTemperature();
		assertEquals(20, temperature);
	}

	@Test
	void whenIncreaseTemperatureBeyond30Test() {
		AirConditioner airConditioner = new AirConditioner();
		airConditioner.increaseTemperature(24);
		airConditioner.decreaseTemperature(10);
		int temperature = airConditioner.showTemperature();
		assertEquals(16, temperature);
	}

	 @Test
	 void whenDecreaseTemperatureBelow16Test() {
		AirConditioner airConditioner = new AirConditioner();
		airConditioner.increaseTemperature(12);
		airConditioner.decreaseTemperature(10);
		int temperature = airConditioner.showTemperature();
		assertEquals( 16, temperature);
	}
}
