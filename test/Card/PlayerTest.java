package Card;

import chapterSeven.Card.Card;
import org.junit.jupiter.api.Test;

import static chapterSeven.Card.Faces.*;
import static chapterSeven.Card.Suits.*;
import static org.junit.jupiter.api.Assertions.*;


public class PlayerTest {

    @Test
    void testThatPlayerHasACard(){
        Player player = new Player("Joe");
        assertEquals("Joe", player.getName());
        Card card = new Card(JACK, CLUB);
        player.addCard(card);
        assertEquals(1, player.getNumberOfCards());
    }

    @Test
    void testThatPlayerCanPlayCard(){
        Player player = new Player("Joe");
        Card card = new Card(JACK, CLUB);
        player.addCard(card);
        assertEquals(1, player.getNumberOfCards());

        assertEquals(card, player.playCard(1));
        assertEquals(0, player.getNumberOfCards());
    }

    @Test
    void testThatWhenPlayerWithNoCardsPlayCard_throwsStackUnderFlowException(){
        Player player = new Player("Joe");
        assertEquals(0, player.getNumberOfCards());
        assertTrue(player.hasNoCard());

        assertThrows(StackUnderflowException.class, ()-> player.playCard(1));
    }

}
