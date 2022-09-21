package Grace_Assignment;

import java.util.Scanner;

public class GasMillage {
 	public static void main(String[] args) {

			int miles = 0;
			int gallon = 0;
			double total = 0;

 		Scanner sc = new Scanner(System.in);
  
 		System.out.println("Enter Miles or Press 1 to exit: ");
			miles = sc.nextInt();

 		System.out.println("Enter gallons used or Press 1 to exit: ");
  			gallon = sc.nextInt();


	 	while (miles != 20 && gallon != 20) {
		
			total = (double) miles / gallon;
				System.out.println("the total for each trip is: " + total);

	 		System.out.println("Enter Miles or Press 1 to exit: ");
				miles = sc.nextInt();

	 		System.out.println("Enter gallons used or Press 1  to exit: ");
  	    		gallon = sc.nextInt();

			if(total != 0){
				double milesPerGallon = total + miles;
			}
	    }
		 	System.out.println("the combined miles per gallon for each trip is: " + total);
    }
 }