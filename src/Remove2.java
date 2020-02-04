import java.util.ArrayList;

public class Remove2 {

	static void Task(ArrayList<String> stringList, ArrayList<Boolean> booleanList) {

		// Remove Task
		do {
			int listNum = 0;
			System.out.println("   ----------------------------");
			System.out.println("  |       Remove a task:       |");
			System.out.println("   ----------------------------");
			System.out.println("--------------------------------------------------");
			System.out.println("              Listing all tasks:                  ");
			System.out.println("");
			for (String listItem : stringList) {
				if (booleanList.get(listNum) == true) {
					System.out.println(listNum + 1 + ". " + listItem + " (Completed)");
				} else {
					System.out.println(listNum + 1 + ". " + listItem);
				}
				listNum += 1;
			}
			System.out.println("--------------------------------------------------");
			System.out.print(" What would you like to remove? (0) to exit: ");

			// Get Choice
			int userChoice = Choice.Int(stringList, booleanList);

			if (userChoice == 0) {
				// Return to Menu
				System.out.println("");
				Menu.Print(stringList, booleanList);

			} else {

				// Add task to list
				stringList.remove(userChoice - 1);
				booleanList.remove(userChoice - 1);

				System.out.println("");
				System.out.println("   That tasks has been removed!");
				System.out.println("");
				// Return to Menu
			}
		} while (true);
	}
}
