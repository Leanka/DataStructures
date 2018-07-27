package dynamicArray.generic;

public interface DynamicArray <T> {
    void add(T value);
    void remove(T value);
    void insert(int index, T value);
    int length();
    String toString();
}
