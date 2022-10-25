package tdd.Phone_3310;

import ErnestProject.Phone_3310;

import java.util.Scanner;

public class Phone_3310Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name to proceed: ");
        String user = input.next();
        Phone_3310.setName(user);

        for (int i = 1; i <= 50; i++) {
            System.out.println("Press 1 for main menu or 99 to terminate.");
            int begin = input.nextInt();
            if (begin == 1 || begin == 99) {
                if (begin == 1) {
                    Phone_3310.mainMenu();
                } else {
                    System.out.println("Thanks for using our app");
                    break;
                }
            } else {
                System.out.println("Enter either 1 or 99!");
            }
        }
    }
}
