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

        int num1;
        int num2;

        System.out.println("Enter first integer: ");
        num1 = s.nextInt();
        System.out.println("Enter second integer: ");
        num2 = s.nextInt();

        if (num1 > num2) {
            System.out.printf("%d is greater than %d", num1,num2);
        }
        if (num1 < num2) {
            System.out.printf("%d is lesser then %d", num2, num1);
        }
        if (num1 == num2) {
            System.out.println("Number is equal");
        }
    }
}