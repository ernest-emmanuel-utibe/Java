package Chapter2;

import java.util.Scanner;

            /*
            Write an application that inputs three integers from the
            user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
            shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
            representation of the average. So, if the sum of the values is 7, the average should be 2, not
            2.3333….]
            */

public class Arithmetic_Smallest_Largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int sum;
        int average;
        int product;
        int smallest;
        int largest;

        System.out.println("Enter the first integer: ");
        num1 = s.nextInt();
        System.out.println("Enter the second integer: ");
        num2 = s.nextInt();
        System.out.println("Enter the third integer: ");
        num3 = s.nextInt();

        sum = num1 + num2 + num3;
        average = (sum) / 3;
        product = num1 * num2 * num3;

        smallest = num1;
        if (num2 <= smallest)
            smallest = num2;
        if (num3 <= smallest)
            smallest = num3;

        largest = num1;
        if (num2 >= largest)
            largest = num2;
        if (num3 >= largest)
            largest = num3;

        System.out.printf("Sum is %d\n", sum);
        System.out.printf("Product is %d\n", product);
        System.out.printf("Average number is %d\n", average);
        System.out.printf("Smallest integer is %d\n", smallest);
        System.out.printf("Largest integer is %d\n", largest);
    }
}