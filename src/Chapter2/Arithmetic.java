package Chapter2;

import java.util.Scanner;
        /*
        Write an application that asks the user to enter two integers, obtains them from
        the user and prints the square of each, the sum of their squares, and the difference of the squares (first
        number squared minus the second number squared). Use the techniques shown in Fig. 2.7.
        */


public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int sum;
        int diff;
        int product;
        int quotient;

        System.out.println("Enter first integer: ");
        num1 = input.nextInt();
        System.out.println("Enter second integer: ");
        num2 = input.nextInt();

        sum = num1 + num2;
        diff = num1 - num2;
        product = num1 + num2;
        quotient = num1 / num2;

        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Product is %d%n", product);
        System.out.printf("Difference is %d%n", diff);
        System.out.printf("Quotient is %d%n", quotient);

    }
}