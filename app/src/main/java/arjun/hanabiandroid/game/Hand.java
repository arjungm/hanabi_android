package arjun.hanabiandroid.game;

public class Hand {
    Card[] cards;
    KnownCardInfo[] knownCardInfo;

    public Hand(Card[] cards) {
        this.cards = cards;
        this.knownCardInfo = new KnownCardInfo[cards.length];
        for (int i = 0; i < knownCardInfo.length; i++) {
            knownCardInfo[i] = new KnownCardInfo();
        }
    }
}
