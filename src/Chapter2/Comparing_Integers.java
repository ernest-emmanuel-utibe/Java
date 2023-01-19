package Chapter2;

import java.util.Scanner;

public class Comparing_Integers {
    /*
    Write an application that asks the user to enter one integer, obtains
    it from the user and displays whether the number and its square are greater than, equal to, not equal
    to, or less than the number 100.
    */


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = s.nextInt();


        if(number > 100) {
            System.out.printf("%d > 100%n", number);
        }

        if(number < 100) {
            System.out.printf("%d < 100%n", number);
        }

        if(number != 100) {
            System.out.printf("%d != 100%n", number);
        }

        if(number == 100) {
            System.out.printf("%d == 100%n", number);
        }

        if(number * number > 100) {
            System.out.printf("%d > 100%n", number * number);
        }

        if(number * number < 100) {
            System.out.printf("%d < 100%n", number * number);
        }

        if(number * number != 100) {
            System.out.printf("%d != 100%n", number * number);
        }

        if(number * number == 100) {
            System.out.printf("%d == 100%n", number * number);
        }

    }
}