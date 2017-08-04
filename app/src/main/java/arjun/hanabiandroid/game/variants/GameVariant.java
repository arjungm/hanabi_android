package arjun.hanabiandroid.game.variants;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import arjun.hanabiandroid.game.CardInHand;
import arjun.hanabiandroid.game.Move;
import arjun.hanabiandroid.game.Suit;

public abstract class GameVariant {
    @Retention(RetentionPolicy.SOURCE)
    @IntDef({
            GAME_TYPE_UNKNOWN,
            GAME_TYPE_REGULAR,
            GAME_TYPE_RAINBOW_REGULAR,
            GAME_TYPE_RAINBOW_WILDCARD,
    })
    @interface GameType {
    }

    public static final int GAME_TYPE_UNKNOWN = 0;
    public static final int GAME_TYPE_REGULAR = 1;
    public static final int GAME_TYPE_RAINBOW_REGULAR = 2;
    public static final int GAME_TYPE_RAINBOW_WILDCARD = 3;

    public static final GameVariant variantForInt(@GameType int gameType) {
        switch (gameType) {
            case GAME_TYPE_REGULAR:
                return new Regular();
            case GAME_TYPE_RAINBOW_REGULAR:
                return new RainbowRegular();
            case GAME_TYPE_RAINBOW_WILDCARD:
                return new RainbowWildcard();
        }
        return null;
    }

    public abstract Suit[] getSuits();

    public abstract void applyHint(CardInHand card, Move move);
}
