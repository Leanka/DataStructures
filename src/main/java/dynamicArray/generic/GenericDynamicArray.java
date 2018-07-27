package dynamicArray.generic;

import dynamicArray.DynamicArray;

public class GenericDynamicArray <T> implements DynamicArray <T>{
    private T [] myArray;
    private int sizeExtensionByElementCount = 1;
    private int lastFreeIndex = 0;

    public GenericDynamicArray(int arraySize) {

        this.myArray = getGenericArray(arraySize);
    }

    public GenericDynamicArray() {

        this.myArray = getGenericArray(0);
    }

    @SuppressWarnings("unchecked")
    private T[] getGenericArray(int arraySize){
        return (T []) new Object[arraySize];
    }

    @Override
    public int length(){
        return this.myArray.length;
    }

    @Override
    public void add(T value){
        if(lastFreeIndex < this.myArray.length){
            myArray[lastFreeIndex++] = value;
        }else{
            extendArraySize();
            add(value);
        }
    }

    public void remove(T value){
        if(checkIfArrayContainsValue(value)){
            T [] newArray = getGenericArray(getShortenArraySize());

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

    private boolean checkIfArrayContainsValue(T value){
        boolean isValuePresent = false;

        for(T myValue: this.myArray){
            if(myValue == value){
                isValuePresent = true;
                break;
            }
        }

        return isValuePresent;
    }

    public void insert(int index, T value){
        if(index < this.myArray.length){
            insertValueIntoArray(index, value);
        }else {
            add(value);
        }

    }

    private void insertValueIntoArray(int newValueIndex, T newValue){
        T [] extendedArray = getGenericArray(getExtendedArraySize());

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
        T [] extendedArray = getGenericArray(getExtendedArraySize());

        copyFullArrayToExtendedArray(extendedArray);

        this.myArray = extendedArray;
    }

    private void copyFullArrayToExtendedArray(T [] newArray){
        for(int index = 0; index < this.myArray.length; index++){
            newArray[index] = this.myArray[index];
        }
    }

    private int copyArrayToShortenArray(T [] newArray, T valueToOmit){
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
        for(T value: myArray){
            builder.append(" ").append(value);
        }

        return builder.toString();
    }

}
