package chapterSeventeen.charCount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CharacterSummary {

        public static void summarize(String path) throws IOException {

            Pattern pattern = Pattern.compile("");

                Map<String, Long> charCounts =
                                Files.lines(Paths.get(path))
                                .flatMap(line -> pattern.splitAsStream(line))
                                .map(line -> line.replaceAll("[\s+]", "<white-space>"))
                                .collect(Collectors.groupingBy(String::toLowerCase,
                                TreeMap::new, Collectors.counting()));


            charCounts.entrySet()
                    .stream()
                    .forEach(System.out::println);
        }

    public static void main(String[] args) {
            try {
                CharacterSummary.summarize("src\\chapterSeventeen\\dummyTexts");
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
    }
}
