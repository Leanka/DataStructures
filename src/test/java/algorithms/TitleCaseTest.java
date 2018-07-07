package algorithms;

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

    @Test
    public void testTitleCasingCapitalizedText(){
        String text = "HERE IS MY HANDLE HERE IS MY SPOUT";
        String titleCaseText = "Here Is My Handle Here Is My Spout";

        assertEquals(titleCaseText, titleCase.titleCase(text));
    }

}