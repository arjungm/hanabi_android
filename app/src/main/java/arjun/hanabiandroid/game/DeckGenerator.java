package arjun.hanabiandroid.game;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import arjun.hanabiandroid.game.variants.GameVariant;

class DeckGenerator {
    private static final int[] RANK_COUNTS = new int[]{3, 2, 2, 2, 1};

    static Queue<Card> generateDeck(GameVariant variant, long seed) {
        // Create unshuffled deck
        ArrayList<Card> cards = new ArrayList<>();
        for (int i = RANK_COUNTS.length; i >= 0; i--) {
            for (Suit suit : variant.getSuits()) {
                for (int j = RANK_COUNTS[i]; j >= 0; j--) {
                    cards.add(new Card(suit, i + 1));
                }
            }
        }

        //TODO: deterministically shuffle based on seed

        Queue<Card> deck = new LinkedList<>();
        deck.addAll(cards);
        return deck;
    }
}
