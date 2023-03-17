/*separate game rules. it is associate with driver. this file regrading command pattern*/
public class Rules {

	public static void basicRule(int handSize) {
		handSize = DeckSingleton.hand.size();
		int lastElement = handSize - 1;
		int last4thElement = handSize - 4;
		if (DeckSingleton.hand.get(lastElement).value == DeckSingleton.hand.get(last4thElement).value) {
			DeckSingleton.hand.subList(last4thElement, handSize).clear();
			System.out.println("remove last four cards");
			System.out.println("after remove 4 cards, the left hand in your hand is:");
			DeckSingleton.printHand();
			System.out.println();
		} else if (DeckSingleton.hand.get(lastElement).suit == DeckSingleton.hand.get(last4thElement).suit) {
			DeckSingleton.hand.subList(handSize-3, handSize-1).clear();
			System.out.println("remove last 2th and last 3th card");
			System.out.println("after remove 2 cards, the left hand in your hand is:");
			DeckSingleton.printHand();
			System.out.println();
		} else {
			System.out.println("no cards need to remove");
			System.out.println();
		}
	}

	public static void IntermediateRule(int hand_sizeI) {
		hand_sizeI = DeckSingleton.hand.size();
		int last_element = hand_sizeI - 1;
		int last_2thelement = hand_sizeI - 2;
		int last_3thelement = hand_sizeI - 3;
		int last_4thelement = hand_sizeI - 4;
		if (DeckSingleton.hand.get(last_element).value == DeckSingleton.hand.get(last_2thelement).value)
		{
			DeckSingleton.hand.subList(last_2thelement, hand_sizeI).clear();
			System.out.println("remove last 2 cards");
			System.out.println("after remove 2 cards, the left hand in your hand is:");
			DeckSingleton.printHand();
			System.out.println();
		}
		else if (DeckSingleton.hand.get(last_2thelement).value == DeckSingleton.hand.get(last_3thelement).value)
		{
			DeckSingleton.hand.subList(last_3thelement, last_element).clear();
			System.out.println("remove last 2th and last 3th cards");
			System.out.println("after remove last 2th and last 3th cards, the left hand in your hand is:");
			DeckSingleton.printHand();
			System.out.println();
		}
		else if (DeckSingleton.hand.get(last_3thelement).value == DeckSingleton.hand.get(last_4thelement).value)
		{
			DeckSingleton.hand.subList(last_4thelement, last_2thelement).clear();
			System.out.println("remove last fourth and last third cards");
			System.out.println("after remove last fourth and last third cards, the left hand in your hand is:");
			DeckSingleton.printHand();
			System.out.println();
		}
		else if (DeckSingleton.hand.get(last_element).value == DeckSingleton.hand.get(last_4thelement).value)
		{
			DeckSingleton.hand.subList(last_4thelement, hand_sizeI).clear();
			System.out.println("remove last four cards");
			System.out.println("after remove 4 cards, the left hand in your hand is:");
			DeckSingleton.printHand();
			System.out.println();
		}
		else if (DeckSingleton.hand.get(last_element).suit == DeckSingleton.hand.get(last_4thelement).suit)
		{
			DeckSingleton.hand.subList(last_3thelement, last_element).clear();
			System.out.println("remove last 2th and last 3th card (middle two cards)");
			System.out.println("after remove 2 cards, the left hand in your hand is:");
			DeckSingleton.printHand();
			System.out.println();
		}
		else
		{
			System.out.println("no cards need to remove");
			System.out.println();
		}

	}

	public static void houseRule(int hand_sizeR) {
		hand_sizeR = DeckSingleton.hand.size();
		int last_element = hand_sizeR - 1;
		int last_2thelement = hand_sizeR - 2;
		int last_3thelement = hand_sizeR - 3;
		int last_4thelement = hand_sizeR - 4;
		if (DeckSingleton.hand.get(last_element).suit == DeckSingleton.hand.get(last_4thelement).suit && DeckSingleton.hand.get(last_element).value == DeckSingleton.hand.get(last_2thelement).value) {
			DeckSingleton.hand.subList(last_3thelement, hand_sizeR).clear();
			System.out.println("remove last 3 cards");
			System.out.println("after remove 3 cards, the left hand in your hand is ");
			DeckSingleton.printHand();
			System.out.println();
		} else if (DeckSingleton.hand.get(last_element).suit == DeckSingleton.hand.get(last_4thelement).suit && DeckSingleton.hand.get(last_2thelement).value == DeckSingleton.hand.get(last_3thelement).value) {
			DeckSingleton.hand.subList(last_3thelement, hand_sizeR).clear();
			System.out.println("remove last 3 cards");
			System.out.println("after remove 3 cards, the left hand in your hand is ");
			DeckSingleton.printHand();
			System.out.println();
		} else if (DeckSingleton.hand.get(last_element).suit == DeckSingleton.hand.get(last_4thelement).suit && DeckSingleton.hand.get(last_3thelement).value == DeckSingleton.hand.get(last_4thelement).value) {
			DeckSingleton.hand.subList(last_4thelement, hand_sizeR).clear();
			System.out.println("remove first 3 cards");
			System.out.println("after remove 3 cards, the left hand in your hand is ");
			DeckSingleton.printHand();
			System.out.println();
		} else if (DeckSingleton.hand.get(last_element).value == DeckSingleton.hand.get(last_2thelement).value) {
			DeckSingleton.hand.subList(last_2thelement, hand_sizeR).clear();
			System.out.println("remove last 2 cards");
			System.out.println("after remove 2 cards, the left hand in your hand is ");
			DeckSingleton.printHand();
			System.out.println();
		} else if (DeckSingleton.hand.get(last_2thelement).value == DeckSingleton.hand.get(last_3thelement).value) {
			DeckSingleton.hand.subList(last_3thelement, last_element).clear();
			System.out.println("remove last 2th and last 3th cards");
			System.out.println("after remove last 2th and last 3th cards, the left hand in your hand is ");
			DeckSingleton.printHand();
			System.out.println();
		} else if (DeckSingleton.hand.get(last_3thelement).value == DeckSingleton.hand.get(last_4thelement).value) {
			DeckSingleton.hand.subList(last_4thelement, last_2thelement).clear();
			System.out.println("remove last fourth and last third cards");
			System.out.println("after remove last fourth and last third cards, the left hand in your hand is ");
			DeckSingleton.printHand();
			System.out.println();
		} else if (DeckSingleton.hand.get(last_element).value == DeckSingleton.hand.get(last_4thelement).value) {
			DeckSingleton.hand.subList(last_4thelement,hand_sizeR).clear();
			System.out.println("remove last four cards");
			System.out.println("after remove 4 cards, the left hand in your hand is ");
			DeckSingleton.printHand();
			System.out.println();
		} else if (DeckSingleton.hand.get(last_element).suit == DeckSingleton.hand.get(last_4thelement).suit)
		{
			DeckSingleton.hand.subList(last_3thelement, last_element).clear();
			System.out.println("remove last 2th and last 3th card (middle two cards)");
			System.out.println("after remove 2 cards, the left hand in your hand is:");
			DeckSingleton.printHand();
			System.out.println();
		} else {
			System.out.println("no cards need to remove");
			System.out.println();
		}
	}

}

