import java.util.ArrayList;

public class Add1 {

	static void Task(ArrayList<String> stringList, ArrayList<Boolean> booleanList) {
		// Add Task
		do {
			System.out.println("   ----------------------------");
			System.out.println("  |          Add a task:       |");
			System.out.println("   ----------------------------");
			System.out.println("   What would you like to add? ");
			System.out.println("           (0) to exit!        ");
			System.out.println("");
			System.out.print("  : ");
			// Get Choice
			String userChoice = Choice.String(stringList, booleanList);

			if (userChoice.equals("0")) {
				// Return to Menu
				System.out.println("");
				Menu.Print(stringList, booleanList);

			} else if (userChoice.equals("")) {
				System.out.println("");
				System.out.println("That is not a valid choice.");
			} else if (userChoice.length() > 50) {
				System.out.println("");
				System.out.println("That is too long!");
			} else {

				// Add task to list
				stringList.add(0, userChoice);
				booleanList.add(0, false);

				System.out.println("");
				System.out.println("   That tasks has been added!");
				System.out.println("");
			}

		} while (true);
	}
}
