package Chapter2;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int integer1 = e.nextInt();
        System.out.println("Enter second integer: ");
        int integer2 = e.nextInt();

        int result1 = integer1 * integer1 * integer1;
        int result2 = integer2 * integer2;

        if (result1 % result2 == 0) {
            System.out.println("First number tripled is a multiple of second number doubled");
        }
        else {
            System.out.println("First number tripled is not a multiple of second number doubled");
        }
    }
}
