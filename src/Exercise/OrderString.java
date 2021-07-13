package Exercise;

public class OrderString {

    public static String order(String words){

        if (words.length() == 0) return "";
        StringBuilder sb = new StringBuilder();
        String[] wordArray = words.split(" ");
        String[] newArray = new String[wordArray.length];
        int digit = 0;

        for (String s : wordArray) {
            for (int j = 0; j < s.length(); j++) {
                if (Character.isDigit(s.charAt(j))) {
                    digit = Integer.parseInt(Character.toString(s.charAt(j)));
                    break;
                }
            }
            newArray[digit - 1] = s;
        }
        for (String s : newArray) {
            sb.append(s).append(" ");
        }
        return sb.substring(0, sb.length() - 1);

    }
}
