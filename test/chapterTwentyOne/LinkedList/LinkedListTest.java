package chapterTwentyOne.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LinkedListTest {

    @Test
    void testThatListCanAddNodeFromTheFront(){
        LinkedList<Integer> list = new LinkedList();
        assertTrue(list.isEmpty());
        list.addFromFront(10);
        assertFalse(list.isEmpty());
    }

    @Test
    void testThatListCanAddNodeFromTheBack(){
            LinkedList<Integer> list = new LinkedList<Integer>();
            assertTrue(list.isEmpty());
            list.addFromBack(10);
            assertFalse(list.isEmpty());
    }

    @Test
    void testThatTheHeadOfAListCanBeReplacedByInsertingFromTheFront(){
        LinkedList<Integer> list = new LinkedList();
        assertTrue(list.isEmpty());

        list.addFromFront(10);
        assertFalse(list.isEmpty());

        list.addFromFront(5);
        assertEquals(5, list.getHead().data);
        assertEquals(10, list.getHead().nextNode.data);
    }
}
