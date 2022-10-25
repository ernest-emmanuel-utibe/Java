package ErnestProject;

import java.util.Scanner;

public class ConvertToPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxNumber = 100;
        double percentage = 0;

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        percentage = (double) number / maxNumber * 100;

        System.out.printf("Percentage is %.2f%%", percentage);
    }
}
