package Chapter4;
//        A large company pays its salespeople on a commission basis.
//        The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
//        salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or
//        a total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
//        these items are shown in Fig. 4.33. Develop a Java application that inputs one salesperson’s items
//        sold for last week and calculates and displays that salesperson’s earnings. There’s no limit to the number
//        of items that can be sold.




import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Create an instance variable
        int count = 0;
        double total = 0;
        int itemNumber = 0;
        System.out.println("Enter item number: ");  // Prompt user for a number
        itemNumber = input.nextInt();

        // Use the while statement
        while (itemNumber != -1) {

        // Use the switch statement and case it
        switch (itemNumber) {
            case 1:
                total += 239.99;
                System.out.println(total);
                break;
            case 2:
                total += 129.75;
                System.out.println(total);
                break;
            case 3:
                total += 99.95;
                System.out.println(total);
                break;
            case 4:
                total += 350.89;
                System.out.println(total);
                break;

            default:
                break;

        }
            System.out.println("Enter item number: ");
            itemNumber = input.nextInt();
        }
        double earnings = 200 + 0.09 * total;
        System.out.printf("Earnings for the week is %.2f", earnings);
    }
}
