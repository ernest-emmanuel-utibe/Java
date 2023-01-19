package Chapter4;

public class Mystery {
    public static void main(String[] args) {
        int x = -2;
        int total = 0;

        while (x <= 10) {
            int y = x + 2;
            x++;
            System.out.println("X => " + x);
            total += y;

            System.out.printf("Y is: %d and total is %d\n", y, total);
        }

    }
}
