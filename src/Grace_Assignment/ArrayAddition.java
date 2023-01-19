package Grace_Assignment;

        /*
        Create an Array and initialize it with values, Then Sum all the values in the Array and print them out.
        Write Pseudocode for it.
        */

public class ArrayAddition {
    public static void main(String[] args) {
        int[] numbers = {90, 40, 90, 89, 32, 51, 64, 87, 19, 92, 96, 85, 62, 53, 30, 46};  // Initialize an array with a set of numbers.
        
        int sum = 0;  // Initialize to zero a variable named total, to store tge total of the value in the array.
        for (int index = 0; index < numbers.length; index++) {    // Run a loop to calculate the values and store in sum.
            sum = sum + numbers[index];
        }
        // Print the sum.
        System.out.println(sum);
    }
}
