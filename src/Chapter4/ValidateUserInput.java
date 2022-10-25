package Chapter4;

import java.util.Scanner;

public class ValidateUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        while (number != 1 && number != 2){
            System.out.println("Enter a number: ");
            number = input.nextInt();

            if (number != 2 && number != 1) {
                System.out.println("Invalid number");
            }
        }
    }
}
