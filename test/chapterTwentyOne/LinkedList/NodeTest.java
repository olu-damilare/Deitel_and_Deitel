package chapterTwentyOne.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NodeTest {

    Node<Integer> previousNode;
    Node<Integer> node;

    @Test
    void testThatNodeLinksToAPreviousNode(){
         previousNode = new Node<Integer>(null, 10, node);
         node = new Node<Integer>(previousNode, 10, null);

         assertEquals(previousNode, node.previousNode);
    }

    @Test
    void testThatNodeLinksToANextNode(){
        Node<Integer> nextNode = new Node<Integer>(null, 10, node);
        node = new Node<Integer>(null, 10, nextNode);

        assertEquals(nextNode, node.nextNode);
    }

    @Test
    void testThatNodeHasData(){
        node = new Node(10);
        assertEquals(10, node.data);
    }
}
