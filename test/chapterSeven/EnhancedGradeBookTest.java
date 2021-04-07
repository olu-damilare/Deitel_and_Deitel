package chapterSeven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EnhancedGradeBookTest {
    EnhancedGradeBook gradeBook;
    @BeforeEach
    void setUp(){
        gradeBook = new EnhancedGradeBook("CSC 101", 10, 20);
    }
    @AfterEach
    void tearDown(){
        gradeBook = null;
    }



}
