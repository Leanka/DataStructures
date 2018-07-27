package dynamicArray.raw;

public interface DynamicArray {
    void add(int value);
    void remove(int value);
    void insert(int index, int value);
    int length();
    String toString();
}