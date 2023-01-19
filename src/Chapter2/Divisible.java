package Chapter2;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int integer = s.nextInt();

        if (integer % 3 == 0) {
            System.out.println("Integer is divisible by 3");
        }
        else {
            System.out.println("Integer is not divisible by 3");
        }
    }
}
