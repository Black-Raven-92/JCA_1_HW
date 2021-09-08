package JCA_HW_5_OOP;

import com.sun.javaws.exceptions.CacheAccessException;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Home_work_OOP {
    public static void main(String[] args) {

        GregorianCalendar birthday = new GregorianCalendar(1992, 8, 8);
        Worker Worker1 = new Worker("Pupkin A.S.", "Cleaner", "pupkin@.ru", "+380954496025", 100f, 55);

        System.out.println();
        Worker[] arrayWorker = new Worker[5];

        arrayWorker[0] = new Worker("Stepin A.F.", "Egineer", "stepin@.ru", "+3800077744", 500f, 25);
        arrayWorker[1] = new Worker("Gusin K.S.", "Boss", "gusin22@ukr.net", "+3877444774", 10000f, 30);
        arrayWorker[2] = new Worker("Bukin G.G.", "Manager", "Bukin22@ukr.net", "+3877444774", 5000f, 55);
        arrayWorker[3] = new Worker("Grechka F.G.", "Financier", "Grechka21@ukr.net", "+380504471232", 6000f, 29);
        arrayWorker[4] = new Worker("Ivanov D.G.", "Mounter", "Ivanov1@ukr.net", "+38778885544", 8000f, 45, birthday);


        for (int i = 0; i < arrayWorker.length; i++) {
            if (arrayWorker[i].getAge() > 40) {
                arrayWorker[i].Print();
                System.out.println();

            }
        }
    }
}


