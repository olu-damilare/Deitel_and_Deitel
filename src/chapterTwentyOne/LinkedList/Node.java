package chapterTwentyOne.LinkedList;

public class Node<T> {
    Node<T> previousNode;
    Node<T> nextNode;
    T data;

    public Node(Node<T> previousNode, T data, Node<T> nextNode) {
        this.previousNode = previousNode;
        this.nextNode = nextNode;
        this.data = data;
    }

    public Node(T data) {
        this(null, data, null);
    }

    @Override
    public String toString() {
        return  "previousNode = " + previousNode.data +
                "\nnextNode = " + nextNode.data +
                "\ndata = " + data;
    }
}
