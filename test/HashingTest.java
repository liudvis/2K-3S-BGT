
import static org.junit.Assert.*;

import lt.vu.mif.stud.Hashing;
import org.junit.Test;

public class HashingTest {

    @Test
    public void fixLengthOfInput_shorter_1() {
        assertEquals("1asd3443r939rfjj9f4jf9j54f9j45fj4fkoik68okok87o7oik7ok755hjitjgy",
                Hashing.fixLengthOfInput("1"));
    }

    @Test
    public void fixLengthOfInput_shorter_2() {
        assertEquals("1AAAAasd3443r939rfjj9f4jf9j54f9j45fj4fkoik68okok87o7oik7ok755hji",
                Hashing.fixLengthOfInput("1AAAA"));
    }

    @Test
    public void fixLengthOfInput_equal() {
        assertEquals("1AAAAasd3443r939rfjj9f4jf9j54f9j45fj4fkoik68okok87o7oik7ok755hji",
                Hashing.fixLengthOfInput("1AAAAasd3443r939rfjj9f4jf9j54f9j45fj4fkoik68okok87o7oik7ok755hji"));
    }

    @Test
    public void fixLengthOfInput_longer() {
        assertEquals("asd3443r939rfjj9f4jf9j54f9j45fj4fkoik68okok87o7oik7ok755hjiBBBBB",
                Hashing.fixLengthOfInput("1AAAAasd3443r939rfjj9f4jf9j54f9j45fj4fkoik68okok87o7oik7ok755hjiBBBBB"));
    }

    @Test
    public void convertToHex() {
        assertEquals("", Hashing.convertToHex(Hashing.convertToHex("Sveiki, jus paskambinot i srota. Su jumis kalba antanas")));
    }
}  