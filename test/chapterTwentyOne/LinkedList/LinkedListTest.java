package chapterTwentyOne.LinkedList;

import org.junit.jupiter.api.Test;

import javax.naming.directory.InvalidAttributeIdentifierException;

import static org.junit.jupiter.api.Assertions.*;


public class LinkedListTest {

    @Test
    void testThatListCanAddElementFromTheFront(){
        LinkedList<Integer> list = new LinkedList();
        assertTrue(list.isEmpty());
        assertEquals("[]", list.toString());
        list.addFromFront(10);
        assertFalse(list.isEmpty());
        assertEquals("[10]", list.toString());
    }

    @Test
    void testThatListCanAddElementFromTheBack(){
        LinkedList<Integer> list = new LinkedList<Integer>();
        assertTrue(list.isEmpty());
        assertEquals("[]", list.toString());
        list.addFromBack(10);
        assertFalse(list.isEmpty());
        assertEquals("[10]", list.toString());

    }

    @Test
    void testThatTheTailfAListCanBeReplacedByInsertingFromTheBack(){
        LinkedList<Integer> list = new LinkedList();
        assertTrue(list.isEmpty());

        list.addFromBack(10);
        assertFalse(list.isEmpty());
        assertEquals("[10]", list.toString());

        list.addFromBack(5);

        assertEquals("[10, 5]", list.toString());

    }

    @Test
    void testThatTheHeadOfAListCanBeReplacedByInsertingFromTheFront(){
        LinkedList<Integer> list = new LinkedList();
        assertTrue(list.isEmpty());

        list.addFromFront(10);
        assertFalse(list.isEmpty());
        assertEquals("[10]", list.toString());

        list.addFromFront(5);

        assertEquals("[5, 10]", list.toString());

    }

    @Test
    void testToRemoveDataFromTheFrontOfAList(){
        LinkedList<Integer> list = new LinkedList();
        assertTrue(list.isEmpty());

        list.addFromFront(10);
        list.addFromFront(5);
        assertEquals("[5, 10]", list.toString());

        Integer data = list.removeFromFront();
        assertEquals(5, data);
        assertEquals("[10]", list.toString());

        data = list.removeFromFront();
        assertEquals(10, data);
        assertEquals("[]", list.toString());
        assertTrue(list.isEmpty());

    }

    @Test
    void testToRemoveDataFromTheEndOfAList(){
        LinkedList<Integer> list = new LinkedList();
        assertTrue(list.isEmpty());

        list.addFromBack(10);

        list.addFromBack(5);
        assertEquals("[10, 5]", list.toString());

        Integer data = list.removeFromEnd();
        assertEquals(5, data);
        assertEquals("[10]", list.toString());

        data = list.removeFromEnd();
        assertEquals(10, data);
        assertEquals("[]", list.toString());
        assertTrue(list.isEmpty());
    }

    @Test
    void testToUpdateTheDataInANode(){
        LinkedList<Integer> list = new LinkedList();
        assertTrue(list.isEmpty());

        Node<Integer> first = list.addFromBack(10);
        Node<Integer> second = list.addFromBack(5);
        Node<Integer> third = list.addFromBack(12);
        Node<Integer> fourth = list.addFromBack(7);
        Node<Integer> fifth = list.addFromBack(8);

        assertEquals("[10, 5, 12, 7, 8]", list.toString());

        try {
            list.updateNode(third, 6);
        } catch (InvalidAttributeIdentifierException e) {
            e.printStackTrace();
        }
        assertEquals("[10, 5, 6, 7, 8]", list.toString());
    }

    @Test
    void testThatListContainsASpecificData(){
        LinkedList<Integer> list = new LinkedList();
        assertTrue(list.isEmpty());

        Node<Integer> first = list.addFromBack(10);
        Node<Integer> second = list.addFromBack(5);
        Node<Integer> third = list.addFromBack(12);
        Node<Integer> fourth = list.addFromBack(7);
        Node<Integer> fifth = list.addFromBack(8);

        assertTrue(list.isPresent(7));
    }

    @Test
    void testToRemoveASpecificNode(){
        LinkedList<Integer> list = new LinkedList();
        assertTrue(list.isEmpty());

        Node<Integer> first = list.addFromBack(10);
        Node<Integer> second = list.addFromBack(5);
        Node<Integer> third = list.addFromBack(12);
        Node<Integer> fourth = list.addFromBack(7);
        Node<Integer> fifth = list.addFromBack(8);

        assertEquals("[10, 5, 12, 7, 8]", list.toString());

        try {
            list.removeNode(third);
        } catch (InvalidAttributeIdentifierException e) {
            e.printStackTrace();
        }
        assertEquals("[10, 5, 7, 8]", list.toString());
    }

    @Test
    void testToInsertDataAfterASpecificNode(){
        LinkedList<Integer> list = new LinkedList();
        assertTrue(list.isEmpty());

        Node<Integer> first = list.addFromBack(10);
        Node<Integer> second = list.addFromBack(5);
        Node<Integer> third = list.addFromBack(12);
        Node<Integer> fourth = list.addFromBack(7);
        Node<Integer> fifth = list.addFromBack(8);

        assertEquals("[10, 5, 12, 7, 8]", list.toString());

        try {
            list.insertAfter(third, 9);
        } catch (InvalidAttributeIdentifierException e) {
            e.printStackTrace();
        }
        assertEquals("[10, 5, 12, 9, 7, 8]", list.toString());
    }


}
