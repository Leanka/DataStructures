package sort;

public abstract class AbstractSort implements Sort{

    @Override
    public void swapElements(int [] elementsToBeSorted, int firstElemIndex, int secondElemIndex){
        int temp = elementsToBeSorted[firstElemIndex];
        elementsToBeSorted[firstElemIndex] = elementsToBeSorted[secondElemIndex];
        elementsToBeSorted[secondElemIndex] = temp;
    }

    @Override
    public void showElementsOrder(int [] elements){
        for(int element: elements){
            System.out.print(element + ",");
        }
        System.out.println();
    }
}
