package stack.generic;

import stack.FullStackException;
import java.util.EmptyStackException;

public class GenericStack <T> implements Stack<T> {
    private final T [] array;
    private int top = -1;

    public GenericStack(){
        this(10);
    }

    @SuppressWarnings("unchecked")
    private GenericStack(int size){
        this.array = (T[]) new Object[size];
    }

    @Override
    public T pop() {
        T value = peek();
        top--;
        return value;
    }

    @Override
    public void push(T value) {
        if(isStackFull()){
            throw new FullStackException("Stack is full");
        }
        array[++top] = value;
    }

    private boolean isStackFull(){
        return top >= array.length;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return array[top];
    }

    private boolean isEmpty(){
        return top == -1;
    }
}
