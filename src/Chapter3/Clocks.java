package Chapter3;

public class Clocks {
    public int seconds;
    public int hours;
    public int minutes;

    public Clocks(int hour, int minutes, int seconds) {
        this.hours = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHours(int hours) {
        this.hours = seconds;
    }

    public int getHours() {
        return this.hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return this.seconds;
    }
}
