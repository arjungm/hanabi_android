package arjun.hanabiandroid.game;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Move {
    @Retention(RetentionPolicy.SOURCE)
    @IntDef({
            MOVE_TYPE_PLAY,
            MOVE_TYPE_DISCARD,
            MOVE_TYPE_HINT,
    })
    @interface MoveType {
    }

    public static final int MOVE_TYPE_PLAY = 0;
    public static final int MOVE_TYPE_DISCARD = 1;
    public static final int MOVE_TYPE_HINT = 2;

    @MoveType
    public final int moveType;
    public final int cardIndex;     // Only used for play and discard
    public final int playerIndex;   // Only used for hint moves
    public final int hintedRank;    // Only used for hint moves
    public final int hintedSuit;    // Only used for hint moves

    public Move(int moveType, int cardIndex, int playerIndex, int hintedRank, int hintedSuit) {
        this.moveType = moveType;
        this.cardIndex = cardIndex;
        this.playerIndex = playerIndex;
        this.hintedRank = hintedRank;
        this.hintedSuit = hintedSuit;
    }
}
