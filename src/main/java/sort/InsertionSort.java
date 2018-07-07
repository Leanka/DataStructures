package sort;

public class InsertionSort extends AbstractSort {

    @Override
    public int[] intSort(int[] elementsToBeSorted) {
        for(int firstUnsortedElementIndex = 1; firstUnsortedElementIndex < elementsToBeSorted.length; firstUnsortedElementIndex++){
            for(int firstSortedElem = 0; firstSortedElem < firstUnsortedElementIndex; firstSortedElem++){
                if(elementsToBeSorted[firstSortedElem] > elementsToBeSorted[firstUnsortedElementIndex]){
                    insertValueBackwords(elementsToBeSorted, firstSortedElem, firstUnsortedElementIndex);
                    break;
                }
            }
        }

        return elementsToBeSorted;
    }

    protected void insertValueBackwords(int[] elementsToBeSorted, int insertPlaceIndex, int insertedElemIndex){
        int valueToInsert = elementsToBeSorted[insertedElemIndex];

        for(int index = insertedElemIndex; index > insertPlaceIndex; index--){
            elementsToBeSorted[index] = elementsToBeSorted[index-1];

        }
        elementsToBeSorted[insertPlaceIndex] = valueToInsert;
    }
}
