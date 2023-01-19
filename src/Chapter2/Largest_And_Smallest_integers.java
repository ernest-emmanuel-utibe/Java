package Chapter2;

import java.util.Scanner;

public class Largest_And_Smallest_integers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;


        while (count <= 5){
            System.out.println("Enter the 5 digit integers: ");
            int numbers = input.nextInt();

            if (numbers > largest) {
                largest = numbers;
            }
            else {
                if (numbers < smallest) {
                    smallest = numbers;
                }
                count++;
            }
        }

        System.out.printf(largest+ " is the largest number ");
        System.out.printf(smallest+ "\t is the smallest number ");
    }
}
