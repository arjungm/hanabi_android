package arjun.hanabiandroid.game;

import java.util.ArrayList;

public class Hand {
    final ArrayList<CardInHand> cards = new ArrayList<>();

    public void addCard(Card card) {
        this.cards.add(new CardInHand(card));
    }

    public CardInHand removeCard(int index) {
        return cards.remove(index);
    }
}
