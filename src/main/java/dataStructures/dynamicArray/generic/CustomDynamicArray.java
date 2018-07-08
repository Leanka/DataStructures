package dataStructures.dynamicArray.generic;

public class CustomDynamicArray<T> implements DynamicArray <T> {
    private T[] myArray;
    private int sizeExtensionByElementCount = 1;
    private int lastFreeIndex = 0;

    public CustomDynamicArray(int arraySize) {

        this.myArray = getGenericArray(arraySize);
    }

    public CustomDynamicArray() {

        this.myArray = getGenericArray(0);
    }

    @SuppressWarnings("unchecked")
    private T[] getGenericArray(int arraySize) {
        return (T[]) new Object[arraySize];
    }

    public int length() {
        return this.myArray.length;
    }

    public void add(T value) {
        if (lastFreeIndex < this.myArray.length) {
            myArray[lastFreeIndex++] = value;
        } else {
            extendArraySize();
            add(value);
        }
    }

    private void extendArraySize() {
        T[] extendedArray = getGenericArray(getExtendedArraySize());

        copyFullArrayToExtendedArray(extendedArray);

        this.myArray = extendedArray;
    }

    private int getExtendedArraySize() {
        return this.myArray.length + sizeExtensionByElementCount;
    }

    private void copyFullArrayToExtendedArray(T[] newArray) {
        for (int index = 0; index < this.myArray.length; index++) {
            newArray[index] = this.myArray[index];
        }
    }

    public void remove(T value) {
        if (checkIfArrayContainsValue(value)) {
            T[] newArray = getGenericArray(getShortenArraySize());
            copyArrayToShortenArray(newArray, value);
            this.myArray = newArray;
            this.lastFreeIndex--;

        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private boolean checkIfArrayContainsValue(T value) {
        boolean isValuePresent = false;

        for (T myValue : this.myArray) {
            if (myValue == value) {
                isValuePresent = true;
                break;
            }
        }

        return isValuePresent;
    }

    private int copyArrayToShortenArray(T[] newArray, T valueToOmit) {
        int indexOfOmitedElement = -1;


        for (int index = 0, newIndex = 0; index < this.myArray.length; index++, newIndex++) {
            if (this.myArray[index] == valueToOmit) {
                indexOfOmitedElement = index;
                newIndex--;
                continue;
            }
            newArray[newIndex] = this.myArray[index];
        }

        return indexOfOmitedElement;
    }

    private int getShortenArraySize() {
        return this.myArray.length - sizeExtensionByElementCount;
    }
}