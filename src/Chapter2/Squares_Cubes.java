package Chapter2;

//        Using only the programming techniques you learned in this
//        chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and
//        prints the resulting values in table format

public class Squares_Cubes {
    public static void main(String[] args) {

        int cube = 0;
        int square = 0;

        System.out.println("Number\t Square \t Cube");

        for (int i = 0; i <= 10; i++) {
            square = i * i;
            cube = i * i * i;

            System.out.printf("%n%3d%11d%12d", i, square, cube);
        }

    }
}