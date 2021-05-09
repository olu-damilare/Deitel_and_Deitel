package chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextAnalysisTest {

    @Test
    void testThatNumberOfOccurrenceOfCharactersAreRecorded(){
        TextAnalysis analysis = new TextAnalysis();
        analysis.countOccurrencesOfChars("To be, or not to be: that is the question");
        assertEquals("""
                Char	Occurrence
                a		1
                b		2
                c		0
                d		0
                e		4
                f		0
                g		0
                h		2
                i		2
                j		0
                k		0
                l		0
                m		0
                n		2
                o		5
                p		0
                q		1
                r		1
                s		2
                t		6
                u		1
                v		0
                w		0
                x		0
                y		0
                z		0
                """, analysis.getOccurrencesOfChars());

    }

    @Test
    void testThatNumberOfOccurrenceOfWordsAreRecorded(){
        TextAnalysis analysis = new TextAnalysis();
        analysis.countOccurrencesOfWordsByLength("To be, or not to be: that is the question");
        assertEquals("""
                Word	Occurrence
                1-letter	0
                2-letters	6
                3-letters	2
                4-letters	1
                5-letters	0
                6-letters	0
                7-letters	0
                8-letters	1
                """, analysis.getOccurrencesOfWords());
    }

    @Test
    void testThatNumberOfInstanceOfWordsInStringCanBeRecorded(){
        TextAnalysis analysis = new TextAnalysis();
        System.out.println(analysis.countInstanceOfWords("To be, or not to be: that is the question Whether 'tis nobler in the mind to suffer"));
    }

}
