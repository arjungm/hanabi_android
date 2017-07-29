package arjun.hanabiandroid.game;

import java.util.ArrayList;

public class GameState {
    int turnOrder;
    final ArrayList<Card> deck = new ArrayList<>();
    ArrayList<Card> discard = new ArrayList<>();
    Hand[] hands;
    Card[] piles;
    int cluesRemaining;
    int mistakesRemaining;
}
