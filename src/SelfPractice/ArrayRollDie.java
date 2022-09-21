package SelfPractice;

import java.security.SecureRandom;

public class ArrayRollDie {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int[] frequency = new int[7];

        for (int f : frequency) {
            System.out.println(f);
        }
        System.out.printf("%s%10%s%n", "Face", "Frequency");

       // for (int face : frequency) {
           // System.out.print("%4d%10d%n", face, frequency[face]);
       // }
    }
}
