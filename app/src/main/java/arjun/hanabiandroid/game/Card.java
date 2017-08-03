package arjun.hanabiandroid.game;

public class Card {
    public final Suit suit;
    public final int rank;

    Card(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return suit.stringRepresentation + ", " + rank;
    }
}
