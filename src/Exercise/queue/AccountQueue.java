package Exercise.queue;

import Exercise.queue.exceptions.QueueOverFlowException;
import Exercise.queue.exceptions.QueueUnderFlowException;
import chapterTwo.Account;

public class AccountQueue {
    private Account[] accounts;
    private int enqueueCounter;
    private int dequeueCounter;

    public AccountQueue(int sizeOfQueue) {
        accounts = new Account[sizeOfQueue];
    }

    public void enqueue(Account account) {
        if(isFull())
            throw new QueueOverFlowException("Cannot enqueue a full queue");
        accounts[enqueueCounter++] = account;
        }


    public Account peek() {
        if(isEmpty())
            throw new QueueUnderFlowException("Cannot peek an empty queue");
        return accounts[0];
    }

    public int getNumberOfAccountsInQueue() {
        return enqueueCounter;
    }

    public Account dequeue() {
        if(isEmpty())
            throw new QueueUnderFlowException("Cannot dequeue an empty queue");
        Account dequeuedAccount = accounts[0];
        for (int i = 0; i < accounts.length; i++) {
                  if(i + 1 != accounts.length && accounts[i + 1] != null)
                      accounts[i] = accounts[i + 1];
                  else if(accounts[i] == null)
                      accounts[i - 1] = null;
        }
        enqueueCounter--;
         return dequeuedAccount;
    }

    public boolean isEmpty() {
        return enqueueCounter == 0;
    }

    public int getSize() {
        return accounts.length;
    }

    public boolean isFull(){
        return enqueueCounter  == getSize();
    }
}
