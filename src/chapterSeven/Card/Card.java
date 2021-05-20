package chapterSeven.Card;

public class Card {
    private final Faces face;
    private final Suits suit;

    public Card(Faces cardFace, Suits cardSuit) {
        face = cardFace;
        suit = cardSuit;
    }

    public Faces getFace() {
        return face;
    }

    public Suits getSuit() {
        return suit;
    }
}
