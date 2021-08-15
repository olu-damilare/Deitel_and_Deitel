package Exercise;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Concurrency implements Runnable{

    private String name;
    private int sleepTime;
    private SecureRandom randomizer = new SecureRandom();

    public Concurrency(String name) {
        this.name = name;
        sleepTime = randomizer.nextInt(10000);
    }

    @Override
    public void run() {
        System.out.println("task " + name + " is about to sleep for " + sleepTime + " milliseconds.");
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        System.out.println("task " + name + " is done sleeping");
    }


    public static void main(String[] args) {
        Concurrency  thread =  new Concurrency("test");
        Concurrency  secondThread =  new Concurrency("second test");

        System.out.println("This is the beginning of the multi-thread executions");
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(thread);
        service.execute(secondThread);

        service.shutdown();
        System.out.println("This is the end of the main method. Other threads still running.");
    }
}
