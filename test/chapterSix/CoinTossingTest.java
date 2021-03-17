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
        int face = coin.flipCoin();
        assertEquals("Face", coin.displayFace(face));
    }
}
