package arjun.hanabiandroid.game;

import java.util.ArrayList;
import java.util.Queue;

public class GameState {
    final int turnOrder;
    final Queue<Card> deck;
    final ArrayList<Card> discard = new ArrayList<>();
    final Hand[] hands;
    final Card[] piles;
    int cluesRemaining;
    int mistakesRemaining;

    public GameState(InitialState initialState) {
        this.turnOrder = initialState.turnOrder;
        this.deck = DeckGenerator.generateDeck(initialState);
        this.hands = new Hand[initialState.numPlayers];
        this.piles = new Card[Suit.values().length - (initialState.hasRainbowSuit() ? 0 : 1)];
    }

    public Card getNextCard() {
        return deck.poll();
    }
}
