package arjun.hanabiandroid.game;

import java.util.ArrayList;

/**
 * Created by arjun on 7/2/17.
 */

public class Hand
{
    ArrayList<Card> cards;

    void addCard(Card card)
    {
        cards.add(card); // always add to the end of the list
    }

    Card getCard(int index)
    {
        return cards.get(index);
    }

    Card removeCard(int index)
    {
        return cards.remove(index);
    }

    int getSize()
    {
        return cards.size();
    }

    // TODO methods to reorganize hand? useful feature for advanced players?
}
