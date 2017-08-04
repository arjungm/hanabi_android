package arjun.hanabiandroid.game.variants;


import arjun.hanabiandroid.game.Suit;

class RainbowRegular extends Regular {
    private static final Suit[] SUITS = new Suit[]{
            Suit.RED,
            Suit.WHITE,
            Suit.BLUE,
            Suit.GREEN,
            Suit.YELLOW,
            Suit.RAINBOW
    };

    @Override
    public Suit[] getSuits() {
        return SUITS;
    }
}
