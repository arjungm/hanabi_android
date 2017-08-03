package arjun.hanabiandroid.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

    public void makeMove(Move move) {
        makeMove(move, currentGameState);
        moves.add(move);
    }

    private static void makeMove(Move move, GameState state) {
    }

    private static GameState createInitialGameState(InitialState initialState) {
        GameState state = new GameState(initialState);

        int cardsPerHand = initialState.numPlayers == 2 ? 5 : 4;
        for (int i = 0; i < state.hands.length; i++) {
            state.hands[i] = new Hand();
            for (int j = 0; j < cardsPerHand; j++) {
                state.hands[i].addCard(state.getNextCard());
            }
        }

        state.cluesRemaining = INITIAL_CLUES_REMAINING;
        state.mistakesRemaining = INITIAL_HINTS_REMAINING;

        return state;
    }
}
