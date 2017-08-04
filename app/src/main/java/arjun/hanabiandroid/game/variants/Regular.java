package arjun.hanabiandroid.game.variants;


import arjun.hanabiandroid.game.CardInHand;
import arjun.hanabiandroid.game.Move;
import arjun.hanabiandroid.game.Suit;

class Regular extends GameVariant {
    private static final Suit[] SUITS = new Suit[]{
            Suit.RED,
            Suit.WHITE,
            Suit.BLUE,
            Suit.GREEN,
            Suit.YELLOW,
    };

    @Override
    public Suit[] getSuits() {
        return SUITS;
    }

    @Override
    public void applyHint(CardInHand card, Move move) {
        if (card.card.rank == move.hintedRank) {
            card.rankKnown = true;
        }
        if (card.card.suit.ordinal() == move.hintedSuit) {
            card.suitKnown = true;
        }
    }
}
