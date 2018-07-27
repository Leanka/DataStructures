package linkedlist.generic;

public class GenericLinkedList <T> implements LinkedList <T>{
    private Node head;

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

    public void  prepend(T data){
        Node newHead = new Node(data);
        newHead.setNextNode(head);
        head = newHead;
    }

    public void delete(T data){
        if(head == null){
            return;
        }else if(head.getData() == data){
            head = head.getNextNode();
        }else {
            Node current = head;
            while (current.getNextNode() != null) {
                if (current.getNextNode().getData() == data) {
                    current.setNextNode(current.getNextNode().getNextNode());
                    break;
                }
                current = current.getNextNode();
            }
        }
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();

        Node current = head;
        while (current != null){
            builder.append(" ").append(current);
            current = current.getNextNode();
        }

        return builder.toString();
    }
}
