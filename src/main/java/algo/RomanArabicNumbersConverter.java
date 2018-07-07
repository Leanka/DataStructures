package algo;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanArabicNumbersConverter {
    private Map <Character, Integer> romanToArabic;
    private Map <String, Integer> arabicToRoman;

    public RomanArabicNumbersConverter() {
        setRomanToArabic();
    }

    public int romanToArabic(String roman){
        int year = romanToArabic.get(roman.charAt(roman.length()-1)); //get last letter value
        for(int index = roman.length()-2; index >= 0; index--){

            int current = romanToArabic.get(roman.charAt(index)); //przedostatni
            int next = romanToArabic.get(roman.charAt(index + 1));

            if(current >= next){
                year += current;
            }else{
                year -= current;
            }
        }
        return year;
    }

    private void setRomanToArabic(){
          romanToArabic = new LinkedHashMap <> ();

          romanToArabic.put('M', 1000);
          romanToArabic.put('D', 500);
          romanToArabic.put('C', 100);
          romanToArabic.put('L', 50);
          romanToArabic.put('X', 10);
          romanToArabic.put('V', 5);
          romanToArabic.put('I', 1);
    }


}
