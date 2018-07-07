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

    public long calculateWithMap(int number, Map<Integer, Long> fiboPairs){
        if(number < 0){
            throw new NumberFormatException("Negative value");
        }

        if((number == 1) | (number == 0)){
            return number;
        }

        if(fiboPairs.containsKey(number)){
            return fiboPairs.get(number);
        }else {
            long result = calculateWithMap(number-2, fiboPairs) + calculateWithMap(number-1, fiboPairs);
            fiboPairs.put(number, result);
            return result;
        }
    }

    public long calculateWithLoop(int number){
        if(number < 0){
            throw new NumberFormatException("Negative value");
        }
        if((number == 1) | (number == 0)){
            return number;
        }
        int first = 0;
        int next = 1;
        int current = 0;
        for(int counter = 1; counter < number; counter++){ //starts at 3th number, as 1st and 2nd are bound to vars above
            current = first + next;
            first = next;
            next = current;
        }

        return current;
    }


}
