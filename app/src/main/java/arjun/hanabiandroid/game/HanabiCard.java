package arjun.hanabiandroid.game;

/**
 * Created by arjun on 7/2/17.
 */

public class HanabiCard
{
    Suit suit; // color of the card, which stack it is played on
    int rank;

    HanabiCard(Suit s, int r)
    {
        this.suit = s;
        if(rank < 1 || rank > 5) {
            throw new IllegalArgumentException();
        }
        this.rank = r;
    }

    @Override
    public String toString()
    {
        return toChar(suit) + ", " + rank;
    }

    public String toChar(Suit s)
    {
        switch(s) {
            case RED:       { return "R"; }
            case GREEN:     { return "G"; }
            case BLUE:      { return "B"; }
            case WHITE:     { return "W"; }
            case YELLOW:    { return "Y"; }
            case RAINBOW:   { return "M"; } // M for multicolor
        }
        return "?";
    }
}
