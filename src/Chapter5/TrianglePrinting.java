package Chapter5;

public class TrianglePrinting {
    public static void main(String[] args) {
        System.out.println("(A)");
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i > 5; i--) {
            for (int a = 0; a < i; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("(B)");
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("(C)");
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int b = 0; b <= 10 - i; b++) {
                System.out.print("  ");
            }
        }
        System.out.println();
        System.out.println("(D)");

        for (int i = 1; i <= 10; i++) {
            for (int b = 1; b <= 10 - i; b++) {
                System.out.print("  ");
            }

            for (int a = 1; a <= i; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
