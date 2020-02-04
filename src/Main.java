import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// create start list
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("Finish Final!");

		stringList.add("Do homework");
		stringList.add("Read programing blog");
		stringList.add("Spend time with family");
		stringList.add("Watch the new season of a cool new show");

		stringList.add("Learn Something New.");
		stringList.add("Eat Healthier and Diet.");
		stringList.add("Get Out of Debt and Save Money.");
		stringList.add("Travel to New Places.");

		stringList.add("Be Less Stressed.");
		stringList.add("Volunteer.");
		stringList.add("Lose weight/diet.");
		stringList.add("Go to the gym.");

		stringList.add("Be happier/better mental health.");
		stringList.add("Be a better person.");
		stringList.add("Upgrade my technology.");
		stringList.add("Staying motivated.");

		// None are complete
		ArrayList<Boolean> booleanList = new ArrayList<Boolean>();
		booleanList.add(true); // Final is done!

		booleanList.add(false);
		booleanList.add(false);
		booleanList.add(false);
		booleanList.add(false);

		booleanList.add(false);
		booleanList.add(false);
		booleanList.add(false);
		booleanList.add(false);

		booleanList.add(false);
		booleanList.add(false);
		booleanList.add(false);
		booleanList.add(false);

		booleanList.add(false);
		booleanList.add(false);
		booleanList.add(false);
		booleanList.add(false);

		// Display Initial Menu
		Menu.Print(stringList, booleanList);
	}
}
