import java.util.ArrayList;
import java.util.Scanner;

public class Choice {

	public static String String(ArrayList<String> stringList, ArrayList<Boolean> booleanList) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); // use try and catch to keep from errors

		// must be a String
		String scanned;
		try {
			scanned = scan.nextLine();
		} catch (Exception e) {
			System.out.println("That is not a valid input");
			System.out.println("Error returning to Main Menu!");
			System.out.println("");

			// Return to Menu
			Menu.Print(stringList, booleanList);
			scanned = "";
		}
		return scanned;
	}

	public static int Int(ArrayList<String> stringList, ArrayList<Boolean> booleanList) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); // use try and catch to keep from errors
		// must be a int
		int scanned;
		try {
			scanned = scan.nextInt();
		} catch (Exception e) {
			System.out.println("");
			System.out.println("You must enter a whole number");
			System.out.println("Error returning to Main Menu!");
			System.out.println("");

			// Return to Menu
			Menu.Print(stringList, booleanList);
			scanned = 0;
		}

		return scanned;
	}
}
