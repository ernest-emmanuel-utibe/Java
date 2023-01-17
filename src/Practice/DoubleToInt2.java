package Practice;

public class DoubleToInt2 {
    public static void main(String[] args) {

        double firstBillAmt = 25.50;
        System.out.println("firstBillAmt: " + firstBillAmt);

        long bill1 = Math.round(firstBillAmt);
        System.out.println("bill1: " + bill1);

        int firstBill = (int) bill1;
        System.out.println("Your first bill amount is: $" + firstBill+".");

        double secondBillAmt = 25.20;
        System.out.println("secondBillAmt: " + secondBillAmt);

        long bill2 = Math.round(secondBillAmt);
        System.out.println("bill2: " + bill2);

        int secondBill = (int) bill2;
        System.out.println("Your second bill amount is: $" + secondBill+".");
    }
}
