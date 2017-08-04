package arjun.hanabiandroid.game;

import arjun.hanabiandroid.game.variants.GameVariant;

public class InitialState {
    final GameVariant gameVariant;
    final long seed;
    final int numPlayers;
    final int turnOrder;
    final Deck deck;

    public InitialState(GameVariant gameVariant, long seed, int numPlayers, int turnOrder) {
        this.gameVariant = gameVariant;
        this.seed = seed;
        this.numPlayers = numPlayers;
        this.turnOrder = turnOrder;
        this.deck = gameVariant.generateVanillaDeck();
        deck.shuffle(seed);
    }
}
