package lt.vu.mif.stud;

import static org.junit.Assert.*;

import org.junit.Test;

public class HashingTest {

    @Test
    public void fixLengthOfInput_shorter_addsPadding_1() {
        assertEquals("1Utmileo,porta3in5quam6sed7hendrerit24ultrices1neque.Nam4vestib.",
                Hashing.fixLengthOfInput("1"));
    }

    @Test
    public void fixLengthOfInput_shorter_addsPadding_2() {
        assertEquals("1AAAAUtmileo,porta3in5quam6sed7hendrerit24ultrices1neque.Nam4ves",
                Hashing.fixLengthOfInput("1AAAA"));
    }

    @Test
    public void fixLengthOfInput_equal() {
        assertEquals("1AAAAasd3443r939rfjj9f4jf9j54f9j45fj4fkoik68okok87o7oik7ok755hji",
                Hashing.fixLengthOfInput("1AAAAasd3443r939rfjj9f4jf9j54f9j45fj4fkoik68okok87o7oik7ok755hji"));
    }

    @Test
    public void fixLengthOfInput_longer() {
        assertEquals("1AAAAasd3443r939rfjj9f4jf9j54f9j45fj4fkoik68okok87o7oik7ok755hjiBBBBB",
                Hashing.fixLengthOfInput("1AAAAasd3443r939rfjj9f4jf9j54f9j45fj4fkoik68okok87o7oik7ok755hjiBBBBB"));
    }

    @Test
    public void convertToHex() {
        assertEquals("53656420657520737573636970697420646f6c6f722e2053656420757420766573742e",
                Hashing.convertToHex("Sed eu suscipit dolor. Sed ut vest."));
    }
}