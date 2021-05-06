package tddClasses;

import Exercise.CreditCardValidation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidationTest {
    long creditCardNumber;
    CreditCardValidation validate;
    @BeforeEach
    void setUp() {
        creditCardNumber = 4388576018402626L;
        validate = new CreditCardValidation();
    }


    @Test
    void testThatCreditCardIsInvalid(){
        assertFalse(validate.isValid(creditCardNumber));
        assertTrue(validate.isValid(371175520987141L));
    }
}
