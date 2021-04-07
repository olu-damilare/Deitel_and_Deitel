package chapterSix;

import java.security.SecureRandom;

public class CoinToss {

    private int headCount = 0;
    private int tailCount = 0;

    SecureRandom random = new SecureRandom();

    private CoinFace face;
    public int flipCoin() {
        int face = random.nextInt(2);
        return face;
    }

    public CoinFace displayFace(int faceValue) {

        switch (faceValue) {
            case 0 -> {
                face = CoinFace.HEAD;
                headCount++;
            }
            case 1 -> {
                face = CoinFace.TAIL;
                tailCount++;
            }
        }
        return face;
    }

    public int getTailCount() {
        return tailCount;
    }

    public int getHeadCount() {
        return headCount;
    }
}
