package dataStructures.linkedList;

public class CustomLinkedList<T> implements LinkedList <T>{
    private Node head;

    @Override
    public void append(T data){
        if(head == null){
            head = new Node(data);
        }else {
            Node currentNode = head;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(new Node(data));
        }
    }

    @Override
    public void  prepend(T data){
        Node newHead = new Node(data);
        newHead.setNextNode(head);
        head = newHead;
    }

}
