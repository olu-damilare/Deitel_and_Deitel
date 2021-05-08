package chapterEleven;

public class ExceptionB extends ExceptionA{
    public ExceptionB(){
        super("This is the default message for ExceptionB");
    }
    public ExceptionB(String message) {
        super(message);
    }
}
