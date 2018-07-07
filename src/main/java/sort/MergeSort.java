package sort;

import java.util.Arrays;

public class MergeSort extends AbstractSort {

    @Override
    public int[] intSort(int[] elementsToBeSorted) {

        if(elementsToBeSorted.length < 2){
            return elementsToBeSorted;
        }

        int half = Math.floorDiv(elementsToBeSorted.length, 2);

        int [] left = Arrays.copyOfRange(elementsToBeSorted, 0, half);
        int [] right = Arrays.copyOfRange(elementsToBeSorted, half, elementsToBeSorted.length);

        left = intSort(left);
        right = intSort(right);

        return mergeSortedArrays(left, right);
    }


    protected int [] mergeSortedArrays(int [] leftPart, int [] rightPart){

        int [] merged = new int [leftPart.length + rightPart.length];

        for(int leftIndex = 0, rightIndex = 0, mergedIndex = 0; mergedIndex < merged.length; mergedIndex++){
            if(leftIndex >= leftPart.length){ //if all numbers from left side were used
                merged[mergedIndex] = rightPart[rightIndex];
                rightIndex++;
            }else if(rightIndex >= rightPart.length){ //if all numbers from right side were used
                merged[mergedIndex] = leftPart[leftIndex];
                leftIndex++;
            }else if(leftPart[leftIndex] <= rightPart[rightIndex]){ //if left elem is <= than right
                merged[mergedIndex] = leftPart[leftIndex];
                leftIndex++;
            }else{
                merged[mergedIndex] = rightPart[rightIndex]; //if right elem is < left one
                rightIndex++;

            }
        }
        return merged;
    }


}
