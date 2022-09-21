package SelfPractice;

// Create an Array that multiplies ll the numbers

public class ArrayMultiple {
    public static void main(String[] args) {
        int[] numbers = {120, 129, 234, 45, 667, 847,365, 927,487, 490, 253, 465};

        long total  = 1;
        for (int index = 0; index < numbers.length; index++) {
            total = total * numbers[index];
        }
        System.out.println(total);
    }
}
