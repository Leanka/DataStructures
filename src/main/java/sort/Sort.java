package sort;

public interface Sort {
    int [] intSort(int [] elementsToBeSorted);
    void swapElements(int [] elementsToBeSorted, int firstElemIndex, int secondElemIndex);
    void showElementsOrder(int [] elements);
}
