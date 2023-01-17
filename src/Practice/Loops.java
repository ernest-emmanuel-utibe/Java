package Practice;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Coding is fun.");
        }


        int i = 0;
        while (i < 5) {
            System.out.println("count while is: " + i);
            i++;
        }


        int count = 1;
        do {
            System.out.println("do-while count is: " + count);
            i++;
        } while (i < 5);


        String[] linesWords = {"Today is blessed"};
        for(String lines : linesWords) {
            System.out.println("lines are: " + lines);
        }
    }
}
