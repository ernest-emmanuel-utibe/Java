package Chapter4;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String number = " ";

        while (number.length() != 5) {
            System.out.println("Enter a five digit number: ");
            number = input.nextLine();

            if ((number.charAt(0) == number.charAt(4)) || (number.charAt(1) == number.charAt(3)))  {
                System.out.println("This is a Palindrome");
            }
            else {
                System.out.println("This is not a Palindrome");
            }
        }
    }
}
