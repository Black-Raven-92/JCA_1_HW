package JCA_HW_13;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static final int CARS_COUNT = 4;
    private static ExecutorService exServ= Executors.newFixedThreadPool(CARS_COUNT);
    public static final AtomicInteger finish = new AtomicInteger(0);

    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        CyclicBarrier barrier = new CyclicBarrier(CARS_COUNT+1,()-> System.out.println("Гонка началась"));
        CountDownLatch cdl = new CountDownLatch(CARS_COUNT);
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10),barrier,cdl,finish);
        }
        for (int i = 0; i < cars.length; i++) {
            exServ.execute(cars[i]);
        }
        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
            exServ.shutdown();
        }
        for (Car car : cars) {
            System.out.println(car.getName() + " finish place: " + car.getFinishPlace());
        }
    }

    }


