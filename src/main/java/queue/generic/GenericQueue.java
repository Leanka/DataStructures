package queue.generic;

public class GenericQueue <T> implements Queue <T> {
    private T [] queue;
    private int head = -1;
    private int tail;
    private int basicCapacity = 2;

    public GenericQueue(){
        queue = getGenericArray(basicCapacity);
    }

    @SuppressWarnings("unchecked")
    private T[] getGenericArray(int arraySize){
        return (T []) new Object[arraySize];
    }

    public int getCapacity(){
        return queue.length;
    }

    @Override
    public boolean isEmpty() {
        return head < 0;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw new EmptyQueueException("Cannot peek from an empty queue");
        }
        return queue[head];
    }

    @Override
    public void enqueue(T value) {
        if(isEmpty()){
            queue[++head] = value;
            tail++; //indicate first free index in queue, here it's [1], as [0] is head now
        }else{
            if(tail == getCapacity()){
                extendCapacity();
            }
            queue[tail++] = value;
        }
    }

    public int getTail(){
        return this.tail;
    }

    @Override
    public T dequeue() {
        T removedValue;
        if(isEmpty()){
            throw new EmptyQueueException("Cannot dequeue an empty queue");
        }else if(tail == 1){
            removedValue = queue[head];
            head--;
            tail--;
        }else {
            removedValue = queue[head];
            tail--;

            for (int i = 1; i < tail; i++) {
                queue[i - 1] = queue[i];
            }
        }
        return removedValue;
    }

    private void extendCapacity(){
        int doubledCapacity = getCapacity() * 2;
        T [] extendedQueue = getGenericArray(doubledCapacity);

        for(int i = 0; i < getCapacity(); i++){
            extendedQueue[i] = queue[i];
        }

        queue = extendedQueue;
    }
}
