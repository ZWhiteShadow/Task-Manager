import java.util.ArrayList;

public class List5 {

	static void Tasks(ArrayList<String> stringList, ArrayList<Boolean> booleanList) {
		String userChoice = "repeat";
		int page = 5;
		do {
			int numberOfItems = 0;
			if ((page - 5) < stringList.size()) {
				System.out.println("--------------------------------------------------");
				System.out.println("                     Tasks:                       ");
				System.out.println("");
				for (int listNum = (page - 5); listNum <= page - 1; listNum++) {
					if (listNum < stringList.size()) {
						if (booleanList.get(listNum) == true) {
							System.out.println(listNum + 1 + ". " + stringList.get(listNum) + " (Completed)");
						} else {
							System.out.println(listNum + 1 + ". " + stringList.get(listNum));
						}
						numberOfItems += 1;
					}
				}
			}

			// 5 items on list
			String endOfPage = "-" + page;

			// only one item on list
			if (page > stringList.size() && numberOfItems == 1) {
				endOfPage = "";

				// Less then 5 on the list
			} else if (page > stringList.size() && numberOfItems < 5) {
				endOfPage = "-" + stringList.size();
			}

			System.out.println("--------------------------------------------------");
			System.out.print("[" + (page - 5 + 1) + endOfPage + " of " + stringList.size()
					+ "] Type (B)ack, (F)orward, or (M)enu: ");
			// Get Choice
			userChoice = Choice.String(stringList, booleanList);
			System.out.println("");
			System.out.println("");

			// Check choices
			if (userChoice.equalsIgnoreCase("b")) {
				if (page != 5) {
					page -= 5;
				} else {
					System.out.println("");
					System.out.println("You can't go back your at the start.");
				}

			} else if (userChoice.equalsIgnoreCase("f")) {
				if (page < stringList.size()) {
					page += 5;
				} else {
					System.out.println("");
					System.out.println("You can't go forward your at the end.");
				}
			} else if (userChoice.equalsIgnoreCase("m")) {
				System.out.println("Going back to main menu.");
			} else {
				System.out.println("That is not an option try again.");
			}

			// loop until user selects menu
		} while (!userChoice.equalsIgnoreCase("m"));

		// Return to Menu
		Menu.Print(stringList, booleanList);
	}
}
