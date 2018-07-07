package algo;

public class FizzBuzz {
    private int start = 1;

    public String fizBuzzBum(int end){
        if(end < start){
            throw new IllegalArgumentException("Given number must be greater than " + this.start);
        }

        StringBuilder builder = new StringBuilder();

        do{
            if(checkIfDividable(start, 3)){
                builder.append(" ").append("Fizz");
            }

            if(checkIfDividable(start, 5)){
                builder.append(" ").append("Buzz");
            }

            if(checkIfDividable(start, 7)){
                builder.append(" ").append("Bum");
            }

        }while (start++ < end);

        return builder.toString().trim();
    }

    private boolean checkIfDividable(int number, int divideBy){
        return number%divideBy == 0;
    }

}
