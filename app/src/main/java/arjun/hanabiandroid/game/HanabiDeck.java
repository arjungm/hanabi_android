package arjun.hanabiandroid.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by arjun on 7/2/17.
 */

public class HanabiDeck {
    ArrayList<Card> cards;

    HanabiDeck(int randomSeed)
    {
        cards = new ArrayList<Card>();

        for(Suit suit : Suit.values()) {
            // TODO: add support for multiple deck configurations
            if(suit== Suit.RAINBOW) {
                continue;
            }

            for (int rank = 1; rank <= 5; ++rank) {

                Card card = new Card(suit, rank);
                for(int m=0; m<getCardMultiplicity(card); m++) {
                    cards.add(card);
                }
            }
        }

        Collections.shuffle(cards, new Random(randomSeed));
    }

    int getCardMultiplicity(Card card) {
        switch(card.rank) {
            case 1: { return 3; }
            case 2: { return 2; }
            case 3: { return 2; }
            case 4: { return 2; }
            case 5: { return 1; }
        }

        return 0;
    }

    int getNumCardsRemaining()
    {
        return cards.size();
    }

    Card dealCard()
    {
        return cards.remove(0);
    }
}
