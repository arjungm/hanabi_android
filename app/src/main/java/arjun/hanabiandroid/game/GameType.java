package arjun.hanabiandroid.game;


public enum GameType {
    UNKNOWN(null),
    NO_RAINBOW(Suit.REGULAR),
    RAINBOW_SUIT(Suit.values()),
    RAINBOW_MULTI(Suit.values());

    public final Suit[] suits;

    private GameType(Suit[] suits) {
        this.suits = suits;
    }

}
