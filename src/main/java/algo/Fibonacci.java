package algo;

import java.util.Map;

public class Fibonacci {

    public long calculateRecursiveSequence(int number){
        if(number < 0){
            throw new NumberFormatException("Negative value");
        }
        if((number == 1) | (number == 0)){
            return number;
        }
        return calculateRecursiveSequence(number-1) + calculateRecursiveSequence(number-2);
    }




}
