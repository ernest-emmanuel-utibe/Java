package Chapter4;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        // Declare and Create the Scanner object
        Scanner sc = new Scanner(System.in);

        // Declare the account detail variable. Since the data type is the same with all variables(e.g, int) together
        // with a comma to separate the variables.
        int account = 1, balance, charges, credits, credit_limit, newBalance;


        // Let's assume that an account number can't be zero so that
        // we can loop over every customer account number until we
        // type in 0 to tell the program to stop
        while(account != 0) {
            System.out.println();
            System.out.print("Input Account Number: ");
            account = sc.nextInt();

            System.out.print("Input Beginning Balance: ");
            balance = sc.nextInt();

            System.out.print("Input Total Charges: ");
            charges = sc.nextInt();

            System.out.print("Input Total Credits: ");
            credits = sc.nextInt();

            System.out.print("Input Credit Limit: ");
            credit_limit = sc.nextInt();

            // Calculate and display the New Balance
            newBalance = balance + charges - credits;
            System.out.println("New Balance: " + newBalance);

            if (newBalance > credit_limit){
                System.out.println("Credit Limit Exceeded");
                break;
            }
        }
    }
}
