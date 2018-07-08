package dataStructures.linkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    private LinkedList<Integer> customLinkedList;

    @Test
    void classExistanceTest(){
        new CustomLinkedList<>();
    }

    @Test
    void appendTest() {
        createLinkedList(10);
        String expectedListContent = " 0 1 2 3 4 5 6 7 8 9";
        assertEquals(expectedListContent, customLinkedList.toString());
    }

    @Test
    void prependTest() {
        createLinkedList(10);
        customLinkedList.prepend(33);
        customLinkedList.prepend(114);
        String expectedListContent = " 114 33 0 1 2 3 4 5 6 7 8 9";
        assertEquals(expectedListContent, customLinkedList.toString());
    }

    @Test
    void prependOnEmptyLinkedListTest() {
        customLinkedList = new CustomLinkedList<>();
        customLinkedList.prepend(33);
        customLinkedList.prepend(114);
        String expectedListContent = " 114 33";
        assertEquals(expectedListContent, customLinkedList.toString());
    }

    @Test
    void removeElementTest() {
        createLinkedList(10);
        customLinkedList.delete(5);
        customLinkedList.delete(2);
        String expectedListContent = " 0 1 3 4 6 7 8 9";
        assertEquals(expectedListContent, customLinkedList.toString());
    }

    @Test
    void removeElementOnEmptyLinkedListTest() {
        customLinkedList = new CustomLinkedList<>();
        customLinkedList.delete(5);
        customLinkedList.delete(2);
        String expectedListContent = "";
        assertEquals(expectedListContent, customLinkedList.toString());
    }

    @Test
    void removeFirstElementTest() {
        createLinkedList(10);
        customLinkedList.delete(0);
        String expectedListContent = " 1 2 3 4 5 6 7 8 9";
        assertEquals(expectedListContent, customLinkedList.toString());
    }

    @Test
    void removeLastElementTest() {
        createLinkedList(10);
        customLinkedList.delete(9);
        String expectedListContent = " 0 1 2 3 4 5 6 7 8";
        assertEquals(expectedListContent, customLinkedList.toString());
    }

    @Test
    void removeElementThatNotExistsTest() {
        createLinkedList(10);
        customLinkedList.delete(15);
        String expectedListContent = " 0 1 2 3 4 5 6 7 8 9";
        assertEquals(expectedListContent, customLinkedList.toString());
    }

    @Test
    void testPrintingEmptyLinkedList(){
        createLinkedList(0);
        String expectedOutput = "";
        assertEquals(expectedOutput, customLinkedList.toString());
    }

    private void createLinkedList(int numOfElements) {
        this.customLinkedList = new CustomLinkedList<>();
        for (int i = 0; i < numOfElements; ++i)
        {
            customLinkedList.append(i);
        }
    }

}