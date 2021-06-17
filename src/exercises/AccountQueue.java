package exercises;

import chapterTwo.Account;
import exercises.exceptions.QueueOverFlowException;
import exercises.exceptions.QueueUnderFlowException;

public class AccountQueue {
    private Account[] accounts;
    private int enqueueCounter;
    private int dequeueCounter;

    public AccountQueue(int sizeOfQueue) {
        accounts = new Account[sizeOfQueue];
    }

    public void enqueue(Account account) {
        if(isFull()){
            throw new QueueOverFlowException("Cannot enqueue a full queue");
        }else if(isEmpty()){
            enqueueCounter = 0;
            dequeueCounter = 0;
        }
        accounts[enqueueCounter++] = account;
    }

    public Account peek() {
        if(isEmpty())
            throw new QueueUnderFlowException("Cannot peek an empty queue");
        return accounts[dequeueCounter];
    }

    public int getNumberOfAccountsInQueue() {
        return enqueueCounter - dequeueCounter;
    }

    public Account dequeue() {
        if(isEmpty())
            throw new QueueUnderFlowException("Cannot dequeue an empty queue");
        enqueueCounter--;
        return accounts[dequeueCounter++];
    }

    public boolean isEmpty() {
        return enqueueCounter - dequeueCounter == 0;
    }

    public int getSize() {
        return accounts.length;
    }

    public boolean isFull(){
        return enqueueCounter - dequeueCounter == 5;
    }
}
