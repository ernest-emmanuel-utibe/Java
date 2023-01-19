package Grace_Assignment;

import java.util.Scanner;

public class GuessingApp{
    public static void main(String[] args) {

        int value = 98;

        Scanner sc = new Scanner(System.in);

        int count = 1;

        while (count < 3) {
            System.out.println("Guess the digit");
            int number= sc.nextInt();

            if (value < number) {
                System.out.println("Too High, try again");
            }
            else if (value > number) {
                System.out.println("Too Low, try again");
            }
            else System.out.println("Correct ;). You guessed right");
        }
    }
}