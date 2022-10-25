package ErnestProjects;

// Creating  a method and supplying a parameter of an array

public class ArrayParametersInAMethod {

    public static int addNumbers(int[] numbers) {

        int sum = 0;

        for (int value = 0; value < numbers.length; value++){
            sum = sum + value;
        }
        return sum;
    }
}
