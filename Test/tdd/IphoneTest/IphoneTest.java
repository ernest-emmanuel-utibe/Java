package tdd.IphoneTest;

import Grace_Assignment.Iphone;

public class IphoneTest {
    public static void main(String[] args) {
        Iphone phone11 = new Iphone();
        Iphone phone14 = new Iphone();

        phone11.setColor("Black");
        phone14.setColor("Red");

        Iphone.setPrice(1500.75);

        System.out.printf("The color of phone11 is %s%n", phone11.getColor());
        System.out.printf("The color of phone14 is %s%n", phone14.getColor());

        System.out.printf("The price of phone11 is $%.2f%n", phone11.getPrice());
        System.out.printf("The price of phone14 is $%.2f%n", phone14.getPrice());
    }
}
