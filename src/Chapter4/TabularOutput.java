package Chapter4;

// Write a Java application that uses looping to print the following table of
// values:

public class TabularOutput {
    public static void main(String[] args) {

        System.out.printf("%1s%6s%6s%6s%n", "N", "N^2", "N^3", "N^4");

        for (int counter = 1; counter <= 5; counter++) {
            System.out.printf("%1d%6d%6d%6d%n", counter, counter * counter, (int)Math.pow(counter,3), (int)Math.pow(counter,4));
        }
    }
}
