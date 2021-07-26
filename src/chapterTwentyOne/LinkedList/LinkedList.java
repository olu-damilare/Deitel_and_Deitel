package chapterTwentyOne.LinkedList;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;


    public void addFromFront(T data) {
        if (head == null) {
            head = tail =  new Node<T>(data);
        }else{
            head = new Node<T>(null, data, head);
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFromBack(T data) {
        if (head == null) {
            head = tail =  new Node<T>(data);
        }else{
            tail = new Node<T>(null, data, head);

        }
    }


}
