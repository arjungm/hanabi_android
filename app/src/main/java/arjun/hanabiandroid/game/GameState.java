package arjun.hanabiandroid.game;

import java.util.ArrayList;

public class GameState {
    final int turnOrder;
    final Deck deck;
    final ArrayList<Card> discard = new ArrayList<>();
    final Hand[] hands;
    final int[] piles;
    int cluesRemaining;
    int mistakesRemaining;

    public GameState(InitialState initialState) {
        this.turnOrder = initialState.turnOrder;
        this.deck = initialState.deck;
        this.hands = new Hand[initialState.numPlayers];
        this.piles = new int[initialState.gameVariant.getSuits().length];
    }
}
