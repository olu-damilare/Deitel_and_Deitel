package chapterEleven;

public class ExceptionA extends Exception{

    public ExceptionA(String message) {
        super(message);
    }
    public ExceptionA(){
        super("This is the default message for ExceptionA");
    }
}
