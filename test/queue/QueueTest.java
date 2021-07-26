package queue;

import chapterTwo.Account;
import Exercise.queue.exceptions.AccountQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Exercise.queue.exceptions.QueueOverFlowException;
import Exercise.queue.exceptions.QueueUnderFlowException;


import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    Account account;
    AccountQueue queue;

    @BeforeEach
    void setUp() {
        account = new Account("Olu Jola", 2000);
        queue = new AccountQueue(5);
    }

    @Test
    void testThatQueueCanEnqueueAccount(){
        assertEquals(0, queue.getNumberOfAccountsInQueue());
        queue.enqueue(account);
        assertEquals(1, queue.getNumberOfAccountsInQueue());
    }

    @Test
    void testThatEnqueuedAccountCanBePeeked(){
        queue.enqueue(account);
        assertEquals(1, queue.getNumberOfAccountsInQueue());
        assertEquals(account, queue.peek());
    }

    @Test
    void testThatEnqueueTwoAccountsDequeueOneAccountPeeksTheSecondAccountEnqueued(){
        Account secondAccount = new Account("Bin", 1234);

        queue.enqueue(account);
        queue.enqueue(secondAccount);
        assertEquals(2, queue.getNumberOfAccountsInQueue());

        assertSame(account, queue.dequeue());
        assertSame(secondAccount, queue.peek());
        assertEquals(1, queue.getNumberOfAccountsInQueue());
    }


    @Test
    void testThatAccountsAreDequeuedInOrderOfHowTheyAreEnqueued(){
        Account secondAccount = new Account("Bin", 1234);
        Account thirdAccount = new Account("Bin", 1234);
        Account fourthAccount = new Account("Bin", 1234);
        Account fifthAccount = new Account("Bin", 1234);
        queue.enqueue(account);
        queue.enqueue(secondAccount);
        queue.enqueue(thirdAccount);
        queue.enqueue(fourthAccount);
        queue.enqueue(fifthAccount);

        assertEquals(5, queue.getNumberOfAccountsInQueue());
        assertEquals(account, queue.dequeue());
        assertEquals(4, queue.getNumberOfAccountsInQueue());
        assertEquals(secondAccount, queue.dequeue());
        assertEquals(3, queue.getNumberOfAccountsInQueue());
        assertEquals(thirdAccount, queue.dequeue());
        assertEquals(2, queue.getNumberOfAccountsInQueue());
        assertEquals(fourthAccount, queue.dequeue());
        assertEquals(1, queue.getNumberOfAccountsInQueue());
        assertEquals(fifthAccount, queue.dequeue());
        assertEquals(0, queue.getNumberOfAccountsInQueue());

    }

    @Test
    void testThatPeekingAnEmptyQueue_throwsQueueUnderFlowException(){
        assertTrue(queue.isEmpty());
        assertThrows(QueueUnderFlowException.class, ()-> queue.peek());
    }

    @Test
    void testThatDequeueAnEmptyQueue_throwsQueueUnderFlowException(){
        assertTrue(queue.isEmpty());
        assertThrows(QueueUnderFlowException.class, ()-> queue.dequeue());
    }

    @Test
    void testThatEnqueuingAFullQueue_throwsQueueOverFlowException(){
        for (int i = 0; i < queue.getSize(); i++) {
            queue.enqueue(account);
        }
        assertEquals(5, queue.getNumberOfAccountsInQueue());
        assertEquals(5, queue.getSize());
        assertTrue(queue.isFull());
        assertThrows(QueueOverFlowException.class, ()-> queue.enqueue(account));
    }

    @Test
    void testToRepeatedlyEnqueueAndDequeueRepeatedly(){
        for (int i = 0; i < queue.getSize(); i++) {
            queue.enqueue(account);
        }
        assertEquals(5, queue.getNumberOfAccountsInQueue());
        queue.dequeue();
        assertEquals(4, queue.getNumberOfAccountsInQueue());
        queue.enqueue(account);
        assertEquals(5, queue.getNumberOfAccountsInQueue());

    }



}
