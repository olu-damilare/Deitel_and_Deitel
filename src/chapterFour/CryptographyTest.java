package chapterFour;

public class CryptographyTest {
    public static void main(String[] args) {
        Cryptography encrypt = new Cryptography();

       System.out.println(encrypt.encrypt(9458));
       System.out.println(encrypt.decrypt(2561));
    }


}
