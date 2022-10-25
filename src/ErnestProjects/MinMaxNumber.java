package ErnestProjects;

import java.util.Scanner;
public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for (int gradeCount = 0; gradeCount < 5; gradeCount++) {
            System.out.println("Enter score between 0 - 100: ");
                int enterNumber = input.nextInt();
            if (enterNumber > 0 && enterNumber < 100) {
                if (gradeCount == 0){
                    min = enterNumber;
                    max = enterNumber;
                }
                if (enterNumber > max) {
                    max = enterNumber;
                }
                if (enterNumber < min) {
                    min = enterNumber;
                }
            }
            else {
                gradeCount--;
                System.out.println("Invalid score");
            }
        }
        System.out.printf("Maximum score is %d%n", max);
        System.out.printf("Minimum score is %d%n", min);
    }
}
