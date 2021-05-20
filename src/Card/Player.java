package Card;

import chapterSeven.Card.Card;
import tddClasses.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private List<Card> cards = new ArrayList();

    public Player(String name) {
        this.name = name;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getNumberOfCards() {
        return cards.size();
    }

    public String getName() {
        return name;
    }

    public Card playCard(int cardPosition) {
        if(hasNoCard())throw new StackUnderflowException("Player has no cards");

        Card playedCard = cards.get(cardPosition - 1);
        cards.remove(cardPosition - 1);
        return playedCard;
    }

    public boolean hasNoCard() {
        return cards.size() == 0;
    }
}
