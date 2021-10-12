package ThreadTest;

import sun.awt.windows.ThemeReader;

public class Test {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        Thread t1=new Thread(()->{

            System.out.println("Поток два");
        });


        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Текущий поток " + t);
        t.setName("Мой поток");
        System.out.println("Поток сейас " + t );

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.interrupted();
                System.out.println("Главный поток завершен");
            }


        }
    }
}
