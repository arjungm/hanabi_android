package arjun.hanabiandroid.game;

import java.util.concurrent.atomic.AtomicBoolean;

import arjun.hanabiandroid.DebugUtil;

public class Deck {
    private final AtomicBoolean shuffled = new AtomicBoolean(false);

    private Card[] cards;
    private int consumed;

    public Deck(Card[] cards) {
        this.cards = cards;
        this.consumed = 0;
    }

    public void shuffle(long seed) {
        if (shuffled.getAndSet(true)) {
            DebugUtil.logException(new IllegalStateException("Shuffling an already shuffled deck"));
        }

        // TODO: shuffle using seed
    }

    public Card getNextCard() {
        // TODO: consider replacing `null` with `EMPTY` constant for last round of empty cards
        return consumed < cards.length ? cards[consumed++] : null;
    }

    /**
     * Used to create decks to re-create initial game state without allocating extra memory
     *
     * @return A shallow copy of the deck
     */
    public Deck cloneUnused() {
        Deck deck = new Deck(cards);
        deck.shuffled.set(shuffled.get());
        return deck;
    }
}
