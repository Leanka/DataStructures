package algorithms;

import java.util.Arrays;

public class PairSumFinder {

    public boolean findPairWithGivenSum(int [] numbers, int sum){
        if(numbers.length < 2){
            throw new IllegalArgumentException("Array shorter than 2 are not allowed");
        }
        Arrays.sort(numbers);

        int firstIndex = 0;
        int lastIndex = numbers.length - 1;
        boolean isSumPresent = false;

        do{
            int currentSum = numbers[firstIndex] + numbers[lastIndex];
            if(currentSum == sum){
                isSumPresent = true;
                break;
            }else if(currentSum > sum){
                lastIndex--;
            }else if(currentSum < sum){
                firstIndex++;
            }

        }while (firstIndex < lastIndex);
        return isSumPresent;
    }
}
