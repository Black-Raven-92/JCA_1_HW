package JCA_HW_12_MulthyThreaing;

import java.sql.Array;
import java.util.Arrays;

public class MulthyThreading_1 {
    static final int SIZE=10000000;
    static final int HALF=SIZE/2;


    public static void main(String[] args) {
        doMath();
        multiDoMath();

    }
    public static void doMath(){
        float arr []=new float [SIZE];
        Arrays.fill(arr,1.0f);
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время выполнения одним потоком - " +(System.currentTimeMillis()-a)/1000+" секунд");
    }
    public static void multiDoMath(){
        float arr []=new float [SIZE];
        Arrays.fill(arr,1.0f);
        float arr1[]=new float[HALF];
        float arr2[]=new float[HALF];
        System.arraycopy(arr,0,arr1,0,HALF);
        System.arraycopy(arr,HALF,arr2,0,HALF);
        long a=System.currentTimeMillis();

        Thread t1=new Thread(()->{
            for (int i = 0; i < HALF; i++) {
                arr1[i]=arr[i]=(float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread t2=new Thread(()->{
            for (int i = 0; i < HALF; i++) {
                arr2[i]=arr[i]=(float)(arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
            t1.interrupt();
            t2.interrupt();
        }
        System.arraycopy(arr1,0,arr,0,HALF);
        System.arraycopy(arr2,0,arr,HALF,HALF);

        System.out.println("Время исполнения двумя потоками: "+(System.currentTimeMillis()-a)/1000+" секунд");
    }

}
