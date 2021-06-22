package chapterSixteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountDuplicateWordsTest {

    @Test
    void testThatDuplicateWordsInAStringIsCounted(){
        CountDuplicateWords count = new CountDuplicateWords();
        String string = "The fetch the locate the found seven fetch";
        assertEquals(3, count.countDuplicate(string));
    }
}
