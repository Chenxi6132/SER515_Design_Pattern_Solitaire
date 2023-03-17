/*This file is implement observer design pattern. for example for deal card functions, it displays how many cards added  */
/*this file also call rules class. rules class will inform Which card removed */
/*the main purpose of this class is show details to player for each move of the game */
public class Driver {
	public static void dealCardBasic() {
		int hand_size = DeckSingleton.hand.size();
		System.out.println("draw 4 cards first");
		for (int x = 0; x < 4; x++)
		{
			DeckSingleton.hand.add(DeckSingleton.cards.get(x));
			DeckSingleton.cards.remove(DeckSingleton.cards.size() - 1);
		}

		DeckSingleton.printHand();
		System.out.println();

		Rules.basicRule(hand_size);
		hand_size = DeckSingleton.hand.size();

		for (int i = 47; i > -1; i = i)
		{
			if (hand_size < 4)
			{
				for (int j = hand_size; j <4; j++)
				{
					DeckSingleton.hand.add(DeckSingleton.cards.get(i));
					DeckSingleton.cards.remove(DeckSingleton.cards.size()-1);
					System.out.println("after draw the hand size is " + DeckSingleton.hand.size());
					i--;
				}
				System.out.println("after draw " + (4 - hand_size) + "cards, the cards on your hand is ");
			}
			else if (hand_size>=4)
			{
				DeckSingleton.hand.add(DeckSingleton.cards.get(i));
				DeckSingleton.cards.remove(DeckSingleton.cards.size() - 1);
				i--;
				System.out.println("after draw one card, the cards on your hand is ");

			}
			DeckSingleton.printHand();
			System.out.println();
			Rules.basicRule(hand_size);
			hand_size=DeckSingleton.hand.size();
		}
	}

	public static void dealCardIntermediate() {
		int hand_size = DeckSingleton.hand.size();
		System.out.println("draw 4 cards first");
		for (int x = 0; x < 4; x++) {
			DeckSingleton.hand.add(DeckSingleton.cards.get(x));
			DeckSingleton.cards.remove(DeckSingleton.cards.size() - 1);
		}
		DeckSingleton.printHand();
		System.out.println();

		Rules.IntermediateRule(hand_size);
		hand_size = DeckSingleton.hand.size();

		for (int i = 47; i > -1; i=i)
		{
			if (hand_size < 4)
			{
				for (int j = hand_size; j < 4; j++)
				{
					DeckSingleton.hand.add(DeckSingleton.cards.get(i));
					DeckSingleton.cards.remove(DeckSingleton.cards.size() - 1);
					i--;
				}
				System.out.println("after draw " + (4 - hand_size) + " cards, the cards on your hand is ");
			}
			else
			{
				DeckSingleton.hand.add(DeckSingleton.cards.get(i));
				DeckSingleton.cards.remove(DeckSingleton.cards.size() - 1);
				i--;
				System.out.println("after draw one card, the cards on your hand is ");

			}
			DeckSingleton.printHand();
			System.out.println();
			Rules.IntermediateRule(hand_size);
			hand_size=DeckSingleton.hand.size();
		}
	}

	public static void dealCardHouseRule() {
		int hand_size = DeckSingleton.hand.size();
		System.out.println("draw 4 cards first");
		for (int x = 0; x < 4; x++) {
			DeckSingleton.hand.add(DeckSingleton.cards.get(x));
			DeckSingleton.cards.remove(DeckSingleton.cards.size() - 1);
		}
		DeckSingleton.printHand();
		System.out.println();
		Rules.houseRule(hand_size);
		hand_size = DeckSingleton.hand.size();

		for (int i = 47; i > -1; i = i)
		{
			if (hand_size < 4)
			{
				for (int j = hand_size; j < 4; j++)
				{
					DeckSingleton.hand.add(DeckSingleton.cards.get(i));
					DeckSingleton.cards.remove(DeckSingleton.cards.size() - 1);
					i--;
				}
				System.out.println("after draw " + (4 - hand_size) + "cards, the cards on your hand is ");
			}
			else
			{
				DeckSingleton.hand.add(DeckSingleton.cards.get(i));
				DeckSingleton.cards.remove(DeckSingleton.cards.size() - 1);
				i--;
				System.out.println("after draw one card, the cards on your hand is ");
			}
			DeckSingleton.printHand();
			System.out.println();
			Rules.houseRule(hand_size);
			hand_size=DeckSingleton.hand.size();
		}
	}

	public static void Result(int sizeofHand) {
		if (sizeofHand == 0)
		{
			System.out.println("Super Win");
		}
		else if (sizeofHand <= 4)
		{
			System.out.println("You win");
		}
		else
		{
			System.out.println("You loose, game over !!!");
			System.out.println("Please enter 'q' for quit");
		}
	}

	public static void lastStepBasic() {
		int sizeofHand = DeckSingleton.hand.size();
		for (int i = 0; i < sizeofHand; i++) {
			DeckSingleton.hand.add(DeckSingleton.hand.get(0));
			DeckSingleton.hand.remove(0);
			int countCards_O = DeckSingleton.hand.size();
			Rules.basicRule(countCards_O);
			int CountCards_N = DeckSingleton.hand.size();
			if (countCards_O != CountCards_N) {
				i = 0;
				sizeofHand = DeckSingleton.hand.size();
			}
		}

		System.out.println("No more steps can move.");
		int result = DeckSingleton.hand.size();

		Result(result);
	}

	public static void lastStepIntermediate() {
		int sizeofHand = DeckSingleton.hand.size();
		int count = 2;
		for (int i = 0; i < sizeofHand; i++) {
			DeckSingleton.hand.add(DeckSingleton.hand.get(0));
			DeckSingleton.hand.remove(0);
			int countCards_O = DeckSingleton.hand.size();
			Rules.IntermediateRule(countCards_O);
			int CountCards_N = DeckSingleton.hand.size();
			if (countCards_O != CountCards_N) {
				i = 0;
				sizeofHand = DeckSingleton.hand.size();
			}
		}

		System.out.println("No more steps can move.");
		int result = DeckSingleton.hand.size();

		Result(result);
	}

	public static void lastStepHouseRule() {
		int sizeofHand = DeckSingleton.hand.size();
		int count = 2;
		for (int i = 0; i < sizeofHand; i++) {
			DeckSingleton.hand.add(DeckSingleton.hand.get(0));
			DeckSingleton.hand.remove(0);
			int countCards_O = DeckSingleton.hand.size();
			Rules.houseRule(countCards_O);
			int CountCards_N = DeckSingleton.hand.size();
			if (countCards_O != CountCards_N) {
				i = 0;
				sizeofHand = DeckSingleton.hand.size();
			}
		}

		System.out.println("No more steps can move.");
		int result = DeckSingleton.hand.size();

		Result(result);
	}

}
