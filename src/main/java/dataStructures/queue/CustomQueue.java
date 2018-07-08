package dataStructures.queue;

public class CustomQueue <T> implements Queue <T> {
    private T [] queue;  //cannot be final as it is going to be extended
    private int head = -1;
    private int tail;
    private int basicCapacity = 2;

    public CustomQueue(){
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


    private void extendCapacity(){
        int doubledCapacity = getCapacity() * 2;
        T [] extendedQueue = getGenericArray(doubledCapacity);

        for(int i = 0; i < getCapacity(); i++){
            extendedQueue[i] = queue[i];
        }

        queue = extendedQueue;
    }
}