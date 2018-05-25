/**
 * 
 */
package p1p2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Program that displays various information on heart rate readings
 * @author amcgowan v1.0
 * 
 */
public class HeartMonitor {

	/**
	 * Scanner used for user input.
	 */
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Constant for max heart rate
	 */
	private static final double MAX_RATE = 200;

	/**
	 * Constant for min heart rate
	 */
	private static final double MIN_RATE = 0;

	/**
	 * Stored rate readings. Note each row in this 2d array corresponds to each
	 * day's readings. There are four readings per day. There are four days data
	 * stored.
	 */
	private static double[][] rates = { { 60.3, 58.2, 60.3, 77.1, },
			{ 70.2, 71.8, 69.2, 58.2 }, { 70.6, 80.9, 60.2, 59.9 },
			{ 80.1, 72.3, 72.0, 70.1 } , { 80.1, 72.3, 72.0, 70.1 } };

	/**
	 * Start point for application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// try catch will catch any exceptions not already dealt with - enables
		// the program
		// to finish gracefully
		try {
			// create the menu
			drawMenu();
		} catch (Exception ex) {
			System.out.println("Problem quitting");
		}
		System.out.println("program over");

	}

	/**
	 * Draws the menu and handles first level options from user
	 */
	public static void drawMenu() {
		// the user's option var
		int option = 0;

		do {
			try {
				System.out.println("\n_________________________________");
				System.out.println("Heart rate recorder");
				System.out.println("\nMain menu _______________________");
				System.out.println("1. \tShow all ");
				System.out.println("2. \tShow minimim heart rate");
				System.out.println("3. \tShow maximum heart rate");
				System.out.println("4. \tAverage heart rate");
				System.out.println("5. \tUpdate daily records");
				System.out.println("6. \tQuit");

				System.out.println("Enter option ... ");
				option = scanner.nextInt();
				System.out.println(); // extra line

				// switching on the user's option
				switch (option) {
				case 1:
					displayAll();
					break;
				case 2:
					System.out.println("Min rate is : " + minValue());
					break;
				case 3:
					System.out.println("Max rate is : " + maxValue());
					break;
				case 4:
					System.out.printf("Average rate : %.2f \n", averageValue());
					break;
				case 5:
					int day = getDay();
					// off set required - arrays are indexed from zero
					day--;
					getAndSetUpdateValues(day);
					break;
				case 6:
					System.out.printf("Exiting Heart Rate Monitor Program \n");
					break;
				default:
					System.out.println("Don't know that one 1-6 please ");
				}
			} catch (Exception ex) {
				System.out.println("Sorry had a problem.");
				// resetting scanner
				scanner.nextLine();
			}
		} while (option != 6);
	}

	/**
	 * show all values in 2d array
	 */
	public static void displayAll() {
		System.out.println("Heart rates");
		// enables the day output value
		int offSet = 0;
		// now show each value
		for (int outer = 0; outer < rates.length; outer++) {
			++offSet;
			System.out.print("Day " + offSet + "\t");
			for (int inner = 0; inner < rates[outer].length; inner++) {
				System.out.print(rates[outer][inner] + " \t");
			}
			System.out.println();
		}
	}

	/**
	 * Show the min value
	 * 
	 * @return
	 */
	public static double minValue() {
		// setting to initail value in array
		double minValue = rates[0][0];

		// now go through and check the current min against the current value
		for (int outer = 0; outer < rates.length; outer++) {
			for (int inner = 0; inner < rates[outer].length; inner++) {
				if (rates[outer][inner] < minValue) {
					// found new min updating
					minValue = rates[outer][inner];
				}
			}
		}
		return minValue;
	}

	/**
	 * Show max value
	 * 
	 * @return
	 */
	public static double maxValue() {
		// assign the first to the max
		double maxValue = rates[0][0];

		for (int outer = 0; outer < rates.length; outer++) {
			for (int inner = 0; inner < rates[outer].length; inner++) {
				if (rates[outer][inner] > maxValue) {
					// found new max updating
					maxValue = rates[outer][inner];
				}
			}
		}
		return maxValue;
	}

	/**
	 * Calculate the average value
	 * 
	 * @return
	 */
	public static double averageValue() {
		double total = 0;
		int totalElements = 0;
		for (int outer = 0; outer < rates.length; outer++) {
			for (int inner = 0; inner < rates[outer].length; inner++) {
				// add this value to the current total
				total += rates[outer][inner];
				totalElements++;
			}
		}
		// return the total / the total number of elements
		return total / totalElements;
	}

	/**
	 * Gets the user's day to update. Note use of .length (for output and
	 * validation purposes. This enables the array to grow / shrink and this
	 * function to still work unaffected.
	 * 
	 * @return
	 */
	public static int getDay() {
		int option = 0;
		boolean inputOk = false;
		do {
			System.out.println("Enter day e.g. 1,2,3 etc (maximum value is :"
					+ rates.length + ")");
			inputOk=true;
			try {
				option = scanner.nextInt();
			} catch (InputMismatchException inputMismatchException){
				inputOk=false;
				scanner.nextLine();
			}
		} while ((option < 1 || option > rates.length) || (!inputOk));
		return option;
	}

	/**
	 * Reads each update value and updates to relevant index in the 2d array
	 * 
	 */
	public static void getAndSetUpdateValues(int day) {

		double newRate = 0;
		boolean inputOK = false;

		// got through the appropriate day readings
		for (int loop = 0; loop < rates[day].length; loop++) {

			// wrapped in a try catch to ensure sensible format input
			do {
				try {
					System.out.println("Enter update reading : ");
					newRate = scanner.nextDouble();
					// got here so have a number
					inputOK=true;
				} catch (InputMismatchException inputMismatchException) {
					System.out.println("numbers only please");
					scanner.nextLine();
					// got here so not a number
					inputOK=false;
				}
			} while (!inputOK);
			
			// now we have a number we'll validate for the range
			while ((newRate < MIN_RATE) || (newRate > MAX_RATE)) {
				System.out.println("Enter update reading (Range " + MIN_RATE
						+ " - " + MAX_RATE + ") : ");
				newRate = scanner.nextDouble();
			}
			// got here so we have a valid value - over-write the current
			// reading for the selected day
			rates[day][loop] = newRate;
		}
	}

}
