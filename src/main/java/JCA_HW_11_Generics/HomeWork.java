package JCA_HW_11_Generics;

import java.util.ArrayList;

public class HomeWork {
    public static void main(String[] args) {
        Apple Apple=new Apple(25);
        Apple Apple2=new Apple(10);
        Apple Apple3=new Apple(20);
        Apple Apple4=new Apple(20);
        Apple Apple5=new Apple(20);
        Orange Orange1=new Orange(25);
        Box<Apple> BoxApple = new Box<>();
        Box<Apple> BoxApple2 = new Box<>();
        Box<Orange> BoxOrange=new Box<>();
        BoxOrange.Add(Orange1);
        BoxApple.Add(Apple);
        BoxApple.Add(Apple2);
        BoxApple2.Add(Apple);
        BoxApple2.Add(Apple);
        System.out.println(BoxApple);
        System.out.println(BoxApple2);
        BoxApple.emptyTo(BoxApple2);
        System.out.println(BoxApple);
        System.out.println(BoxApple2);
        System.out.println(BoxApple.getSize());
        System.out.println(BoxApple.compare(BoxOrange));
        BoxApple.Add(Apple);
        BoxApple.Add(Apple2);
        System.out.println(BoxApple);
        System.out.println(BoxOrange);
        System.out.println(BoxApple.compare(BoxOrange));
        System.out.println(BoxApple2);
        BoxApple.emptyTo(BoxApple2);
        System.out.println(BoxApple);
        System.out.println(BoxApple2);
        BoxApple.compare(BoxOrange);
        String []Array= {"Коля","Вася","Петя","Жора"};
        invertIndex(Array);
        System.out.println(toArray(Array));

    }
    public static <T> void invertIndex(T[] array){
        T x=array[0];
        array[0]=array[array.length-1];
        array[array.length-1]=x;
        for (int  j= 0; j < array.length ; j++) {
            System.out.println(array[j]);

        }
    }
    public static <T>ArrayList toArray(T[]array){
        ArrayList<T> ArrList=new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            ArrList.add(array[i]);


        }
        return ArrList;

    }
}
