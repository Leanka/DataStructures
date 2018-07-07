package algo;

public class HighestIntProduct {
    private void checkNumbersCount(int [] numbers, int validCount){
        if(numbers.length < validCount){
            throw new IllegalArgumentException("Numbers count cannot be smaller than " + validCount);
        }
    }

    public long getMaxProduct(int [] numbers){
        checkNumbersCount(numbers, 2);
        int maxPositive = 0;
        int nextMaxPositive= 0;

        int maxNegative = 0;
        int nextMaxNegative = 0;

        for(int index = 0; index < numbers.length; index++){
            int current = numbers[index];

            if(current < 0){ //negative values
                if(current < maxNegative){
                    nextMaxNegative = maxNegative;
                    maxNegative = current;
                }else if(current < nextMaxNegative){
                    nextMaxNegative = current;
                }
            }else { //positive values
                if(current > maxPositive){
                    nextMaxPositive = maxPositive;
                    maxPositive = current;
                }else if(current > nextMaxPositive){
                    nextMaxPositive = current;
                }
            }
        }

        int maxPositiveProduct = maxPositive * nextMaxPositive;
        int maxNegativeProduct = maxNegative * nextMaxNegative;

        return maxPositiveProduct > maxNegativeProduct ? maxPositiveProduct : maxNegativeProduct;
    }

    public long getMaxProductofThree(int [] numbers){
        checkNumbersCount(numbers, 3);
        if(numbers.length == 3){
            return numbers[0] * numbers[1] * numbers[2];
        }

        int maxPositive = 0;
        int nextMaxPositive = 0;
        int lastMaxPositive = 0;

        int maxNegative = 0;
        int nextMaxNegative = 0;
        int lastMaxNegative = 0;

        for(int index = 0; index < numbers.length; index++){
            int current = numbers[index];

            if(current < 0){ //negative values
                if(current < maxNegative){
                    lastMaxNegative = nextMaxNegative;
                    nextMaxNegative = maxNegative;
                    maxNegative = current;

                }else if(current < nextMaxNegative){
                    lastMaxNegative = nextMaxNegative;
                    nextMaxNegative = current;
                }else if(current < lastMaxNegative){
                    lastMaxNegative = current;
                }


            }else { //positive values
                if(current > maxPositive){
                    lastMaxPositive = nextMaxPositive;
                    nextMaxPositive = maxPositive;
                    maxPositive = current;
                }else if(current > nextMaxPositive){
                    lastMaxPositive = nextMaxPositive;
                    nextMaxPositive = current;
                }else if(current > lastMaxPositive){
                    lastMaxPositive = current;
                }
            }
        }

        int maxPositiveProduct = maxPositive * nextMaxPositive * lastMaxPositive;
        int maxNegativeProduct = maxNegative * nextMaxNegative * maxPositive;

        return maxPositiveProduct > maxNegativeProduct ? maxPositiveProduct : maxNegativeProduct;
    }

    public long getMaxProductofThreeWithNestedLoop(int [] numbers){
        checkNumbersCount(numbers, 3);
        Integer maxProduct = null;

        for(int index1 = 0; index1 < numbers.length; index1++){
            for(int index2 = 0; index2 < numbers.length; index2++){
                if(index1 == index2){
                    continue;
                }

                for(int index3 = 0; index3 < numbers.length; index3++){
                    if((index2 == index3) || (index1 == index3)){
                        continue;
                    }

                    int result = numbers[index1] * numbers[index2] * numbers[index3];
                    if( maxProduct == null){
                        maxProduct = result;
                    }else if(result > maxProduct) {
                        maxProduct = result;
                    }

                }
            }
        }
        return maxProduct;
    }


}
