package ErnestProjects;

public class Shell_Co_Operations {
    private final String firstName;
    private final String lastName;
    public int age;
    public String gender;
    public String month;
    public String day;
    public int year;
    public double minimumHeartRate;
    public double maximumHeartRate;

    public Shell_Co_Operations(String firstName, String lastName, int age, String gender, String month, String day, int year
    ,double minimumHeartRate, double maximumHeartRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.month = month;
        this.day =  day;
        this.year = year;
        this.minimumHeartRate = minimumHeartRate;
        this.maximumHeartRate = maximumHeartRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public int getYear() {
        return  year;
    }

    public double getMaximumHeartRate() {
        maximumHeartRate = 450 - getAge();
        return maximumHeartRate;
    }

    public double getMinimumHeartRate() {
        minimumHeartRate = 0.9 * maximumHeartRate;
        return minimumHeartRate;
    }
}
