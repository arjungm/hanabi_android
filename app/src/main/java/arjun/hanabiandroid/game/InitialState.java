package arjun.hanabiandroid.game;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class InitialState {
    @Retention(RetentionPolicy.SOURCE)
    @IntDef({
            GAME_TYPE_NO_RAINBOW,
            GAME_TYPE_RAINBOW_SUIT,
            GAME_TYPE_RAINBOW_WILDCARD,
    })
    @interface GameType {
    }

    public static final int GAME_TYPE_NO_RAINBOW = 0;
    public static final int GAME_TYPE_RAINBOW_SUIT = 1;
    public static final int GAME_TYPE_RAINBOW_WILDCARD = 2;

    @GameType
    final int gameType;
    final long seed;
    final int numPlayers;
    final int turnOrder;

    public InitialState(@GameType int gameType, long seed, int numPlayers, int turnOrder) {
        this.gameType = gameType;
        this.seed = seed;
        this.numPlayers = numPlayers;
        this.turnOrder = turnOrder;
    }

    public boolean hasRainbowSuit() {
        return gameType != GAME_TYPE_NO_RAINBOW;
    }
}
