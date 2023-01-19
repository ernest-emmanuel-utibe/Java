package Chapter2;

import java.util.Scanner;

public class Body_Mass_Index_Calculator {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.println("Enter your weight number in kilograms: ");
        int weight = m.nextInt();
        System.out.println("Enter your height number in meters: ");
        int height = m.nextInt();


        double bmi = (weight * 703) / (height * height);
        System.out.printf("Your BMI = %.2f%n", bmi);

    }
}
