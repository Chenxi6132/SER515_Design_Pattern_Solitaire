/*This java file is doing factory design pattern. This file create rank and suit, and convert suit and rank to string */
public class CardFactory {

	public enum Suit {
		SPADES,
		HEARTS,
		DIAMONDS,
		CLUBS
	}
	Suit suit;

	int value;

	String valueOfName;

	public static String fullName;

	public CardFactory(Suit suit, int value) {
		this.suit = suit;
		this.value = value;
		this.valueOfName = valueToString(value);
		this.fullName = valueOfName + " " + suitToString(suit);
	}

	private String suitToString(Suit suit) {
		switch (suit) {
			case SPADES:
				return "Spades";
			case HEARTS:
				return "Hearts";
			case DIAMONDS:
				return "Diamonds";
			case CLUBS:
				return "Clubs";
			default:
				return " ";
		}
	}

	private String valueToString(int value) {
		switch (value) {
			case 11:
				return "Jack";
			case 12:
				return "Queen";
			case 13:
				return "King";
			case 14:
				return "Ace";
			default:
				return String.valueOf(value);
		}
	}

}
