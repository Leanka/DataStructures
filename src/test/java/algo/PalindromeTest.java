package algo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    private Palindrome palindrome;

    @Before
    public void setUp(){
        palindrome = new Palindrome();
    }

    @Test
    public void testIfTextIsPalindrome(){
        String text = "A man, a plan, a canal. Panama";
        boolean isPalindrome = true;

        assertEquals(isPalindrome, palindrome.checkIfPalindrome(text));
    }

    @Test
    public void testIfTextIsNotPalindrome(){
        String text = "This is not a palindrome!";
        boolean isPalindrome = false;

        assertEquals(isPalindrome, palindrome.checkIfPalindrome(text));
    }

}