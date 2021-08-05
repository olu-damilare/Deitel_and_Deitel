package chapterTwentyOne.LinkedList;

import javax.naming.directory.InvalidAttributeIdentifierException;


public class LinkedList<T>{
    private Node<T> head;
    private Node<T> tail;
    private Node<T> pointer;
    private boolean hasMadeFirstIteration;

    public Node<T> addFromFront(T data) {
        if (isEmpty()) {
            head = tail =  new Node<T>(data);
            head.previousNode = head.nextNode = tail;
        }else{
            head = new Node<T>(tail, data, head);
            tail.nextNode = head;
            head.nextNode.previousNode = head;
        }
        pointer = head;
        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node<T> addFromBack(T data) {
        if (isEmpty()) {
            head = tail =  new Node<T>(data);
            head.nextNode = head.previousNode = tail;
            pointer = head;
        }else{
            tail = tail.nextNode = new Node<T>(tail, data, head);
            head.previousNode = tail;
        }
        return tail;
    }

    public T removeFromFront(){
        if(isEmpty()) throw new NullPointerException("List is empty");
        T removedData = head.data;
        if(head == tail) {
            head = tail = null;
        }else {
            head = head.nextNode;
            tail.nextNode = head;
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
            head.previousNode = tail;
            tail.nextNode = head;
        }

        return removedData;
    }

    public void updateNode(Node<T> node, T data) throws InvalidAttributeIdentifierException {
        if (isEmpty()) throw new NullPointerException("List is empty");
        if (head == tail && head == node) {
            head.data = data;
        }else if(head != tail){
            Node<T> temp = head;
            while (temp.nextNode != head) {
                if (temp.nextNode == node) {
                    temp.nextNode.data = data;
                    return;
                }
                temp = temp.nextNode;
            }
        }else throw new InvalidAttributeIdentifierException("Invalid node");
    }

    public boolean isPresent(T data){
        if(isEmpty()) throw new NullPointerException("List is empty");
        if(head == tail)
            return head.data == data;
        Node<T> temp = head;
        while(temp.nextNode != head){
            if (temp.nextNode.data == data) return true;
            temp = temp.nextNode;
        }
        return false;
    }

    public void removeNode(Node<T> node) throws InvalidAttributeIdentifierException {
        if(isEmpty()) throw new NullPointerException("List is empty");
        if(head == tail){
            if(head == node){
                head = tail = null;
            }else throw new InvalidAttributeIdentifierException("Invalid node");
        }
        Node<T> temp = head;

        do {
            if(temp == node){
                temp.previousNode.nextNode = temp.nextNode;
                temp.nextNode.previousNode = temp.previousNode;
                break;
            }
            temp = temp.nextNode;
        } while (temp != head);
    }

    public void insertAfter(Node<T> node, T data) throws InvalidAttributeIdentifierException {
        if(isEmpty()) throw new InvalidAttributeIdentifierException("Invalid node");
        Node<T> temp = head;
        do{
            if(temp == node){
                Node<T> newNode = new Node<T>(temp, data, temp.nextNode);
                temp.nextNode = newNode;
                temp.nextNode.previousNode = newNode;
                return;
            }
            temp = temp.nextNode;
        }while(temp != head);
    }

    @Override
    public String toString() {
        if(isEmpty()) return "[]";
        StringBuilder list = new StringBuilder("[");

        Node<T> temp = head;
        do {
            list.append(temp.data);
                if (temp != tail){
                    list.append(", ");
                }
            temp = temp.nextNode;
        } while (temp != head);

        list.append("]");
        return list.toString();
    }

    public boolean hasNext(){
        return !isEmpty() && !hasMadeFirstIteration;
    }

    public T next(){
        T temp = pointer.data;
        pointer = pointer.nextNode;
        if(pointer == head) hasMadeFirstIteration = true;

        return temp;
    }

}
