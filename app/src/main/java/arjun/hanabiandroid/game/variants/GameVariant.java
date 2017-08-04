package arjun.hanabiandroid.game.variants;

import java.util.ArrayList;

import arjun.hanabiandroid.DebugUtil;
import arjun.hanabiandroid.game.Card;
import arjun.hanabiandroid.game.CardInHand;
import arjun.hanabiandroid.game.Deck;
import arjun.hanabiandroid.game.Move;
import arjun.hanabiandroid.game.Suit;

public abstract class GameVariant {
    public static final int VARIANT_REGULAR = 0;
    public static final int VARIANT_RAINBOW_REGULAR = 1;
    public static final int VARIANT_RAINBOW_WILDCARD = 2;

    private static final int[] RANK_COUNTS = new int[]{3, 2, 2, 2, 1};

    public static final GameVariant variantForInt(int variant) {
        switch (variant) {
            case VARIANT_REGULAR:
                return new Regular();
            case VARIANT_RAINBOW_REGULAR:
                return new RainbowRegular();
            case VARIANT_RAINBOW_WILDCARD:
                return new RainbowWildcard();
        }
        DebugUtil.logException(new IllegalStateException("Unknown game variant"), variant);
        return null;
    }

    public abstract Suit[] getSuits();

    public abstract void applyHint(CardInHand card, Move move);

    /**
     * Create an unshuffled deck
     *
     * @return An unshuffled deck of this variant
     */
    public Deck generateVanillaDeck() {
        ArrayList<Card> deck = new ArrayList<>();
        for (int i = RANK_COUNTS.length; i >= 0; i--) {
            for (Suit suit : getSuits()) {
                for (int j = RANK_COUNTS[i]; j >= 0; j--) {
                    deck.add(new Card(suit, i + 1));
                }
            }
        }

        Card[] cards = new Card[deck.size()];
        deck.toArray(cards);
        return new Deck(cards);
    }
}
