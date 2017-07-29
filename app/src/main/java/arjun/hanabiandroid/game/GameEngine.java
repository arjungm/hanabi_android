package arjun.hanabiandroid.game;

import java.util.ArrayList;
import java.util.Arrays;

public class GameEngine {
    private static final int INITIAL_CLUES_REMAINING = 8;
    private static final int INITIAL_HINTS_REMAINING = 4;

    private final InitialState initialState;
    private final GameState currentGameState;
    private final ArrayList<Move> moves = new ArrayList<>();

    public GameEngine(InitialState initialState) {
        this.initialState = initialState;
        this.currentGameState = createInitialGameState(initialState);
    }

    private static GameState createInitialGameState(InitialState initialState) {
        GameState state = new GameState();
        state.turnOrder = initialState.turnOrder;
        Hand[] hands = new Hand[initialState.numPlayers];

        int cardsPerHand = initialState.numPlayers == 2 ? 5 : 4;
        int usedCards = 0;
        for (int i = 0; i < hands.length; i++) {
            hands[i] = new Hand(Arrays.copyOfRange(initialState.deck, usedCards,
                    usedCards + cardsPerHand));
            usedCards += cardsPerHand;
        }

        state.deck.addAll(Arrays.asList(Arrays.copyOfRange(initialState.deck, usedCards,
                initialState.deck.length)));
        state.hands = hands;
        state.piles = new Card[Suit.values().length];
        state.cluesRemaining = INITIAL_CLUES_REMAINING;
        state.mistakesRemaining = INITIAL_HINTS_REMAINING;

        return state;
    }
}
