package algo;

public class Factorial {

    public int calculateFactorial(int number){
        if(number < 0){
            throw new NumberFormatException("Negative numbers are not allowed");
        }

        if(number == 1){
            return number;
        }

        return calculateFactorial(number - 1) * number;
    }
}
