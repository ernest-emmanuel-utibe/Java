package Chapter4;

//		 Drivers are concerned with the mileage their automobiles get. One driver has
//		kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
//		a Java application that will input the miles driven and gallons used (both as integers) for each trip.
//		The program should calculate and display the miles per gallon obtained for each trip and print the
//		combined miles per gallon obtained for all trips up to this point. All averaging calculations should
//		produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
//		from the user.





import java.util.Scanner;

public class GasMillage {
 	public static void main(String[] args) {

		 	// Create instance variable
			int miles = 0;
			int gallon = 0;
			double total = 0;

		// Create Scanner object
 		Scanner sc = new Scanner(System.in);

		 // Prompt the user to enter the number
 		System.out.println("Enter Miles or Press 1 to exit: ");
			miles = sc.nextInt();

		// Prompt the user to enter the number of gallons used
 		System.out.println("Enter gallons used or Press 1 to exit: ");
  			gallon = sc.nextInt();

		// Using the while loop
	 	while (miles != 20 && gallon != 20) {
		
			total = (double) miles / gallon;
				System.out.println("the total for each trip is: " + total);

			// prompt user to enter the miles or press 1 to exit
	 		System.out.println("Enter Miles or Press 1 to exit: ");
				miles = sc.nextInt();

			// Prompt user to enter the gallons used or press 1 to exit
	 		System.out.println("Enter gallons used or Press 1  to exit: ");
  	    		gallon = sc.nextInt();

			if(total != 0){
				double milesPerGallon = total + miles;
			}
	    }
		 	System.out.println("the combined miles per gallon for each trip is: " + total);
    }
 }