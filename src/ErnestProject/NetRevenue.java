package ErnestProject;

import java.util.Scanner;

public class NetRevenue {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Declare instance variable
        int revenue, quantity, price;
        int discount;

        // Prompt user for values
        System.out.println("Enter product price:");
        price = sc.nextInt();
        System.out.println("Enter quantity price:");
        quantity = sc.nextInt();

        // Formula given
        revenue = price * quantity;

        // Using if statement
        if (revenue > 5000) {
            discount = revenue * 10 / 100;
            revenue = revenue - discount;
        }

        System.out.println("The product price is  " + price);
        System.out.println("The net revenue is  " + revenue);
    }
}
