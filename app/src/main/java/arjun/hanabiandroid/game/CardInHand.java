package arjun.hanabiandroid.game;

public class CardInHand {
    final Card card;
    boolean rankKnown;
    boolean colorKnown;
    Suit possibleSuit;      // for rainbow suit, it may be hinted as any other suit

    CardInHand(Card card) {
        this.card = card;
    }
}
