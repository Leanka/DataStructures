package sort;

public class BubbleSort extends AbstractSort {

    @Override
    public int[] intSort(int[] elementsToBeSorted){

        for(int i = 0; i < elementsToBeSorted.length; i++){
            for(int index = 1; index < elementsToBeSorted.length - i; index++){ //i is number of elements that are alredy in it's place
                if(elementsToBeSorted[index-1] > elementsToBeSorted[index]){
                    swapElements(elementsToBeSorted, index-1, index);
                }
            }
        }
        return elementsToBeSorted;
    }

    public void simplestIntSort(int[] elementsToBeSorted) {

        for(int index = 0; index < elementsToBeSorted.length; index++){
            for(int i = 0; i < elementsToBeSorted.length; i++){
                if(elementsToBeSorted[index] < elementsToBeSorted[i]){
                    swapElements(elementsToBeSorted, index, i);
                }
            }
        }

    }


}
