package arjun.hanabiandroid.game.variants;


import arjun.hanabiandroid.game.CardInHand;
import arjun.hanabiandroid.game.Move;
import arjun.hanabiandroid.game.Suit;

class RainbowWildcard extends GameVariant {
    private static final Suit[] SUITS = new Suit[]{
            Suit.RED,
            Suit.WHITE,
            Suit.BLUE,
            Suit.GREEN,
            Suit.YELLOW,
            Suit.RAINBOW
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
        if (card.card.suit == Suit.RAINBOW) {
            if (card.possibleSuit == null) {
                card.possibleSuit = Suit.values()[move.hintedSuit];
            } else if (card.possibleSuit.ordinal() != move.hintedSuit) {
                card.suitKnown = true;
            }
        } else if (card.card.suit.ordinal() == move.hintedSuit) {
            card.suitKnown = true;
        }
    }
}