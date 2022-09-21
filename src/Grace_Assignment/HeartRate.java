package Grace_Assignment;

public class HeartRate {

    private String firstName;
    private String lastName;
    private int year;
    private int month;
    private int day;
    private int age;

    public HeartRate(String firstName, String lastName, int year, int month, int day, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void getDateOfBirth() {
        System.out.printf("%d-%02d-%02d", year, month, day);
    }
    public void setAge() {
        this.age =2022 - year;
    }
    public int getAge() {
        return age;
    }
    public int getMaximumHeartRate() {
        int maximumHeartRate;
        maximumHeartRate = 220 - getAge();
        return maximumHeartRate;
    }
    public void getTargetHeartRate() {
        int heart = 50 * getMaximumHeartRate() / 100;
        int rate = 85 * getMaximumHeartRate() / 100;

        System.out.printf("Target heart rate is %d to %d bpm", heart, rate);
    }
}
