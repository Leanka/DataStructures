package algo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TitleCaseTest {
    private TitleCase titleCase;

    @Before
    public void setUp(){
        titleCase = new TitleCase();
    }

    @Test
    public void testTitleCasingText(){
        String text = "I'm a little tea pot";
        String titleCaseText = "I'm A Little Tea Pot";

        assertEquals(titleCaseText, titleCase.titleCase(text));
    }



}