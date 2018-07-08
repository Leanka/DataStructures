package dataStructures.linkedList;

public class Node <T>{
    private T data;
    private Node nextNode;

    public Node(T data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public T getData() {
        return data;
    }

    public String toString() {
        return String.valueOf(data);
    }
}
