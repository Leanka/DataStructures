package queue.generic;

public interface Queue <T>{
    boolean isEmpty();
    T peek();
    void enqueue(T value);
    T dequeue();
    int getTail();
    int getCapacity();
}