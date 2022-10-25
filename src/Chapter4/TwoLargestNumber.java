package Chapter4;

import java.util.Scanner;

public class TwoLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int largest = 0;
        int secondLargest = 0;
        int counter = 0;

        while(counter < 10) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            }
            counter++;
        }
        System.out.printf("Largest number = %d%n", largest);
        System.out.printf("Second largest number = %d%n", secondLargest);

    }
}
