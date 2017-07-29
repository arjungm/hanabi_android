package arjun.hanabiandroid.game;

public class InitialState {
    public final Card[] deck;
    public final int numPlayers;
    public final int turnOrder;

    public InitialState(Card[] deck, int numPlayers, int turnOrder) {
        this.deck = deck;
        this.numPlayers = numPlayers;
        this.turnOrder = turnOrder;
    }
}
