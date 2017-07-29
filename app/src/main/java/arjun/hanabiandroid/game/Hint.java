package arjun.hanabiandroid.game;

public class Hint {
    public final boolean rankKnown;

    public final boolean colorKnown;

    // for rainbow suit, it may be hinted as any other suit
    public final Suit possibleSuit;

    public Hint(boolean rankKnown, boolean colorKnown, Suit possibleSuit) {
        this.rankKnown = rankKnown;
        this.colorKnown = colorKnown;
        this.possibleSuit = possibleSuit;
    }
}
