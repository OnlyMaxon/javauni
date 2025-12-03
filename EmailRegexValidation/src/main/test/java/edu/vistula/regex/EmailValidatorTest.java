package edu.vistula.regex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailValidatorTest {

    @Test
    void testValidEmails() {
        assertTrue(EmailValidator.isValidEmail("test@example.com"));
        assertTrue(EmailValidator.isValidEmail("test@stu.vistula.edu.pl"));
    }

    @Test
    void testInvalidEmails() {
        assertFalse(EmailValidator.isValidEmail("test@examplecom")); // missing dot
        assertFalse(EmailValidator.isValidEmail("test@vistula.pl")); // only 2 letters after dot
        assertFalse(EmailValidator.isValidEmail("invalid@@example.com")); // double @
        assertFalse(EmailValidator.isValidEmail("")); // empty string
        assertFalse(EmailValidator.isValidEmail(null)); // null input
    }
}