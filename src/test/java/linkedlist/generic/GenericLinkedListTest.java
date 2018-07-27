package linkedlist.generic;

import org.junit.Test;
import static org.junit.Assert.*;

public class GenericLinkedListTest {

    @Test
    public void classExistanceTest(){
        new GenericLinkedList<String>();
    }

    @Test
    public void appendTest() {
        LinkedList <Integer> linkedList = createLinkedList(10);
        String expectedListContent = " 0 1 2 3 4 5 6 7 8 9";
        assertEquals(expectedListContent, linkedList.toString());
    }

    @Test
    public void prependTest() {
        LinkedList <Integer> linkedList = createLinkedList(10);
        linkedList.prepend(33);
        linkedList.prepend(114);
        String expectedListContent = " 114 33 0 1 2 3 4 5 6 7 8 9";
        assertEquals(expectedListContent, linkedList.toString());
    }

    @Test
    public void prependOnEmptyLinkedListTest() {
        LinkedList <Integer> linkedList = new GenericLinkedList();
        linkedList.prepend(33);
        linkedList.prepend(114);
        String expectedListContent = " 114 33";
        assertEquals(expectedListContent, linkedList.toString());
    }

    @Test
    public void removeElementTest() {
        LinkedList <Integer> linkedList = createLinkedList(10);
        linkedList.delete(5);
        linkedList.delete(2);
        String expectedListContent = " 0 1 3 4 6 7 8 9";
        assertEquals(expectedListContent, linkedList.toString());
    }

    @Test
    public void removeElementOnEmptyLinkedListTest() {
        LinkedList <Integer> linkedList = new GenericLinkedList();
        linkedList.delete(5);
        linkedList.delete(2);
        String expectedListContent = "";
        assertEquals(expectedListContent, linkedList.toString());
    }

    @Test
    public void removeFirstElementTest() {
        LinkedList <Integer> linkedList = createLinkedList(10);
        linkedList.delete(0);
        String expectedListContent = " 1 2 3 4 5 6 7 8 9";
        assertEquals(expectedListContent, linkedList.toString());
    }

    @Test
    public void removeLastElementTest() {
        LinkedList <Integer> linkedList = createLinkedList(10);
        linkedList.delete(9);
        String expectedListContent = " 0 1 2 3 4 5 6 7 8";
        assertEquals(expectedListContent, linkedList.toString());
    }

    @Test
    public void removeElementThatNotExistsTest() {
        LinkedList <Integer> linkedList = createLinkedList(10);
        linkedList.delete(15);
        String expectedListContent = " 0 1 2 3 4 5 6 7 8 9";
        assertEquals(expectedListContent, linkedList.toString());
    }

    private LinkedList <Integer> createLinkedList(int numOfElements) {
        LinkedList <Integer> array = new GenericLinkedList<>();
        for (int i = 0; i < numOfElements; ++i)
        {
            array.append(i);
        }
        return array;
    }
}