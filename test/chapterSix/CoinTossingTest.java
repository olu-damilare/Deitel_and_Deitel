package chapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoinTossingTest {
    CoinToss coin;
    @BeforeEach
    void setUp(){
       coin = new CoinToss();
    }

    @Test
    void testThatMethodCanRandomlyFlipCoin(){
       assertNotEquals(coin.flipCoin(), coin.flipCoin());
    }
    @Test
    void testThatMethodCanDisplayFaceOfCoin(){
        assertEquals(CoinFace.TAIL, coin.displayFace(1));

        assertEquals(CoinFace.HEAD, coin.displayFace(0));
    }
    @Test
    void testToCountTail(){
        coin.displayFace(1);
        coin.displayFace(1);
       assertEquals(2, coin.getTailCount());

    }
    @Test
    void testToCountHead(){
        coin.displayFace(0);
        coin.displayFace(0);
        coin.displayFace(0);
        coin.displayFace(0);
        assertEquals(4, coin.getHeadCount());

    }
}
