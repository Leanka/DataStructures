package algo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverserTest {
    private StringReverser stringReverser;

    @Before
    public void setUp(){
        stringReverser = new StringReverser();
    }

    @Test
    public void testTextReversing(){
        String text = "I love beef burgers!";
        String reversedText = "!sregrub feeb evol I";

        assertEquals(reversedText, stringReverser.reverse(text));
    }

    @Test
    public void testReversingEmptyString(){
        String text = "";
        String reversedText = "";

        assertEquals(reversedText, stringReverser.reverse(text));
    }

}