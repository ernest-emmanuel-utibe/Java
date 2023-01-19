package ErnestProjects;

public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {24, 56, 78, 65, 87, 34, 57, 86};

        int sum = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int square = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];


            if (array[i] < smallest) {
                smallest = array[i];
            }
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println("Sum is: "+sum);
        System.out.println("Square Root is: "+Math.sqrt(sum));
        System.out.println("Largest is: "+largest);
        System.out.println("Smallest is: "+smallest);
    }
}
