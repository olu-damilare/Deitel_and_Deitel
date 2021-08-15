package chapterTwentyOne.supermarket;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Supermarket {
    Queue<Customer> line;

    public Supermarket() {
        line = new LinkedList<Customer>();
    }

    public void scheduleArrival(Customer customer){
        Random randomizer = new Random();
        int arrivalTime = 1 + randomizer.nextInt(4);
        customer.setArrivalTime(arrivalTime);
        line.offer(customer);
    }

    public void serviceCustomer() throws InterruptedException {
        if(!line.isEmpty()) {
            System.out.println("Customer is being serviced");
            Customer nextCustomer = line.poll();
            Thread.sleep(nextCustomer.getArrivalTime());
        }
    }
}
