package dataStructures.linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    @Test
    void classExistanceTest(){
        new CustomLinkedList<>();
    }

    @Test
    void appendTest() {
        LinkedList<Integer> customLinkedList = createLinkedList(10);
        String expectedListContent = " 0 1 2 3 4 5 6 7 8 9";
        assertEquals(expectedListContent, customLinkedList.toString());
    }

    @Test
    void prependTest() {
        LinkedList<Integer> customLinkedList = createLinkedList(10);
        customLinkedList.prepend(33);
        customLinkedList.prepend(114);
        String expectedListContent = " 114 33 0 1 2 3 4 5 6 7 8 9";
        assertEquals(expectedListContent, customLinkedList.toString());
    }

    @Test
    void prependOnEmptyLinkedListTest() {
        LinkedList<Integer> customLinkedList = new CustomLinkedList<>();
        customLinkedList.prepend(33);
        customLinkedList.prepend(114);
        String expectedListContent = " 114 33";
        assertEquals(expectedListContent, customLinkedList.toString());
    }

    @Test
    void removeElementTest() {
        LinkedList<Integer> customLinkedList = createLinkedList(10);
        customLinkedList.delete(5);
        customLinkedList.delete(2);
        String expectedListContent = " 0 1 3 4 6 7 8 9";
        assertEquals(expectedListContent, customLinkedList.toString());
    }

    @Test
    void removeElementOnEmptyLinkedListTest() {
        LinkedList<Integer> customLinkedList = new CustomLinkedList<>();
        customLinkedList.delete(5);
        customLinkedList.delete(2);
        String expectedListContent = "";
        assertEquals(expectedListContent, customLinkedList.toString());
    }

    @Test
    void removeFirstElementTest() {
        LinkedList<Integer> customLinkedList = createLinkedList(10);
        customLinkedList.delete(0);
        String expectedListContent = " 1 2 3 4 5 6 7 8 9";
        assertEquals(expectedListContent, customLinkedList.toString());
    }

    @Test
    void removeLastElementTest() {
        LinkedList<Integer> customLinkedList = createLinkedList(10);
        customLinkedList.delete(9);
        String expectedListContent = " 0 1 2 3 4 5 6 7 8";
        assertEquals(expectedListContent, customLinkedList.toString());
    }

    @Test
    void removeElementThatNotExistsTest() {
        LinkedList<Integer> customLinkedList = createLinkedList(10);
        customLinkedList.delete(15);
        String expectedListContent = " 0 1 2 3 4 5 6 7 8 9";
        assertEquals(expectedListContent, customLinkedList.toString());
    }

    private LinkedList<Integer> createLinkedList(int numOfElements) {
        LinkedList<Integer> customLinkedList = new CustomLinkedList<>();
        for (int i = 0; i < numOfElements; ++i)
        {
            customLinkedList.append(i);
        }
        return customLinkedList;
    }

}