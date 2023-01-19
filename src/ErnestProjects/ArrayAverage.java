package ErnestProjects;

// Create an Array that calculates the average of numbers

public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {123, 45, 56, 57, 78, 80, 78, 45, 24, 27, 56, 25};
        int total = 0;

        for (int index = 0; index < numbers.length; index++) {
            total = total + numbers[index];
        }
        System.out.println(total / numbers.length);
    }
}
