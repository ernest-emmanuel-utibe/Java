package Chapter2;
        /*
        Write an application that displays the numbers 1 to 4 on the same line, with each pair of
        adjacent numbers separated by one space. Use the following techniques:
        a) Use one System.out.println statement.
        b) Use four System.out.print statements.
        c) Use one System.out.printf statement.
        */

public class Print_Four_Numbers {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;

        System.out.println("(a)");
        System.out.println(num1 +" "+ num2 +" "+ num3 +" "+ num4);

        System.out.println();

        System.out.println("(b)");
        System.out.print(num1 +" ");
        System.out.print(num2 +" ");
        System.out.print(num3 +" ");
        System.out.print(num4);

        System.out.println("\n");

        System.out.println("(c)");
        System.out.printf("%d %d %d %d", num1,num2,num3,num4);
    }

}