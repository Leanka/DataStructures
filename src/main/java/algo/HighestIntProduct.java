package algo;

public class HighestIntProduct {

    public long getMaxProduct(int [] numbers){
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

}
