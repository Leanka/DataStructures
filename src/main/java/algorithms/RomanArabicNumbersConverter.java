package algorithms;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanArabicNumbersConverter {
    private Map <Character, Integer> romanToArabic;
    private Map <String, Integer> arabicToRoman;

    public RomanArabicNumbersConverter() {
        setRomanToArabic();
        setArabicToRoman();
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

    public String arabicToRoman(int arabic){

        StringBuilder builder = new StringBuilder();
        Iterator <Map.Entry<String, Integer>> i = arabicToRoman.entrySet().iterator();
        while ((arabic > 0 ) & (i.hasNext())){
            Map.Entry<String, Integer> pair = i.next();
            Integer currentValue = pair.getValue();

            int repetitions = Math.floorDiv(arabic, currentValue);
            for(int counter = 0; counter < repetitions; counter++){
                builder.append(pair.getKey());
                arabic -= currentValue;
            }
        }
        return builder.toString();
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

    private void setArabicToRoman(){
        arabicToRoman = new LinkedHashMap <> ();

        arabicToRoman.put("M", 1000);
        arabicToRoman.put("CM", 900);
        arabicToRoman.put("D", 500);
        arabicToRoman.put("CD", 400);
        arabicToRoman.put("C", 100);
        arabicToRoman.put("XC", 90);
        arabicToRoman.put("L", 50);
        arabicToRoman.put("XL", 40);
        arabicToRoman.put("X", 10);
        arabicToRoman.put("IX", 9);
        arabicToRoman.put("V", 5);
        arabicToRoman.put("IV", 4);
        arabicToRoman.put("I", 1);
    }
}
