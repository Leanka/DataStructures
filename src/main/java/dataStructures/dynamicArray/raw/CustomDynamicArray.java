package dataStructures.dynamicArray.raw;

public class CustomDynamicArray implements DynamicArray {
    private int [] myArray;
    private int sizeExtensionByElementCount = 1;
    private int lastFreeIndex = 0;

    public CustomDynamicArray(int arraySize) {
        this.myArray = new int [arraySize];
    }

    public CustomDynamicArray() {
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
