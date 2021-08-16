package Exercise;

public class ReorderStrings {

    public static String reorder(String input) {
        String[] arr = input.split("\\s+");
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < 10; i++) {
            for (String s : arr) {
                if (s.contains(String.valueOf(i))) {
                    result.append(s).append(" ");
                }
            }
        }
        return result.toString().trim();

    }
}
