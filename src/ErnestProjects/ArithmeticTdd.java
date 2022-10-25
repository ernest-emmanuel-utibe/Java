package ErnestProjects;

public class ArithmeticTdd {
    public  int  number;

    public int getSquareOfNumbers(int num) {
        return num * num;
    }
    public int getDifferenceOfNumbers(int num1, int num2){
        return Math.abs(num2 - num1);
    }

    public long getAdditionOfNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public double getDivisionOfNumbers(double num1, double num2) {
        return num1 / num2;
    }
}
