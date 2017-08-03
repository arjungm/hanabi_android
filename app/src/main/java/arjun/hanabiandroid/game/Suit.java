package arjun.hanabiandroid.game;

public enum Suit {
    RED("R"),
    WHITE("W"),
    BLUE("B"),
    GREEN("G"),
    YELLOW("Y"),
    RAINBOW("R");

    public final String stringRepresentation;

    Suit(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }
}
