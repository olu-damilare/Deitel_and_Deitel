package chapterTwentyOne.supermarket;

import java.util.ArrayList;
import java.util.Random;

public class Supermarket {

    ArrayList<Integer> customerQueue = new ArrayList<Integer>();
    private int minutesPassed = 0;
    private int timeLimit = 720;
    private int waitingLimit = 4;
    private int maximumQueueLength = 0;

    public void serviceCustomer(){
        while(minutesPassed <= timeLimit) {
            int waitingTime = generateTime(waitingLimit);
            customerQueue.add(waitingTime);
            int serviceTime = generateTime(waitingLimit);
            customerQueue.set(0, customerQueue.get(0) - serviceTime);
            minutesPassed += serviceTime;

            if(customerQueue.size() > maximumQueueLength){
                maximumQueueLength = customerQueue.size();
            }

            if(customerQueue.get(0) <= 0){
                customerQueue.remove(0);
            }
        }
        System.out.println(customerQueue);
        System.out.println(maximumQueueLength);

    }

    private int generateTime(int boundary) {
        Random random = new Random();
        return 1 + random.nextInt(boundary);
    }

    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        supermarket.serviceCustomer();
    }
}
