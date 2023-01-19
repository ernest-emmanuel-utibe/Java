package tdd.CarApplicationTest;

import Chapter3.Car;

public class CarApplicationTest {
  public static void main(String[] args) {
      Car car1 = new Car("Benz", "2025", 230.1);

      Car car2 = new Car("Lexus", "2022", 500.1);

      System.out.println("Before discount: " + car1.getPrice());
      System.out.println("Before discount: " + car2.getPrice());

      car1.setDiscount(5);
	  car2.setDiscount(7);

	  System.out.println("After discount: " + car1.getPrice());
	  System.out.println("After discount: " + car2.getPrice());

   }
}
