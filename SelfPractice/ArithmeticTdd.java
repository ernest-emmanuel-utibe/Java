package SelfPractice;

public class ArithmeticTdd {
    public  int  number;

//    public ArithmeticTdd(){
//        this.number = num;
//    }
    public int getSquareOfNumbers(int num) {
        return num * num;
    }
    public int getDifferenceOfNumbers(int num1, int num2){
//        if (num2 < num1){
//            int temp = num2;
//            num2 = num1;
//            num1 = temp;
//        }
        return Math.abs(num2 - num1);
    }

    public long getAdditionOfNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public double getDivisionOfNumbers(double num1, double num2) {
        return num1 / num2;
    }
}
