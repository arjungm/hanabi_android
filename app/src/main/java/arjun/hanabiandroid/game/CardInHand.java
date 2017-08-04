package arjun.hanabiandroid.game;

public class CardInHand {
    public final Card card;
    public boolean rankKnown;
    public boolean suitKnown;
    public Suit possibleSuit;      // for rainbow suit, it may be hinted as any other suit

    CardInHand(Card card) {
        this.card = card;
    }
}
