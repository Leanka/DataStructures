package dataStructures.linkedList;

public interface LinkedList <T> {
    void append(T value);
    void prepend(T value);
    void delete(T value);
    String toString();
}
