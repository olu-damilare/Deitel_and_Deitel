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
            tail = new Node<T>(tail, data, null);
        }
    }

    public T removeFromFront(){
        if(isEmpty()) throw new NullPointerException("List is empty");
        T removedData = head.data;
        if(head == tail) {
            head = tail = null;
        }else {
            head = head.nextNode;
        }

        return removedData;
    }


    public T removeFromEnd() {
        if(isEmpty()) throw new NullPointerException("List is empty");
        T removedData = tail.data;
        if(head == tail) {
            head = tail = null;
        }else {
            tail = tail.previousNode;
        }

        return removedData;
    }

    public void updateNode(Node<T> node, T data) {
        if (isEmpty()) throw new NullPointerException("List is empty");
        if (head == tail) {
            if (head == node) {
                head.data = data;
            }
        } else {
            Node<T> temp = head;
            while (temp.nextNode != null) {
                if (temp.nextNode == node) {
                    temp.nextNode.data = data;
                    return;
                }
            }
        }
    }
}
