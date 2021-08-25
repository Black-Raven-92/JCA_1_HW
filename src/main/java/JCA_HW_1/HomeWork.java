package JCA_HW_1;

import java.util.Scanner;

public class HomeWork {
    public static void main (String[] args){

        int a=10;
        byte b=1;
        short c=20;
        long d = 100000L;
        float e = 10.22331f;
        double g = 10.224455;
        char f = '#';
        boolean j = true;
        //Д_З п.2
        Scanner s1 = new Scanner(System.in);
        System.out.println("Веедите значения a,b,c,d");
        float a1 = s1.nextFloat();
        float b1 = s1.nextFloat();
        float c1 = s1.nextFloat();
        float d1 = s1.nextFloat();
        System.out.println(calculace(a1,b1,c1,d1));
        //ДЗ п.3
        System.out.println("Введите значения a и b");
        int a2 = s1.nextInt();
        int b2 = s1.nextInt();
        System.out.println(task10and20(a2, b2));
        //ДЗ п.4
        System.out.println("Введите положтелно либо отрицательное число");
        int a3 = s1.nextInt();
        positiveornegative(a3);
        //ДЗ п.5
        System.out.println("Ввеите число");
        int a4=s1.nextInt();
        System.out.println(negative(a4));
        //ДЗ п.6
        System.out.println("Введите Ваше имя");
        String name = s1.next();
        hello1(name);
        //ДЗ п7
        System.out.println("Введите год");
        int a5 = s1.nextInt();
        year(a5);
        //З п8*

    }

    public static float calculace (float a1, float b1, float c1, float d1){
       return a1*(b1+(c1/d1));
    }
    public static boolean task10and20(int a2, int b2){
        boolean chek;
        if (a2+b2>=10 && a2+b2<=20)
        {
            chek = true;
        }else
        {
            chek = false;
        }
        return chek;
    }
    public static void positiveornegative (int a3){
        if (a3>=0)
        {
            System.out.println("Число положительное");
        }else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean negative (int a4){
        boolean chek2;
        if(a4<0){
            chek2=true;
        }else{
            chek2=false;
        }
        return chek2;

    }
    public static void hello1 (String name){
        System.out.println("Привет " + name);
    }
    public static void year (int a5){
        if (a5 %100==0 && a5 %400==0)
        {
            System.out.println(a5 + " - Год високосный");
        }else if (a5%4==0 && a5%100>0){
            System.out.println(a5 + " - Год високосный");
        }else if (a5%100==0){
            System.out.println(a5 + " - Год не високосный");
        }else{
            System.out.println(a5 + " - Год не високосный");
        }

    }
}
