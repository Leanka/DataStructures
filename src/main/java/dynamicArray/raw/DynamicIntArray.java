package dynamicArray.raw;
/**
 * Arrays are statically implemented data structures - the size of this data structure must
 * be known at compile time and cannot be altered at run time = A dynamic array can be resized
 * or is resizing itself automatically when needed, but a static array can't be resized.
 *
 * + easier data structures to use and access.
 *
 * - inserting an item to an array and deleting it from the array are situation dependent.
 * Time taken by insert operation is depend on how big the array is, and at which position
 * the item is being inserted. The same is true about deletion of an item.
 * - f the array is unsorted then search operation is also proved costly and takes O(N) time
 * in worst case, where N is size of the array. But if the array is sorted then search performance
 * is improved magically and takes O(logN) time in worst case.
 */

public class DynamicIntArray implements DynamicArray{
    private int [] myArray;
    private int sizeExtensionByElementCount = 1;
    private int lastFreeIndex = 0;

    public DynamicIntArray(int arraySize) {
        this.myArray = new int [arraySize];
    }

    public DynamicIntArray() {
        this.myArray = new int[0];
    }

    public int length(){
        return this.myArray.length;
    }

    public void add(int value){
        if(lastFreeIndex < this.myArray.length){
            myArray[lastFreeIndex++] = value;
        }else{
            extendArraySize();
            add(value);
        }
    }

    public void remove(int value){
        if(checkIfArrayContainsValue(value)){
            int newSize = getShortenArraySize();
            int [] newArray = new int [newSize];

            int removedElementIndex = copyArrayToShortenArray(newArray, value);

            this.myArray = newArray;
            updateLastFreeElementIndex(removedElementIndex);

        }else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private void updateLastFreeElementIndex(int removedElementIndex){
        this.lastFreeIndex--;
    }

    private boolean checkIfArrayContainsValue(int value){
        boolean isValuePresent = false;

        for(int myValue: this.myArray){
            if(myValue == value){
                isValuePresent = true;
                break;
            }
        }

        return isValuePresent;
    }

    public void insert(int index, int value){
        if(index < this.myArray.length){
            insertValueIntoArray(index, value);
        }else {
            add(value);
        }

    }

    private void insertValueIntoArray(int newValueIndex, int newValue){
        int newSize = getExtendedArraySize();
        int [] extendedArray = new int [newSize];

        for(int index = 0, postInsertIndex = 0; index < this.myArray.length; index++, postInsertIndex++){
            if(postInsertIndex == newValueIndex){
                extendedArray[postInsertIndex] = newValue;
                index--;
            }else{
                extendedArray[postInsertIndex] = this.myArray[index];
            }
        }

        this.myArray = extendedArray;
        this.lastFreeIndex++;
    }

    private void extendArraySize(){
        int newSize = getExtendedArraySize();
        int [] extendedArray = new int [newSize];

        copyFullArrayToExtendedArray(extendedArray);

        this.myArray = extendedArray;
    }

    private void copyFullArrayToExtendedArray(int [] newArray){
        for(int index = 0; index < this.myArray.length; index++){
            newArray[index] = this.myArray[index];
        }
    }

    private int copyArrayToShortenArray(int [] newArray, int valueToOmit){
        int indexOfOmitedElement = -1;


        for(int index = 0, newIndex = 0; index < this.myArray.length; index++, newIndex++){
            if(this.myArray[index] == valueToOmit){
                indexOfOmitedElement = index;
                newIndex--;
                continue;
            }
            newArray[newIndex] = this.myArray[index];
        }

        return indexOfOmitedElement;
    }

    private int getExtendedArraySize(){
        return this.myArray.length + sizeExtensionByElementCount;
    }

    private int getShortenArraySize(){
        return this.myArray.length - sizeExtensionByElementCount;
    }


    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(int value: myArray){
            builder.append(" ").append(value);
        }

        return builder.toString();
    }
}