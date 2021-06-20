package chapterFifteen;

public class TelephoneNumberWordGenerator {
    String[][] letters = {{"A", "B", "C"}, {"D", "E", "F"}, {"G", "H", "I"}, {"J", "K", "L"}, {"M", "N", "O"},
                            {"P", "R", "S"}, {"T", "U", "V"}, {"W", "X", "Y"},};

    public void generateWords(String phoneNumber) {
        String[] splitNumber = phoneNumber.split("-");
        phoneNumber = splitNumber[0] + splitNumber[1];
        String newWord = "";
        for (int i = 0; i < phoneNumber.length(); i++) {

        }



    }
}
