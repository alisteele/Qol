package p1p2;

import java.util.Random;
import java.util.Scanner;

/**
 * Class to represent a college grade book with exam results
 * 
 * @author amcgowan
 *
 */
public class GradeBookToDev {

	/**
	 * Scanner used for user input.
	 */
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Constant to represent the number of students
	 */
	private static final int NO_STUDENTS = 10;

	/**
	 * Constant to represent the number of assessments
	 */
	private static final int NO_OF_ASSESSMENTS = 3;

	/**
	 * Stored grade readings. Note each row in this 2d array corresponds to each
	 * student's scores.
	 */
	private static int[][] grades;

	public static void main(String[] args) {

		try {
			// initialise the array
			grades = new int[NO_STUDENTS][NO_OF_ASSESSMENTS];
			populateScores();
			showMenu();
		} catch (Exception ex) {
			System.out.println("opps");
		}
	}

	/**
	 * Method populates the grades table with random numbers
	 */
	public static void populateScores() {
		Random random = new Random();
		for (int outer = 0; outer < grades.length; outer++) {
			for (int inner = 0; inner < grades[outer].length; inner++) {
				// generate random number 0.100
				grades[outer][inner] = random.nextInt(101);
			}
		}
	}

	/**
	 * 
	 */
	public static void showMenu() {
		
		
	}

	/**
	 * comments here...
	 */
}