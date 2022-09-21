package tdd.HeartRateTest;

import Grace_Assignment.HeartRate;

import java.util.Scanner;

public class HeartRateTest {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);

        HeartRate client = new HeartRate("Emmanuel", "Ernest", 1999, 5, 10,23);

        System.out.println("Enter your Firstname: ");
        String firstName = a.next();
        client.setFirstName(firstName);

        System.out.println();

        System.out.println("Enter your LastName: ");
        String lastName = a.next();
        client.setLastName(lastName);

        System.out.println();

        System.out.println("Enter your year of birth: ");
        int year = a.nextInt();
        client.setYear(year);

        System.out.println();

        System.out.println("Enter your month of birth: ");
        int month = a.nextInt();
        client.setMonth(month);

        System.out.println();

        System.out.println("Enter your day of birth: ");
        int day = a.nextInt();
        client.setDay(day);

        displayDetails(client);
    }

    public static void displayDetails(HeartRate person) {
        person.setAge();
        System.out.printf("%n%nThe details for: %s %S%n", person.getFirstName(), person.getLastName());
        person.getDateOfBirth();
        System.out.printf("%nAge is %d%n", person.getAge());
        System.out.printf("The maximum heart rate is %d%n", person.getMaximumHeartRate());
        person.getTargetHeartRate();
    }
}
