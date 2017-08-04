package arjun.hanabiandroid.game;

public enum Suit {
    RED("R"),
    WHITE("W"),
    BLUE("B"),
    GREEN("G"),
    YELLOW("Y"),
    RAINBOW("R");

    protected static final Suit[] REGULAR = new Suit[]{RED, WHITE, BLUE, GREEN, YELLOW};

    public final String stringRepresentation;

    Suit(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }
}
