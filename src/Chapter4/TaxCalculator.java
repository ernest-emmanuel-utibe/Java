package Chapter4;

//        Develop a Java application that determines the total tax for each of three
//        citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
//        earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in
//        a given year. Your program should input this information for each citizen, then determine and display
//        the citizen’s total tax. Use class Scanner to input the data.





import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter citizen name
        System.out.print("Enter citizen name: ");
        String name = sc.next();

        // Prompt user to enter earnings per year
        System.out.print("Enter earnings per year: ");
        int earnings = sc.nextInt();

        double totalTax = 0;

        // Use nested if statement
        if (earnings <= 30_000) {
            totalTax = 0.15 * earnings;
        }
            else{
                totalTax = 0.2 * earnings;

            }
        System.out.printf("Total Tax for %s is %.2f", name, totalTax);
    }
}
