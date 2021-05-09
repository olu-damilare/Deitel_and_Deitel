package chapterFourteen;

public class TextAnalysis {

    private int[] charOccurrences = new int[26];
    private int[] wordOccurrences = new int[8];
    private String[] lengthOfWords = {"1-letter", "2-letters", "3-letters", "4-letters",
                                        "5-letters", "6-letters", "7-letters", "8-letters"};
    private char[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                                  'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};



    public void countOccurrencesOfChars(String string) {
        for (int i = 0; i < characters.length; i++) {
            for (int j = 0; j < string.length(); j++) {
                if(characters[i] == string.charAt(j))
                    ++charOccurrences[i];
            }
        }
    }

    public String getOccurrencesOfChars() {
        StringBuilder table = new StringBuilder("Char\tOccurrence\n");
        for (int i = 0; i < characters.length; i++) {
            table.append(characters[i]).append("\t\t").append(charOccurrences[i]).append("\n");
        }

        return table.toString();
    }

    public void countOccurrencesOfWordsByLength(String string) {
        String[] words = string.split("[,.; :]");

        for (String word : words) {
            for (int j = 0; j < lengthOfWords.length; j++) {
                if (word.length() == j + 1)
                    ++wordOccurrences[j];
            }
        }
    }

    public String getOccurrencesOfWords() {
        StringBuilder table = new StringBuilder("Word\tOccurrence\n");
        for (int i = 0; i < lengthOfWords.length; i++) {
            table.append(lengthOfWords[i]).append("\t").append(wordOccurrences[i]).append("\n");
        }
        return table.toString();
    }

    public String countInstanceOfWords(String string) {
        String[] words = string.toLowerCase().split("[,.;:\\s]+");
        int[] numsOfOccurrences = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (String word : words) {
                if (words[i].equals(word))
                    ++numsOfOccurrences[i];
            }
        }

        return getNumberOfOccurrenceOfWords(words, numsOfOccurrences);
    }

    private String getNumberOfOccurrenceOfWords(String[] words, int[] numsOfOccurrences) {
        StringBuilder table = new StringBuilder("Word\tOccurrence\n");
        for (int i = 0; i < words.length; i++) {
            table.append(words[i]).append("\t\t").append(numsOfOccurrences[i]).append("\n");
        }
        return table.toString();
    }
}
