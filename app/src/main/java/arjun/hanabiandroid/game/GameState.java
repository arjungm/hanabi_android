package arjun.hanabiandroid.game;

import java.util.ArrayList;
import java.util.Queue;

public class GameState {
    final int turnOrder;
    final Queue<Card> deck;
    final ArrayList<Card> discard = new ArrayList<>();
    final Hand[] hands;
    final int[] piles;
    int cluesRemaining;
    int mistakesRemaining;

    public GameState(InitialState initialState) {
        this.turnOrder = initialState.turnOrder;
        this.deck = DeckGenerator.generateDeck(initialState);
        this.hands = new Hand[initialState.numPlayers];
        this.piles = new int[initialState.gameVariant.getSuits().length];
    }

    public Card getNextCard() {
        return deck.poll();
    }
}
