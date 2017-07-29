package arjun.hanabiandroid.game;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class DeckGenerator {
    private static final int[] RANK_COUNTS = new int[]{3, 2, 2, 2, 1};

    static Queue<Card> generateDeck(InitialState state) {
        // Create unshuffled deck
        ArrayList<Card> cards = new ArrayList<>();
        for (int i = RANK_COUNTS.length; i >= 0; i--) {
            for (Suit suit : Suit.values()) {
                if (suit != Suit.RAINBOW || state.hasRainbowSuit()) {
                    for (int j = RANK_COUNTS[i]; j >= 0; j--) {
                        cards.add(new Card(suit, i + 1));
                    }
                }
            }
        }

        //TODO: deterministically shuffle based on seed

        Queue<Card> deck = new LinkedList<>();
        deck.addAll(cards);
        return deck;
    }
}
