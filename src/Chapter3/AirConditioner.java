package Chapter3;

public class AirConditioner {
    public String name;
    public int temperature;
    private String state;

    public void turnOn() {
        state = "It is on";
    }

    public void turnOff() {
        state = "It is off";
    }

    public String showState() {
        return state;
    }

    public void increaseTemperature(int increase) {
        temperature = temperature + increase;
        if (temperature > 30) {
            temperature = 30;
        }
    }

    public void decreaseTemperature(int decrease) {
        temperature = temperature - decrease;
        if (temperature < 16) {
            temperature = 16;
        }
    }

    public int showTemperature() {
        return temperature;
    }
}
