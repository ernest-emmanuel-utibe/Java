package ErnestProjects;

public class Student {
    public String firstName;
    public double average;

    public Student(String firstName, double average) {
        this.firstName = firstName;
        this.average = average;
    }

    public void setName(String name) {
        this.firstName = firstName;
    }

    public String getName() {
        return firstName;
    }

    public double setAverage(double studentAverage) {
        if (average > 0.0) {
            if (average <= 100.0) {
                this.average = average;
            }
        }
        return studentAverage;
    }

    public double getAverage() {
        return average;
    }

    public String getLetterGrade() {
        String letterGrade = "";

        if (average >= 90.0) {
            letterGrade = "A";
        } else if (average >= 80.0) {
            letterGrade = "B";
        } else if (average >= 70.0) {
            letterGrade = "C";
        } else if (average >= 60.0) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        return letterGrade;
    }
}
