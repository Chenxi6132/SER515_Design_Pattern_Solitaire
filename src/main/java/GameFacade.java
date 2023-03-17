/*this java file implement facade design pattern */
import java.util.Scanner;
public class GameFacade {

	public static void main(String[] args) {
		DeckSingleton deck = new DeckSingleton();
		deck.printDeck();
		System.out.println("card initialized\n\n");

		Scanner scanner = new Scanner(System.in);
		char choice;
		int rule_choice;

		System.out.println("a. shuffle");
		System.out.println("b. play ");
		System.out.println("q. quit.\n");

		do {
			System.out.println("please enter your choice:");
			choice = scanner.next().charAt(0);
			switch (choice) {
				case 'a':
					DeckSingleton.shuffle();
					System.out.println("cards shuffled\n");
					break;

				case 'b':
					System.out.println("please select rule to play:");
					System.out.println("1. Basic (1st & 4th same Suit --> remove middle two, 1st & 4th same rank --> remove all 4)");
					System.out.println("2. Intermediate --> neighbors are same rank --> remove pair!");
					System.out.println("3. House Rules --> (1st & 4th same Suit AND 3rd & 4th same rank --> remove last 3)");
					System.out.println("Please enter a number for selecting rules:");
					rule_choice = scanner.nextInt();

					if (rule_choice == 1) {
						Driver.dealCardBasic();
						Driver.lastStepBasic();
					} else if (rule_choice == 2) {
						Driver.dealCardIntermediate();
						Driver.lastStepIntermediate();
					} else if (rule_choice == 3) {
						Driver.dealCardHouseRule();
						Driver.lastStepHouseRule();
					}
					break;

				case 'i':
					DeckSingleton.cards.clear();
					DeckSingleton deck2 = new DeckSingleton();
					deck2.printDeck();
					System.out.println("card initialized\n\n");
					DeckSingleton.hand.clear();
					System.out.println("a. shuffle");
					System.out.println("b. play ");
					System.out.println("q. quit.\n");
					break;

				default:
					System.out.println("please enter a valid option\n");
					break;
			}
		} while (choice != 'q');
		System.out.println("exit\n");
		scanner.close();

	}

}
