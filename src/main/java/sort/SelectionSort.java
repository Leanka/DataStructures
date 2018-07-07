package sort;

public class SelectionSort extends AbstractSort {

    @Override
    public int[] intSort(int[] elementsToBeSorted) {

        for(int firstUnsortedElem = 0; firstUnsortedElem < elementsToBeSorted.length; firstUnsortedElem++){
            int smallestElemIndex = firstUnsortedElem;
            for(int currentIndex = firstUnsortedElem + 1; currentIndex < elementsToBeSorted.length; currentIndex++){ //start at first unsorted elem index
                if(elementsToBeSorted[currentIndex] < elementsToBeSorted[smallestElemIndex]){
                    smallestElemIndex = currentIndex;
                }
            }
            swapElements(elementsToBeSorted, firstUnsortedElem, smallestElemIndex);

        }
        return elementsToBeSorted;
    }
}
