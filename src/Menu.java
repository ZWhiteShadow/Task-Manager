//This "should" be idiot proof. Used Try and catch and error messages to try to accomplish this
//Originally I used Arrays instead of Lists and found I had trouble adding and removing so i changed

import java.util.ArrayList;

public class Menu {

	public static void Print(ArrayList<String> stringList, ArrayList<Boolean> booleanList) {
		int userChoice;
		Boolean repeat = false;

		do {
			System.out.println("");
			System.out.println(" There is a glitch in the matrix.");
			System.out.println("!You may have to hit enter twice!");
			System.out.println("   ----------------------------");
			System.out.println("  |  To-do List / Main Menu:   |");
			System.out.println("  |                            |");
			System.out.println("  | (1). Add tasks             |");
			System.out.println("  | (2). Remove tasks          |");
			System.out.println("  | (3). Mark tasks complete   |");
			System.out.println("  | (4). Unmark ascompleted    |");
			System.out.println("  | (5). List the tasks        |");
			System.out.println("   ---------------------------- ");
			System.out.print("    What would you like to do? ");
			// Get Choice
			userChoice = Choice.Int(stringList, booleanList);
			System.out.println("");
			if (userChoice > 5 || userChoice < 1) {
				repeat = true;
				System.out.println("   That is not a valid choice.\n        Please choice 1-5");
			}

		} while (repeat);

		// Now If else for choices
		switch (userChoice) {
		case 1:
			// Option 1 Add Task
			Add1.Task(stringList, booleanList);
			break;
		case 2:
			// Option 2 Remove Task
			Remove2.Task(stringList, booleanList);
		case 3:
			// Option 3 Complete Task
			Complete3.Task(stringList, booleanList, true);
		case 4:
			// Option 4 (un)complete Task
			Complete3.Task(stringList, booleanList, false);
		case 5:
			// Option 5 List Task
			List5.Tasks(stringList, booleanList);
			break;
		default:
			System.out.println("That is not an option!");
			Menu.Print(stringList, booleanList);
		}

	}

}
