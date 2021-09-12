package JCA_HW_6_OOP;

public class Dog extends Animal {
    static final int  MAX_DISTANCE_RUN=500;
    static final int MAX_DISTANCE_SWIM=10;
    private int Id;
    private static int index = 0;
    public Dog(String name, String color, String type)
    {
        super(name,color,"Dog");
        index++;
    }

    @Override
    public void run(int distance) {
        if (distance<=MAX_DISTANCE_RUN){
            System.out.printf("%s %s по имени %s пробежал %d метров!!!\n",color,type,name,distance);
        }else System.out.printf("%s %s по имени %s может пробежать только %d метров!!!\n",color,type,name,MAX_DISTANCE_RUN);
    }

    public  void swimming(int distance) {
        if(distance<=MAX_DISTANCE_SWIM) System.out.printf("%s %s по имени %s проплыл %s\n",color,type,name,distance);
        else System.out.printf("%s %s по имени %s может проплыть только %s метров\n",color,type,name,MAX_DISTANCE_SWIM);
    }
    public static int dogValue(){
        return index;
    }

}
