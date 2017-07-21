package arjun.hanabiandroid.game;

/**
 * Created by arjun on 7/2/17.
 */

public class HanabiCard
{
    HanabiSuit suit; // color of the card, which stack it is played on
    int rank;

    HanabiCard(HanabiSuit s, int r)
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

    public String toChar(HanabiSuit s)
    {
        switch(s) {
            case Red:       { return "R"; }
            case Green:     { return "G"; }
            case Blue:      { return "B"; }
            case White:     { return "W"; }
            case Yellow:    { return "Y"; }
            case Rainbow:   { return "M"; } // M for multicolor
        }
        return "?";
    }
}
