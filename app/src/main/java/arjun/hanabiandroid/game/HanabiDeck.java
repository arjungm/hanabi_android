package arjun.hanabiandroid.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by arjun on 7/2/17.
 */

public class HanabiDeck {
    ArrayList<HanabiCard> cards;

    HanabiDeck(int randomSeed)
    {
        cards = new ArrayList<HanabiCard>();

        for(HanabiSuit suit : HanabiSuit.values()) {
            // TODO: add support for multiple deck configurations
            if(suit==HanabiSuit.Rainbow) {
                continue;
            }

            for (int rank = 1; rank <= 5; ++rank) {

                HanabiCard card = new HanabiCard(suit, rank);
                for(int m=0; m<getCardMultiplicity(card); m++) {
                    cards.add(card);
                }
            }
        }

        Collections.shuffle(cards, new Random(randomSeed));
    }

    int getCardMultiplicity(HanabiCard card) {
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

    HanabiCard dealCard()
    {
        return cards.remove(0);
    }
}
