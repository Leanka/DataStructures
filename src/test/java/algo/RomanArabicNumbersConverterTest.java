package algo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanArabicNumbersConverterTest {
    private RomanArabicNumbersConverter converter;

    @Before
    public void setUp(){
        converter = new RomanArabicNumbersConverter();
    }

    @Test
    public void testConvertingRomanNumbersToArabic(){
        String romanNumber = "MCDX";
        int arabicNumber = 1410;

        assertEquals(arabicNumber, converter.romanToArabic(romanNumber));
    }

    @Test
    public void testConvertingRomanAscendingNumbersToArabic(){
        String romanNumber = "MDCCLXXXIX";
        int arabicNumber = 1789;

        assertEquals(arabicNumber, converter.romanToArabic(romanNumber));
    }

    @Test
    public void testConvertingRomanDescendingNumbersToArabic(){
        String romanNumber = "MCMLXXXVII";
        int arabicNumber = 1987;

        assertEquals(arabicNumber, converter.romanToArabic(romanNumber));
    }

    @Test
    public void testConvertingArabicNumbersToRoman(){
        String romanNumber = "MCDX";
        int arabicNumber = 1410;

        assertEquals(romanNumber, converter.arabicToRoman(arabicNumber));
    }

    @Test
    public void testConvertingArabicAscendingNumbersToRoman(){
        String romanNumber = "MDCCLXXXIX";
        int arabicNumber = 1789;

        assertEquals(romanNumber, converter.arabicToRoman(arabicNumber));
    }

}