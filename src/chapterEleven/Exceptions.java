package chapterEleven;

import java.io.IOException;

public class Exceptions{
    public static void throwExceptionA() throws ExceptionA {
        throw new ExceptionA();
    }

    public static void throwExceptionB() throws ExceptionB {
        throw new ExceptionB();
    }

    public static void throwExceptions(int determinant) throws Exception{
        if (determinant == 1)
            throw new ExceptionB("This is for ExceptionB");
        if (determinant == 2)
            throw new ExceptionA("This is for ExceptionA");
        if (determinant == 3)
            throw new IOException("This is for IOException");
        if (determinant == 4)
            throw new NullPointerException("This is for NullPointerException");
    }
}
