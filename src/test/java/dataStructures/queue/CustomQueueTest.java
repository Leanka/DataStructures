package dataStructures.queue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomQueueTest {
    private Queue <Integer> queue;
    private  int initialCapacity = 2;

    @Before
    public void setUpDataBeforeTest(){
        queue = new CustomQueue <> ();
    }

    @Test
    public void testIsNewQueueEmpty(){
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testAddingOneElementToQueue(){
        queue.enqueue(5);
        assertEquals(1, queue.getTail());
    }

    @Test
    public void testPeekingFirstElement(){
        Integer firstElement = 7;
        queue.enqueue(firstElement);

        assertEquals(firstElement, queue.peek());
    }

    @Test
    public void testPeekingFromEmptyQueue(){
        boolean wasExceptionThrown = false;
        try{
            queue.peek();
        }catch (EmptyQueueException exception){
            wasExceptionThrown = true;
        }

        assertTrue(wasExceptionThrown);
    }

    @Test
    public void testDequeueOneElement(){
        int numberOfRemovedElements = 1;

        addElementsToQueue(initialCapacity);
        popElementsFromQueue(numberOfRemovedElements);

        assertEquals(initialCapacity - numberOfRemovedElements, queue.getTail());
    }

    @Test
    public void testDequeueMultipleElements(){
        int numberOfElementsToAdd = 10;
        int numberOfElementsToRemove = 5;

        addElementsToQueue(numberOfElementsToAdd);
        popElementsFromQueue(numberOfElementsToRemove);
        addElementsToQueue(numberOfElementsToAdd);
        popElementsFromQueue(numberOfElementsToRemove);

        Integer expectedValue = 9;
        assertEquals(expectedValue, queue.peek());
    }

    @Test
    public void testIfDequeueReturnsFirstElement(){
        int numberOfRemovedElements = 1;

        addElementsToQueue(initialCapacity);

        Integer expectedValue = initialCapacity - numberOfRemovedElements;
        assertEquals(expectedValue, queue.dequeue());
    }

    @Test
    public void testIsQueueEmptyAfterRemovingAllElements(){
        addElementsToQueue(initialCapacity);
        popElementsFromQueue(initialCapacity);

        assertTrue(queue.isEmpty());
    }

    @Test
    public void testDequeueMoreElementsThanQueueContains(){
        addElementsToQueue(initialCapacity);
        popElementsFromQueue(initialCapacity);

        boolean wasExceptionThrown = false;
        try{
            queue.dequeue();
        }catch (EmptyQueueException exception){
            wasExceptionThrown = true;
        }

        assertTrue(wasExceptionThrown);
    }

    private void addElementsToQueue(int times){
        while (times-- > 0){
            queue.enqueue(times);
        }
    }

    private void popElementsFromQueue(int times){
        while(times-- > 0){
            queue.dequeue();
        }
    }

    @Test
    public void testCapacityDoubling(){
        int expectedFinalCapacity = initialCapacity * 2;
        addElementsToQueue(initialCapacity + 1);
        assertEquals(expectedFinalCapacity, queue.getCapacity());
    }

    @Test
    public void testCapacityMultiplying(){
        int countOfCapacityExtending = 5;
        int expectedFinalCapacity = getMultiplyedCapacity(countOfCapacityExtending);

        int numberOfElementsToForceCapacityExtension = getMultiplyedCapacity(countOfCapacityExtending-1) + 1;
        addElementsToQueue(numberOfElementsToForceCapacityExtension);

        assertEquals(expectedFinalCapacity, queue.getCapacity());
    }

    private int getMultiplyedCapacity(int times){
        int capacityMultiplication = 2;
        int newCapacity = initialCapacity;

        while (times-- > 0){
            newCapacity *= capacityMultiplication;
        }
        return newCapacity;
    }
}
