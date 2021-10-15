package JCA_HW_13;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private CyclicBarrier barrier;
    private CountDownLatch cdl;
    private String name;
    private AtomicInteger finish;
    private int finishPlace;

    public int getFinishPlace(){
        return finishPlace;
    }
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed, CyclicBarrier barrier, CountDownLatch cdl, AtomicInteger finish) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        this.barrier=barrier;
        this.cdl=cdl;
        this.finish=finish;
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            barrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        cdl.countDown();
        finishPlace=finish.incrementAndGet();
    }


}
