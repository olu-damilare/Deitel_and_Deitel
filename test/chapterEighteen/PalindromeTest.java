package chapterEighteen;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

    @Test
    void testToForPalindrome(){
        Palindrome palindrome = new Palindrome();
        String word = "able was i ere i saw elba";
        assertTrue(palindrome.isPalindrome(word));

    }

    @Test
    void testToReverseACharArray(){
        Palindrome palindrome = new Palindrome();
        char[] chars = {'f', 'e', 't', 'c', 'h'};
        char[] secondChars = {'h', 'c', 't', 'e', 'f'};
        assertTrue(Arrays.equals(secondChars, palindrome.reverseCharArray(chars)));
    }
}
