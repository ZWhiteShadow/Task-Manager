import java.util.ArrayList;

public class Complete3 {

	static void Task(ArrayList<String> stringList, ArrayList<Boolean> booleanList, Boolean completed) {

		boolean repeat = true;
		int menuOption = 0;

		do {
			int newListNum = 0; // Number label for uncompleted items
			int booleanListNum = 0; // Place in true/false array

			// Counter number of list items
			for (@SuppressWarnings("unused")
			String listItem : stringList) {
				if (booleanList.get(booleanListNum) == completed) {
					booleanListNum += 1;
					continue; // Skips items that are completed/uncompleted depending
				}
				newListNum += 1; // Add to the new number every time the task is not complete
				booleanListNum += 1;
			}

			// If zero tasks exit Complete/uncomplete menu go back to main menu
			if (newListNum == 0) {
				System.out.println("");

				if (completed) {
					System.out.print("All your tasks are now complete!");
				} else {
					System.out.print("There is nothing left completed!");
				}

				System.out.println("");
				// Return to Menu
				Menu.Print(stringList, booleanList);
			}

			// If doesn't equal zero then list tasks
			System.out.println("--------------------------------------------------");

			// Message for tasks that are NOT complete
			if (completed) {

				// Multiple items
				if (newListNum > 1) {
					System.out.println("These tasks are NOT complete:");
					// Single Item
				} else {
					System.out.println("This task is NOT complete:");
				}

				// Message for tasks that ARE complete
			} else {

				// Multiple Items
				if (newListNum > 1) {
					System.out.println("These tasks are marked as complete:");
					// Single Item
				} else {
					System.out.println("This task is marked as complete:");
				}
			}

			// Reset values
			newListNum = 0;
			booleanListNum = 0;

			System.out.println("");
			for (String listItem : stringList) {
				if (booleanList.get(booleanListNum) == completed) {
					booleanListNum += 1;
					continue; // Skips items that are completed/uncompleted depending
				}
				newListNum += 1; // Add to the new number every time the task is not complete
				booleanListNum += 1; // Go to the next true/false in the completed array

				System.out.println(newListNum + ". " + listItem);
			}
			System.out.println("--------------------------------------------------");

			// Ask which task they would like to complete

			if (completed) {

				// Multiple items
				if (newListNum > 1) {
					System.out.print("Which do you want to complete? Type (0) to exit: ");
					// Single Item
				} else {
					System.out.print("Type (1) to complete this task or (0) to exit: ");
				}

				// Message for tasks that ARE complete
			} else {

				// Multiple Items
				if (newListNum > 1) {
					System.out.print("Which do you want to nmark? Type (0) to exit: ");
					// Single Item
				} else {
					System.out.print("Type (1) to unmark this task or (0) to exit: ");
				}
			}

			menuOption = Choice.Int(stringList, booleanList);

			// First find out which index of the array is the choice

			int indexCounter = 0;
			int counter = 0;

			for (Boolean index : booleanList) {
				if (index == !completed) {
					counter += 1; // count number of complete/uncomplete depending
					indexCounter += 1; // goto next array spot
					if (counter == menuOption) {
						break;
					}
				} else {
					indexCounter += 1;// goto next array spot
				}
			}

			// Save results of choice
			try {
				if (menuOption != 0) {

					if (menuOption > newListNum || menuOption < 1) {
						throw new Exception();
					}

					booleanList.set(indexCounter - 1, completed); // change index to completed
					System.out.println("");
					System.out.print("\"" + stringList.get(indexCounter - 1) + "\"");

					if (completed) {
						System.out.println(" is now completed!");
					} else {
						System.out.println(" is back on your to-do list!");
					}

					System.out.println("");
				} else {

					repeat = false;
				}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("That is not a valid option try again: ");
				repeat = true;
			}

		} while (repeat);

		// Return to Menu
		Menu.Print(stringList, booleanList);

	}

}
