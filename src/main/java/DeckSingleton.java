/*This file apply the singleton design pattern*/
import java.util.Collections;
import java.util.Vector;

public class DeckSingleton {

	public static Vector<CardFactory> cards = new Vector<CardFactory>();
	public static Vector<CardFactory> hand = new Vector<CardFactory>();

	private static DeckSingleton instance = new DeckSingleton();

	DeckSingleton(){fillDeck();}

	public static DeckSingleton getInstance() {
		return instance;
	}

	public static void fillDeck() {
		for (int i = 2; i <= 14; i++) {
			CardFactory addCard = new CardFactory(CardFactory.Suit.SPADES, i);
			cards.add(addCard);
			addCard = new CardFactory(CardFactory.Suit.HEARTS, i);
			cards.add(addCard);
			addCard = new CardFactory(CardFactory.Suit.DIAMONDS, i);
			cards.add(addCard);
			addCard = new CardFactory(CardFactory.Suit.CLUBS, i);
			cards.add(addCard);
		}
	}

	public static void printDeck() {
		for(CardFactory card:cards)
		{
			System.out.println(card.valueOfName + " "+ card.suit);
		}
	}

	public static void shuffle() {
		Collections.shuffle(cards);
	}

	public static void printHand() {
		for (CardFactory card : hand) {
			System.out.println(card.valueOfName + " "+ card.suit);
		}
	}

}
